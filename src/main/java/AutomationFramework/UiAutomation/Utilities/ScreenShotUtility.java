package AutomationFramework.UiAutomation.Utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotUtility {
	
	private ScreenShotUtility() {}
	
	private static String dest1;
	
	public static String TakesScreenShot(String methodname) throws IOException
	{
		TakesScreenshot tkss=((TakesScreenshot)DriverManager.getDriver());
		File Srcfile=tkss.getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\Abhishek\\Desktop\\Eclipse project\\UiAutomation\\src\\test\\java\\OutPut\\"+methodname+".jpg");
		 dest1="C:\\Users\\Abhishek\\Desktop\\Eclipse project\\UiAutomation\\src\\test\\java\\OutPut\\"+methodname+".jpg";
		FileUtils.copyFile(Srcfile, dest);
		
		return dest1;
	}
	
	public static String getThePathOfScreenshot()
	{
		System.out.print(dest1);
		return dest1;
	}

}
