package testCore;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	public  void dothis() {
		System.out.println("I am here");

}
	@BeforeMethod
	public  void beforeRun() {
		System.out.println("I am here before run");

}
	@AfterMethod
	public  void afterRun() {
		System.out.println("I am here after Run");

}
}