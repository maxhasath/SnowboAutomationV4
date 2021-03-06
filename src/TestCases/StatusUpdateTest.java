package TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class StatusUpdateTest extends UIActions implements ProductElements {
	

	
	LoginTest login;
	String postValue;
	String randomValue = "";
	By postval;
	
	WebDriverWait wait;
	
	@BeforeClass
	public void SetupBrowser() throws InterruptedException
	{
	         login = new LoginTest();
	       
	        this.wait = login.wait;
	        login.login_MP10327();
	}
	
	
	@Test
	public void statusUpdate() throws Exception {
		
		
		
		click(dropdown);
		click(myprofile);
		waitForPageLoad();
		randomValue = getRandomValue();
		postval = getSelector(randomValue);
		sendKeys(Rstatus, randomValue);
		click(ResortStatusSend);
		waitForPageLoad();
		assertTrue(elementExists(postval));
		click(newsfeed);
		waitForPageLoad();
		assertTrue(elementExists(postval));
		
		
		
		
		
		
	}
	
	
	
	
	

}
