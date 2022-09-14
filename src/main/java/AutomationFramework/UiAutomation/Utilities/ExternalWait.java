package AutomationFramework.UiAutomation.Utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExternalWait {
	
	private ExternalWait() {}
	
	
	public static void waitInternally() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.print("waiting for 10 sec");
	}
	
	public static void WebDriverWaitL(WebElement Element)
	{
		WebDriverWait wait= new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeSelected(Element));
	}
	
	public static void Fwait(WebElement Element)
	{
		FluentWait wait= new FluentWait(DriverManager.getDriver());
		wait.until(ExpectedConditions.elementToBeSelected(Element));
		wait.pollingEvery(Duration.ofSeconds(10, 0));
		wait.ignoring(NoSuchElementException.class);
	}
	


}
