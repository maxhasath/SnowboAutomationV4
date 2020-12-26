package ResortUser;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.UIActions;

public class PostTravelTest extends UIActions implements ProductElements{

	ResortLoginTest login;
	 WebDriverWait wait;
	String TravelTitleValue ="";
	By accoValue;
	
	
	@BeforeClass
	public void beforeTest() throws InterruptedException
	{
	        login = new ResortLoginTest();
	        //this.browser = login.browser;
	        this.wait = login.wait;
	        login.login_Resort();
	}
	
	
	@Test
	public void PostTravel() throws Exception {
		
		
		click(dropdown);
		click(ResortMyProfile);
		click(TravelTab);
		wait.until(ExpectedConditions.visibilityOf(locateElement(AddTravel)));
		click(AddTravel);
		waitForPageLoad();
		TravelTitleValue = getRandomValue();
		sendKeys(TravelTitle, TravelTitleValue);
		selectDropdown(JobCat,0);
		//selectDropdown(Accotype, 2);
		//sendKeys(Tags,"abcd");
		//click(TagValue);
		sendKeys(TavelApplyLink, "www.tours.com");
		sendKeys(AccoLocation, Constant.Location);
		sendKeys(StreetAddress, "ovel");
		sendKeys(Accosub, "adeled");
		sendKeys(state, "stateLess");
		
		sendKeys(TravelDuration, "3");
		sendKeys(TraveTourFrom, "2018-09-12");
		sendKeys(TraveTourTo, "2018-09-12");
		sendKeys(TravePrice, "300");
		selectDropdown(TraveCorrency,1);
		sendKeys(TraveDes, "3");
		sendKeys(TraveIncludes, "300");
		
		sendKeys(ImagePost, "C:\\\\Users\\\\iTelaSoft-User\\\\Downloads\\\\snowbo_images\\\\6.jpg");
		sendKeys(AccoVideo, "https://www.youtube.com/watch?v=VGPi1zWtdeA");
		click(SelectPlan);
		waitForPageLoad();
		click(freePlan);
		click(SaveAcco);
		waitForPageLoad();
		accoValue = getSelector(TravelTitleValue);
		assertTrue(elementExists(accoValue));
		click(TravelTab);
		waitForPageLoad();
		assertTrue(elementExists(accoValue));
		click(newsfeed);
		assertTrue(elementExists(accoValue));
		
		
		
	
		
		
	}
	
	
	
}
