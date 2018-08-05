package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class InstructorSignUpTest extends UIActions implements ProductElements {
	
	//WebDriver driver;	
	BrowserSetup browser = new BrowserSetup();
	Constant constant = new Constant();
	
	WebDriverWait wait;
	
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
		sendKeys(Namefiled, "John");
		
		String Ename = randomAlphaNumeric(6, "abcdefghijklmnopqrstuvwxyz");
		sendKeys(Email, Ename+"@mailinator.com"); 
		sendKeys(password, "123456");
		
		click(Signupbtn);	
		
		wait.until(ExpectedConditions.visibilityOf(locateElement(heading)));
		String status = getText(heading);
		
		Assert.assertEquals(true,status.contains("SUCCESS"));
		
	}

}
