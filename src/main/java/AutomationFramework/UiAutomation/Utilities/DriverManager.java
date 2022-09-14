package AutomationFramework.UiAutomation.Utilities;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
public static ThreadLocal<WebDriver> driver=new ThreadLocal<>();

public static void setDriver(WebDriver driver1)
{
	driver.set(driver1);
}

public static WebDriver getDriver()
{
	return driver.get();
}

public static void Flush()
{
	driver.remove();
}

}
