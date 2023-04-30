package testng1;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;
public class Day {
	
	@BeforeMethod
	public  void beforemethod() {

		System.out.println("beforeMethod execute");
	}
	@AfterMethod
	public  void aftermethod() {

		System.out.println("afterMethod execute");
	}
	
	@AfterSuite
	public  void aftersuite() {
		// TODO Auto-generated method stub

		System.out.println("execute last aftersuite");
	}
	
	@AfterTest
	public  void aftertest() {
		// TODO Auto-generated method stub

		System.out.println("execute aftertest");
	}
	
	
	
	
	// test12
	
	
@Test(groups= {"Smoke"})
	public  void demo() {
		// TODO Auto-generated method stub

		System.out.println("hi");
	}

@BeforeSuite
public  void beforesuite() {
	// TODO Auto-generated method stub

	System.out.println("beforesuite execute");
}

@Test
public  void demo2() {
	// TODO Auto-generated method stub

	System.out.println("bye");
	//Assert.assertTrue(false);
}



}
