package Listeners;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import AutomationFramework.UiAutomation.Utilities.ExtentReportManager;
import AutomationFramework.UiAutomation.Utilities.ExtentTestUtilities;
import AutomationFramework.UiAutomation.Utilities.ScreenShotUtility;

public class ListnerForTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult r) {
		// TODO Auto-generated method stub

		String s="";
		try {
			s = ScreenShotUtility.TakesScreenShot(r.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
ExtentReportManager.getTest().info("This test  "+Integer.toString(r.getStatus())+" pls check");
		
		ExtentReportManager.getTest().addScreenCaptureFromPath(s);
		ExtentReportManager.getTest().pass("passed");
	
	}

	@Override
	public void onTestFailure(ITestResult r) {
		// TODO Auto-generated method stub
		String s="";
		try {
			s = ScreenShotUtility.TakesScreenShot(r.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
ExtentReportManager.getTest().info("This test  "+Integer.toString(r.getStatus())+" pls check");
		
		ExtentReportManager.getTest().addScreenCaptureFromPath(s);
		ExtentReportManager.getTest().fail("failed");
	
	}

	@Override
	public void onTestSkipped(ITestResult r) {
		// TODO Auto-generated method stub
		String s="";
		try {
			s = ScreenShotUtility.TakesScreenShot(r.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
ExtentReportManager.getTest().info("This test  "+Integer.toString(r.getStatus())+" pls check");
		
		ExtentReportManager.getTest().addScreenCaptureFromPath(s);
		ExtentReportManager.getTest().fail("failed");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
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
