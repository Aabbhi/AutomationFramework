package AutomationFramework.UiAutomation.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Objects;

public class DriverUtilities {

	private DriverUtilities() {}
	
	private static WebDriver driver;
	
	
	public static void InitiateChromeDriver(String b) {
		
		String Browser=b;
		if(driver==null && Browser=="chrome") {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Desktop\\Eclipse project\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		//driver=new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhishek\\Desktop\\Eclipse project\\chromed2\\geckodriver.exe");
		driver=new ChromeDriver();
		DriverManager.setDriver(driver);
		System.out.print("setting the driver");
		}
		
		
		else {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhishek\\Desktop\\Eclipse project\\chromed2\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.print("setting the driver");
		DriverManager.setDriver(driver);
		}
		
		//return DriverManager.getDriver();
	}
	

	
public static void  CloseTheDriver() {
	
	DriverManager.getDriver().quit();
	DriverManager.Flush();
	
	}

}
