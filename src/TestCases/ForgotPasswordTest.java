package TestCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class ForgotPasswordTest extends UIActions implements ProductElements {
	
	BrowserSetup browser = new BrowserSetup();
	
	WebDriverWait wait;
	
	@BeforeClass
	public void SetupBrowser()
	{
	        browser.Browser();
	        wait = new WebDriverWait(driver, 30);
	}
	
	@Test
	public void forgotPassword()
	{
		waitForPageLoad();
		wait.until(ExpectedConditions.visibilityOf(locateElement(NewsLetter)));
        click(NewsLetterClose);
        
        click(LoginEmail);
        click(forgotPassLink);
        //sendKeys(, input);
       
        
	}

}
