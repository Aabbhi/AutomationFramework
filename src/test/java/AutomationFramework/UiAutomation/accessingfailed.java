package AutomationFramework.UiAutomation;

import java.awt.*;
import java.time.Duration;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import java.awt.event.KeyEvent;

public class accessingfailed {

	public static void main(String[] args) throws InterruptedException, AWTException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		     
		 WebDriver driver;
		
		driver=new ChromeDriver();
		        
			       
	   driver.get("https://demo.automationtesting.in/Register.html");
			        driver.manage().window().maximize();
			        Actions a=new Actions(driver);
	WebElement element1 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	element1.sendKeys("sljbsnj");
	WebElement element = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	element.sendKeys("akhbh");
	WebElement element2 = driver.findElement(By.xpath("//input[@id='imagesrc']"));
	a.moveToElement(element2).contextClick(element2);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", element2);
	Thread.sleep(10000);
	StringSelection s = new StringSelection("C:\\Users\\Abhishek\\Desktop\\document\\testing.docx");
    
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
    //identify element and click
   Robot r = new Robot();
//pressing enter
 r.keyPress(KeyEvent.VK_ENTER);
//   //releasing enter
r.keyRelease(KeyEvent.VK_ENTER);
 //pressing ctrl+v
   r.keyPress(KeyEvent.VK_CONTROL);
   r.keyPress(KeyEvent.VK_V);
   //releasing ctrl+v
   r.keyRelease(KeyEvent.VK_CONTROL);
   r.keyRelease(KeyEvent.VK_V);
   //pressing enter
   r.keyPress(KeyEvent.VK_ENTER);
   
   r.keyRelease(KeyEvent.VK_ENTER);
    }
}
