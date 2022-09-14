package Pages;

import org.openqa.selenium.WebElement;

import AutomationFramework.UiAutomation.Utilities.ElementAccessUtilities;

public class OrangeLoginPage {

	public OrangeLoginPage()
	{
		
	}
	
	/*static String password="//input[@class='oxd-input oxd-input--active'][@name='password']";
    static String login="//button[@type='submit']";
    static String pim="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']";
    
    */
	WebElement userName1;
	String userName="//input[@id='search']";
    public  void loginPage(String UserName, String pass) {
    	 //userName1=ElementAccessUtilities.findElementByXpath(userName);
        //WebElement passwrd=ElementAccessUtilities.findElementByXpath(password);
    	//userName1.sendKeys(UserName);
    	
    	//passwrd.sendKeys(pass);
    	System.out.print("called the method loginPage");
    }
    
    public  boolean verifyThelogin() {
    	WebElement SearchButton=ElementAccessUtilities.findElementByXpath(userName);
    	///loginButton.click();
    	//WebElement pim1=ElementAccessUtilities.findElementByXpath(pim);
    	System.out.print("called the method verifyloginPage");
    	return SearchButton.isDisplayed();
    	
    }

}
