package ResortUser;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.ProductElements;
import Framework.UIActions;
import TestCases.LoginTest;

public class ResortLogoutTest extends UIActions implements ProductElements {

	ResortLoginTest login;

	
	
	WebDriverWait wait;
	
	@BeforeClass
	public void SetupBrowser() throws InterruptedException
	{
	        login = new ResortLoginTest();
	        login.login_Resort();
	        this.wait = login.wait;
	}
	
	
	@Test
	public void statUpdate() throws Exception {
		
		
		
		click(dropdown);
		click(ResortLogOut);
		waitForPageLoad();
		
		String url = geUrl(Howthesite);
		assertEquals(true, url.contains("https://snowbo.itelasoft.com.au/user/index"));
		
		
		
		
		
		
		
	}
	
	
}
