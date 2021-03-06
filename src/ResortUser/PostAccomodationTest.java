package ResortUser;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.UIActions;
import TestCases.LoginTest;

public class PostAccomodationTest extends UIActions implements ProductElements {
	
	ResortLoginTest login;
	 WebDriverWait wait;
	String accomodationTitle ="";
	By accoValue;
	
	
	@BeforeClass
	public void SetupBrowser() throws InterruptedException
	{
	        login = new ResortLoginTest();
	        //this.browser = login.browser;
	        this.wait = login.wait;
	        login.login_Resort();
	}
	
	
	@Test
	public void addAccommodation() throws Exception {
		
		
		click(dropdown);
		click(ResortMyProfile);
		click(Accotab);
		wait.until(ExpectedConditions.visibilityOf(locateElement(AddAcco)));
		click(AddAcco);
		waitForPageLoad();
		accomodationTitle = getRandomValue();
		sendKeys(AccoTitle, accomodationTitle);
		selectDropdown(AccoCategory, 2);
		selectDropdown(Accotype, 2);
		sendKeys(Tags,"abcd");
		click(TagValue);
		sendKeys(Booklink, "ewfwefwef");
		sendKeys(AccoLocation, Constant.Location);
		sendKeys(StreetAddress, "ovel");
		sendKeys(Accosub, "adeled");
		sendKeys(state, "stateLess");
		sendKeys(AccoDes, "des");
		sendKeys(AccoIncludes, "ink");
		sendKeys(AccoOptions, "op");
		sendKeys(ImagePost, "C:\\\\Users\\\\iTelaSoft-User\\\\Downloads\\\\snowbo_images\\\\6.jpg");
		sendKeys(AccoVideo, "https://www.youtube.com/watch?v=VGPi1zWtdeA");
		click(SelectPlan);
		waitForPageLoad();
		click(freePlan);
		click(SaveAcco);
		waitForPageLoad();
		accoValue = getSelector(accomodationTitle);
		assertTrue(elementExists(accoValue));
		click(Accotab);
		waitForPageLoad();
		assertTrue(elementExists(accoValue));
		click(newsfeed);
		assertTrue(elementExists(accoValue));
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
