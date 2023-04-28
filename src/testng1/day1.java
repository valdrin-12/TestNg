package testng1;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;
public class day1 {
@Test(groups= {"Smoke"})
	public  void demo() {
		// TODO Auto-generated method stub

		System.out.println("good");
	}
@BeforeTest
public  void firsttest() {
	// TODO Auto-generated method stub

	System.out.println("first test execute");
}


}
