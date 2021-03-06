package TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class LogoutTest extends UIActions implements ProductElements{
	

	LoginTest login;

	
	
	WebDriverWait wait;
	
	@BeforeClass
	public void SetupBrowser() throws InterruptedException
	{
	        login = new LoginTest();
	        login.login_MP10327();
	        this.wait = login.wait;
	}
	
	
	@Test
	public void statUpdate() throws Exception {
		
		
		
		click(dropdown);
		click(logoutbtn2);
		waitForPageLoad();
		
		String url = geUrl(Howthesite);
		assertEquals(true, url.contains("https://snowbo.itelasoft.com.au/user/index"));
		
		
		
		
		
		
		
	}

}
