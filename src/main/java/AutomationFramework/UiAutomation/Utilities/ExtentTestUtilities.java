package AutomationFramework.UiAutomation.Utilities;

import java.lang.reflect.Method;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTestUtilities {

	private ExtentTestUtilities() {}
	
	private static ExtentTest test1;
	private static ExtentReports extentReport;
	 
	public static void InitiateReport()
	{
		extentReport=new ExtentReports();
		System.out.print("test report");
		ExtentSparkReporter extentSpark= new ExtentSparkReporter("target/a.html");
		extentSpark.config().setReportName("Abhitest");
		extentReport.attachReporter(extentSpark);
	}
	public synchronized static void InitiateTest(String method)
	{
		test1=extentReport.createTest(method);
		System.out.print("test created");
		ExtentReportManager.setTest(test1);
		
		System.out.print(ExtentReportManager.getInstance());
		
	
	}
	public static void teardownFlush()
	{
		System.out.print("test flushed");
		
		
		extentReport.flush();
		
	
		
	
	}
	public static void remove1()
	{
		extentReport.removeTest(test1);
		
	
		
	
	}
	/*
	public static void logthedetails(ITestResult r)
	{
		String destination=ScreenShotUtility.getThePathOfScreenshot();
		if(r.getStatus()==ITestResult.FAILURE)
		{
		ExtentReportManager.getTest().info("This test  "+Integer.toString(r.getStatus())+" pls check");
		
		ExtentReportManager.getTest().addScreenCaptureFromPath(destination);
		ExtentReportManager.getTest().fail("failed");
		
		}
		else
		{
			ExtentReportManager.getTest().info("This test is "+Integer.toString(r.getStatus())+" pls check");
			ExtentReportManager.getTest().addScreenCaptureFromPath(destination);
			ExtentReportManager.getTest().pass("passed");
		}
			
		ExtentReportManager.TearDown();
	
	}*/
}

