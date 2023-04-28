package testng1;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;
public class day3 {
@Test
	public  void WebLoginHome() {
		// TODO Auto-generated method stub

		System.out.println("webloginHome");
	}
@Test
public  void MobileLoginHome() {
	// TODO Auto-generated method stub

	System.out.println("MobileLoginHome");
}
@Test(timeOut=4000)
public  void ApiLoginHome() {
	// TODO Auto-generated method stub

	System.out.println("ApiLoginHome");
}


}

