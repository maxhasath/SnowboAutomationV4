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

public class PostDealTest extends UIActions implements ProductElements{

	ResortLoginTest login;
	 WebDriverWait wait;
	String DealTitleValue ="";
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
		click(DealsTab);
		wait.until(ExpectedConditions.visibilityOf(locateElement(AddDeal)));
		click(AddDeal);
		waitForPageLoad();
		DealTitleValue = getRandomValue();
		sendKeys(DealTitle, DealTitleValue);
		selectDropdown(DealCat,0);
		//selectDropdown(Accotype, 2);
		//sendKeys(Tags,"abcd");
		//click(TagValue);
		sendKeys(DealApplyLink, "www.tours.com");
		//sendKeys(AccoLocation, Constant.Location);
		sendKeys(StreetAddress, "ovel");
		
		sendKeys(state, "stateLess");
		
	
		sendKeys(DealDes, "3");
		sendKeys(DealIncludes, "300");
		
		sendKeys(ImagePost, "C:\\\\Users\\\\iTelaSoft-User\\\\Downloads\\\\snowbo_images\\\\6.jpg");
		sendKeys(AccoVideo, "https://www.youtube.com/watch?v=VGPi1zWtdeA");
		click(SelectPlan);
		waitForPageLoad();
		click(freePlan);
		click(SaveAcco);
		waitForPageLoad();
		accoValue = getSelector(DealTitleValue);
		assertTrue(elementExists(accoValue));
		click(DealsTab);
		waitForPageLoad();
		assertTrue(elementExists(accoValue));
		click(newsfeed);
		assertTrue(elementExists(accoValue));
		
		
		
	
		
		
	}
	
	
	

	
	
	
}
