package testng1;
import org.testng.ISuite;
import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {



@Override

public void onTestStart(ITestResult result) {

// TODO Auto-generated method stub

//System.out.println("On Testcase execution:"+result.getName());

}



@Override

public void onTestSuccess(ITestResult result) {

// TODO Auto-generated method stub

//System.out.println("I successfully executed lister code");

//System.out.println("Pass Test cases:"+result.getName());

}



@Override

public void onTestFailure(ITestResult result) {

// TODO Auto-generated method stub

//screenshot code

//response if API failed
	System.out.println("I failed executed lister code"+result.getName());

//System.out.println("I failed executed lister code"+result.getName());

}



@Override

public void onTestSkipped(ITestResult result) {

// TODO Auto-generated method stub

}



@Override

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

// TODO Auto-generated method stub

}



@Override

public void onStart(ITestContext context) {

// TODO Auto-generated method stub

}



@Override

public void onFinish(ITestContext context) {

// TODO Auto-generated method stub

}



}