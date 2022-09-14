package Pages;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import AutomationFramework.UiAutomation.Utilities.DriverManager;
import AutomationFramework.UiAutomation.Utilities.ElementAccessUtilities;

public class Flipkart {

	
	public static void AccessTheFashion() throws InterruptedException
	{
		Set<String> windows=DriverManager.getDriver().getWindowHandles();
		System.out.print(windows);
		DriverManager.getDriver().manage().window().maximize();
		String cross="//button[@class='_2KpZ6l _2doB4z']";
	WebElement cross1=ElementAccessUtilities.findElementByXpath(cross);
	cross1.click();
		
		
		Actions a=new Actions(DriverManager.getDriver());
		String fashionXpath="//div[@class='xtXmba'][contains(text(),'Fashion')]";
		String ens="//a[@class='_6WOcW9 _2-k99T']";
	
		WebElement fashion=ElementAccessUtilities.findElementByXpath(fashionXpath);
	

		a.moveToElement(fashion).build().perform();
		Thread.sleep(10000);
		WebElement mens=ElementAccessUtilities.findElementByXpath(ens);
		Thread.sleep(10000);
	mens.click();
	Thread.sleep(10000);
		
	}
}
