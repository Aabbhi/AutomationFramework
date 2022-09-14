package AutomationFramework.UiAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class TestSikuli {

	 public static void main(String[] args) throws FindFailed, AWTException  {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
//       String filepath = "C:\\Users\\Abhishek\\Desktop\\Eclipse project\\UiAutomation\\images\\";
       //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Desktop\\Eclipse project\\chromedriver.exe");
     // String inputFilePath = "C:\\Users\\Abhishek\\Desktop\\document\\";
//        Screen s = new Screen();
//        Pattern fileInputTextBox = new Pattern(filepath + "filePath.jpg");
//        Pattern openButton = new Pattern(filepath + "Open.jpg");
      WebDriver driver;
//
//	        // Open Chrome browser    
//	        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhishek\\Desktop\\Eclipse project\\chromed2\\geckodriver.exe");
			driver=new ChromeDriver();
//	        driver.get("http://demo.guru99.com/test/image_upload/index.php");
//
//	        // Click on Browse button and handle windows pop up using Sikuli
//	        driver.findElement(By.xpath(".//*[@id='photoimg']")).click();
//	        s.wait(fileInputTextBox, 20);
//        s.type(fileInputTextBox, inputFilePath + "Testing.docx");
//       s.click(openButton);
//
//	        // Close the browser
//	        driver.close();
	        
	        /////
	       
	        driver.get("https://demo.automationtesting.in/Register.html");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        // scroll to reach upload button
	        //JavascriptExecutor j = (JavascriptExecutor)driver;
	        //j.executeScript("scroll(0,500)");
	        // file path passed as parameter to StringSelection
	        //String inputFilePath = "C:\\Users\\Abhishek\\Desktop\\document\\";
	        //StringSelection s = new StringSelection("C:\\Users\\Abhishek\\Desktop\\document\\testing.docx");
	        // Clipboard copy
	       // Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	        //identify element and click
	        WebElement element1 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	        Actions a= new Actions(driver);
	        //WebElement element = driver.findElement(By.xpath("//input[@id='imagesrc']"));
	       
	        a.moveToElement(element1).sendKeys("Abhishek");
	        //JavascriptExecutor executor = (JavascriptExecutor)driver;
	        //executor.executeScript("arguments[0].click();", element);
	        
	        // Robot object creation
//	        Robot r = new Robot();
//	        //pressing enter
//	        r.keyPress(KeyEvent.VK_ENTER);
//	        //releasing enter
//	        r.keyRelease(KeyEvent.VK_ENTER);
//	        //pressing ctrl+v
//	        r.keyPress(KeyEvent.VK_CONTROL);
//	        r.keyPress(KeyEvent.VK_V);
//	        //releasing ctrl+v
//	        r.keyRelease(KeyEvent.VK_CONTROL);
//	        r.keyRelease(KeyEvent.VK_V);
//	        //pressing enter
//	        r.keyPress(KeyEvent.VK_ENTER);
//	        //releasing enter
//	        r.keyRelease(KeyEvent.VK_ENTER);
	     }

	    }

