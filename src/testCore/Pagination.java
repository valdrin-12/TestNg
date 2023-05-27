package testCore;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {
    @Test
    public void PaginationHandling() throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
    	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

    	WebDriver driver = new ChromeDriver();

        driver.get("https://datatables.net/examples/advanced_init/dt_events");

        List<WebElement> namesElements = driver.findElements(By.cssSelector("#example >tbody >tr >td:nth-child(1)"));
        List<String> names = new ArrayList<String>();
        for (WebElement namesElement : namesElements) {
            names.add(namesElement.getText());
        }

        String nextButton = driver.findElement(By.id("example_next")).getAttribute("class");
        while (!nextButton.contains("disabled")) {
            driver.findElement(By.id("example_next")).click();
            namesElements = driver.findElements(By.cssSelector("#example >tbody >tr >td:nth-child(1)"));
            for (WebElement namesElement : namesElements) {
                names.add(namesElement.getText());
            }
            nextButton = driver.findElement(By.id("example_next")).getAttribute("class");
        }

        for (String name : names) {
            System.out.println(name);
        }

        int totalNames = names.size();
        System.out.println("Total numbers: " + totalNames);

        String displayCount = driver.findElement(By.id("example_info")).getText().split(" ")[5];
        System.out.println("Total number of displayed numbers: " + displayCount);

        Assert.assertEquals(displayCount, String.valueOf(totalNames));

        Thread.sleep(3000);
        driver.quit();
    }
}
