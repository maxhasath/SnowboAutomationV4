package ResortUser;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.ProductElements;
import Framework.UIActions;
import TestCases.LoginTest;

public class ResortStatuesUpdateTest extends UIActions implements ProductElements{

	ResortLoginTest login;
	By postValue;
	String RandomStatus = "";
	
	
	WebDriverWait wait;
	
	@BeforeClass
	public void SetupBrowser() throws InterruptedException
	{
	         login = new ResortLoginTest();
	       
	        this.wait = login.wait;
	        login.login_Resort();
	}
	
	
	@Test
	public void statusUpdate() throws Exception {
		
		RandomStatus =getRandomValue();
		
		sendKeys(Rstatus,RandomStatus );
		click(ResortStatusSend);
		waitForPageLoad();
		postValue = getSelector(RandomStatus);
		assertTrue(elementExists(postValue));
		click(dropdown);
		
		click(ResortMyProfile);
		waitForPageLoad();
		assertTrue(elementExists(postValue));

		
		
		
		
		
		
	}
	
	
	
}
