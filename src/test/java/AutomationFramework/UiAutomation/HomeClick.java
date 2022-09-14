package AutomationFramework.UiAutomation;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import AutomationFramework.UiAutomation.Utilities.ElementAccessUtilities;

public class HomeClick {

	public static void main(String[] args) throws InterruptedException, AWTException, FindFailed  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		     
		 WebDriver driver;
		
		driver=new ChromeDriver();
		        
			       
	   driver.get("https://www.flipkart.com/");
			       
//			        String cross="//button[@class='_2KpZ6l _2doB4z']";
//			    	WebElement cross1=driver.findElement(By.xpath(cross));
//			    	cross1.click();
//			    	 driver.manage().window().maximize();
			        Screen s = new Screen();
			        Pattern flip = new Pattern("C:\\Users\\Abhishek\\Desktop\\document\\img\\h.jpg");
			        //s.wait(10000);
			        s.click(flip);
			        
	}
}
