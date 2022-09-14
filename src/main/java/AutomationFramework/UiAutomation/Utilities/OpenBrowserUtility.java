package AutomationFramework.UiAutomation.Utilities;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class OpenBrowserUtility {
	
	private OpenBrowserUtility() {}
	
	public static void openUrl() throws IOException, InterruptedException
	{
		String url=ReadThePropertyFile.ReadThePropertyFile();
		//DriverUtilities.InitiateChromeDriver();
		DriverManager.getDriver().get(url);
		Thread.sleep(100);
		System.out.print("opening the url");
		
		
		
		
		//DriverUtilities.InitiatefirefoxDriver().get(url);
	}
	
	public static void openUrlFirefox() throws IOException, InterruptedException
	{
		String url1=ReadThePropertyFile.ReadThePropertyFile();
		//DriverUtilities.InitiateChromeDriver();
		DriverManager.getDriver().get(url1);
		Thread.sleep(100);
		System.out.print("opening the url");
		
		
		
		
		//DriverUtilities.InitiatefirefoxDriver().get(url);
	}

}
