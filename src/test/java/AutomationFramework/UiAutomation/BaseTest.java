package AutomationFramework.UiAutomation;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.DriverManager;

import org.junit.AfterClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import AutomationFramework.UiAutomation.Utilities.DriverUtilities;
import AutomationFramework.UiAutomation.Utilities.ExtentReportManager;
import AutomationFramework.UiAutomation.Utilities.ExtentTestUtilities;
import AutomationFramework.UiAutomation.Utilities.ExternalWait;
import AutomationFramework.UiAutomation.Utilities.OpenBrowserUtility;
import AutomationFramework.UiAutomation.Utilities.ScreenShotUtility;
import Pages.OrangeLoginPage;
import freemarker.log.Logger;

public class BaseTest {

	
	@BeforeSuite
	public void beforeSuit()
	{
		ExtentTestUtilities.InitiateReport();
		
	}
	
	@BeforeMethod
	public void BeforeMethodtests(Method m,ITestResult r) throws IOException, InterruptedException {
		
		ExtentTestUtilities.InitiateTest(m.getName());
		System.out.print("before method");
		System.out.print(m.getName());

		
	}
	
	@AfterMethod
	public void AfterMethodTest(Method m ,ITestResult r) throws IOException {
		/*
		ExtentReportManager.getTest().info("This test is "+Integer.toString(r.getStatus())+" pls check");
		//;
		ExtentReportManager.getTest().info(Integer.toString(r.getStatus()));
		DriverUtilities.CloseTheDriver();
		*/
		String s=ScreenShotUtility.getThePathOfScreenshot();
		//ExtentReportManager.getTest().addScreenCaptureFromPath(s);
		System.out.print("after method");
		DriverUtilities.CloseTheDriver();
		
	
		
		
		
		
	}
	@AfterSuite
	public static void Aftersuit() {
		 //OrangeLoginPage op=new OrangeLoginPage();
		ExtentTestUtilities.teardownFlush();
		ExtentTestUtilities.remove1();
	}
}
