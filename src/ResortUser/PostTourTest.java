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

public class PostTourTest extends UIActions implements ProductElements {
	
	ResortLoginTest login;
	 WebDriverWait wait;
	String TourTitleValue ="";
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
	public void PostTours() throws Exception {
		
		
		click(dropdown);
		click(ResortMyProfile);
		click(ToursTab);
		wait.until(ExpectedConditions.visibilityOf(locateElement(AddTour)));
		click(AddTour);
		waitForPageLoad();
		TourTitleValue = getRandomValue();
		sendKeys(TourTitle, TourTitleValue);
		selectDropdown(JobCat,1);
		//selectDropdown(Accotype, 2);
		//sendKeys(Tags,"abcd");
		//click(TagValue);
		sendKeys(TourApplyNow, "www.tours.com");
		sendKeys(AccoLocation, Constant.Location);
		sendKeys(StreetAddress, "ovel");
		sendKeys(Accosub, "adeled");
		sendKeys(state, "stateLess");
		sendKeys(TourPrice, "300");
		sendKeys(TourDuration, "3");
		selectDropdown(Corrency,1);
		sendKeys(TourFrom, "2018-09-12");
		sendKeys(TourTo, "2018-09-12");
		sendKeys(TourIncludes, "300");
		sendKeys(TourDes, "3");
		sendKeys(ImagePost, "C:\\\\Users\\\\iTelaSoft-User\\\\Downloads\\\\snowbo_images\\\\6.jpg");
		sendKeys(AccoVideo, "https://www.youtube.com/watch?v=VGPi1zWtdeA");
		click(SelectPlan);
		waitForPageLoad();
		click(freePlan);
		click(SaveAcco);
		waitForPageLoad();
		accoValue = getSelector(TourTitleValue);
		assertTrue(elementExists(accoValue));
		click(ToursTab);
		waitForPageLoad();
		assertTrue(elementExists(accoValue));
		click(newsfeed);
		assertTrue(elementExists(accoValue));
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
