package TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class StatusUpdateTest extends UIActions implements ProductElements {
	
	BrowserSetup browser = new BrowserSetup();
	Constant constant = new Constant();
	LoginTest login;
	String postValue;
	
	
	WebDriverWait wait;
	
	@BeforeClass
	public void SetupBrowser()
	{
	         login = new LoginTest();
	        this.browser = login.browser;
	        this.wait = login.wait;
	}
	
	
	@Test
	public void statUpdate() throws Exception {
		
		
		login.login_MP10327();
		click(dropdown);
		click(myprofile);
		waitForPageLoad();
		assertTrue(elementExists(status));
		click(newsfeed);
		waitForPageLoad();
		assertTrue(elementExists(status));
		
		
		
		
		
		
	}
	
	
	
	
	

}
