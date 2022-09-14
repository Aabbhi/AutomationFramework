package AutomationFramework.UiAutomation;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sfailed {

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
	String filepath = "";
	//String inputFilePath = "C:\\Users\\Abhishek\\Desktop\\document\\";
	Screen s = new Screen();
  Pattern fileInputTextBox = new Pattern("C:\\Users\\Abhishek\\Desktop\\Eclipse project\\UiAutomation\\images\\1A.jpg");
 Pattern openButton = new Pattern("C:\\Users\\Abhishek\\Desktop\\Eclipse project\\UiAutomation\\images\\open.jpg");
 try {
	s.wait(fileInputTextBox, 20);
} catch (FindFailed e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	s.type(fileInputTextBox,"C:\\Users\\Abhishek\\Desktop\\document\\testing.docx");
} catch (FindFailed e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	s.click(openButton);
} catch (FindFailed e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.close();	
	}
}
