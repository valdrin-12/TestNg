package testng1;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;
public class day2 {
	@BeforeClass public  void beforeclass() {

		System.out.println("beforeClass execute");
	}
	
	@AfterClass public  void aftereclass() {

		System.out.println("after  reClass execute");
	}
	@BeforeMethod
	public  void beforemethod() {

		System.out.println("beforeMethod execute");
	}
	@AfterMethod
	public  void aftermethod() {

		System.out.println("afterMethod execute");
	}
	
@Test(groups= {"Smoke"})
	public  void WebLogin() {
		// TODO Auto-generated method stub

		System.out.println("weblogin");
	}
@Test(dependsOnMethods= {"WebLogin"})
public  void MobileLogin() {
	// TODO Auto-generated method stub

	System.out.println("MobileLogin");
}
@Parameters({"URL"})
@Test
public  void MobileLogin1(String urlname) {
	// TODO Auto-generated method stub

	System.out.println("MobileLogin1");
	System.out.println(urlname);

}@Test
public  void MobileLogin2() {
	// TODO Auto-generated method stub

	System.out.println("MobileLogin2");
	Assert.assertTrue(false);

}
@Test
public  void MobileLogin3() {
	// TODO Auto-generated method stub
// 
	System.out.println("MobileLogin3");
}
@Test(dataProvider="getData")
public  void ApiLogin(String username,String password) {
	//

	System.out.println("ApiLogin");
	System.out.println(username);
	System.out.println(password);


	
}
@DataProvider
public  Object[][] getData() {
	// 1 combination
	//second combination
	//third combination
	Object[][] data=new Object[3][2];
	//first combination
	data[0][0] ="firstusername";
	data[0][1] ="firstpassword";
	//second
	data[1][0] ="secondusername";
	data[1][1] ="secondpassword";
	//third
		data[2][0] ="thirdusername";
		data[2][1] ="thirdpassword";
		return data;
}

}
