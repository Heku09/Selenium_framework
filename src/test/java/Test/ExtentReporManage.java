package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporManage implements ITestListener{
	
	public ExtentSparkReporter sparkRepoter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	public void onStart(ITestContext context) {
		sparkRepoter=new ExtentSparkReporter("C:\\Automation25\\Workspace1");
		sparkRepoter.config().setDocumentTitle("06_03_26_report");
		sparkRepoter.config().setReportName("login_test");
		sparkRepoter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkRepoter);
		
		extent.setSystemInfo("computer", "local");
		extent.setSystemInfo("QA", "Heku");
		extent.setSystemInfo("browser", "chrome");
		
	}
	
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Test is passed"+ result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "test is failed" +result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "test is Skipped" +result.getName());
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
