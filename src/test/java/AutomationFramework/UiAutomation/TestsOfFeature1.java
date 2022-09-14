package AutomationFramework.UiAutomation;

import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import AutomationFramework.UiAutomation.Utilities.DriverUtilities;
import AutomationFramework.UiAutomation.Utilities.ExcessExcel;
import AutomationFramework.UiAutomation.Utilities.ExtentTestUtilities;
import AutomationFramework.UiAutomation.Utilities.OpenBrowserUtility;
import AutomationFramework.UiAutomation.Utilities.RetryFailedTest;
import Pages.Fileuploadpages;
import Pages.Flipkart;
import Pages.OrangeLoginPage;
import junit.framework.Assert;

public class TestsOfFeature1 extends BaseTest {

	public static OrangeLoginPage op=new OrangeLoginPage();
	public static Flipkart fl=new Flipkart();
	public static Fileuploadpages fileupload;
	
	//@Test(dataProvider="abc",dataProviderClass=ExcessExcel.class)
	public void FirstTest() throws IOException, FindFailed, InterruptedException
	{
		DriverUtilities.InitiateChromeDriver("chrome");
		OpenBrowserUtility.openUrl();
		fileupload=new Fileuploadpages();
		//fileupload.openDownloadpage();
	}
	
	
	
	@Test(dataProvider="abc",dataProviderClass=ExcessExcel.class)
	public  void FlipTest(String a,String b,String c) throws IOException, InterruptedException 
	{
		DriverUtilities.InitiateChromeDriver("chrome");
		OpenBrowserUtility.openUrl();
		fl.AccessTheFashion();
		
		
		
	}
	
	
	//@Test
	public  void TestThelogin() throws IOException, InterruptedException
	{
		DriverUtilities.InitiateChromeDriver("chrome");
		OpenBrowserUtility.openUrl();
		op.loginPage("Admin", "admin123");
		boolean a=op.verifyThelogin();
		System.out.print(a);
		SoftAssert a1= new SoftAssert();
		a1.assertEquals(a, true);
		a1.assertAll();
		
		
	}
	
	//@Test(retryAnalyzer=RetryFailedTest.class)
	public  void TestTheloginF() throws IOException, InterruptedException
	{
		DriverUtilities.InitiateChromeDriver("firefox");
		OpenBrowserUtility.openUrlFirefox();;
		op.loginPage("Admin", "admin123");
		boolean a=op.verifyThelogin();
		System.out.print(a);
		SoftAssert a1= new SoftAssert();
		a1.assertEquals(a, 2);
		a1.assertAll();
		
		
		
		
	}
}
