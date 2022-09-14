package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;

import AutomationFramework.UiAutomation.Utilities.DriverManager;
import AutomationFramework.UiAutomation.Utilities.ElementAccessUtilities;
import AutomationFramework.UiAutomation.Utilities.UploadFile;

public class Fileuploadpages {
	
	public Fileuploadpages()
	{
		
	}
	public void openDownloadpage() throws FindFailed, InterruptedException
	{
		String xpathForBrowse="//div[@class='_3255a-uploadButton']";
		Actions a= new Actions(DriverManager.getDriver());
		WebElement browseclick=ElementAccessUtilities.findElementByXpath(xpathForBrowse);
		Thread.sleep(10000);
		a.moveToElement(browseclick).build().perform();
		browseclick.click();
		UploadFile.uploadFileToPage();
	}

}
