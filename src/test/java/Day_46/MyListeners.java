package Day_46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {
	
	public void onStart(ITestContext context) {
	    System.out.println("Before Start of all test");
	  }
	
	public void onTestStart(ITestResult result) {
		System.out.println("Before start of each and every test");

	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success Test");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Failure Test");
		}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped Test");
		}

	public void onFinish(ITestContext context) {
		System.out.println("Close");
		}
}
