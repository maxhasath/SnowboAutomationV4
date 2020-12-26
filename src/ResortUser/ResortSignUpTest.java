package ResortUser;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class ResortSignUpTest extends UIActions implements ProductElements{

	BrowserSetup browser = new BrowserSetup();
	Constant constant = new Constant();
	
	WebDriverWait wait;
	String Ename ="";
	
	@BeforeClass
	public void SetupBrowser()
	{
	        browser.Browser();
	        wait = new WebDriverWait(driver, 30);
	}
	
	
	@Test
	public void Signup()
	{	
		
		
		
		waitForPageLoad();
		wait.until(ExpectedConditions.visibilityOf(locateElement(NewsLetter)));
        click(NewsLetterClose);
        
        click(LoginEmail);
        
		click(Signup);
		
		click(BusinessUserTab);
		Ename = randomAlphaNumeric(6, "abcdefghijklmnopqrstuvwxyz");
		sendKeys(Fullname, Ename);
		
		
		sendKeys(Bemail, Ename+"@mailinator.com"); 
		sendKeys(password, "123456");
		sendKeys(Bname, "roxy");
		
		selectDropdown(Bcagetogy, 2);
		
		click(SignUpBtn);	
		
		wait.until(ExpectedConditions.visibilityOf(locateElement(heading)));
		String status = getText(heading);
		
		Assert.assertEquals(true,status.contains("SUCCESS"));
		
	}
	
	
}
