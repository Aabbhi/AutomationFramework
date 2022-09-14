package AutomationFramework.UiAutomation.Utilities;

import com.aventstack.extentreports.ExtentTest;

public class ExtentReportManager {
	
	private static ExtentReportManager instance= new ExtentReportManager();
	
	 public static ExtentReportManager getInstance() {
		 return instance;
	 }
public static ThreadLocal<ExtentTest>  extest=new ThreadLocal<>();

public static void setTest(ExtentTest testx)
{
extest.set(testx);
}

public static ExtentTest getTest()
{
return extest.get();
}




}
