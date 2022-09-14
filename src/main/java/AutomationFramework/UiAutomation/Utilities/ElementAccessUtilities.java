package AutomationFramework.UiAutomation.Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class ElementAccessUtilities {

	private ElementAccessUtilities() {}
	
public static WebElement findElementByXpath(String xpathE) {
		
		WebElement e=DriverManager.getDriver().findElement(By.xpath(xpathE));
		System.out.print("find the element");
		return e;
		
	}
public static List<WebElement> findElementsByXpath(String xpathE) {
		
		List<WebElement> e=DriverManager.getDriver().findElements(By.xpath(xpathE));
		return e;
		
	}
	
	
	
}
