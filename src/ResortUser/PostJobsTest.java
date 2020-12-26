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

public class PostJobsTest extends UIActions implements ProductElements{


	ResortLoginTest login;
	 WebDriverWait wait;
	String JobTitle ="";
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
	public void PostJobs() throws Exception {
		
		
		click(dropdown);
		click(ResortMyProfile);
		click(jobsTab);
		wait.until(ExpectedConditions.visibilityOf(locateElement(AddJobs)));
		click(AddJobs);
		waitForPageLoad();
		JobTitle = getRandomValue();
		sendKeys(jobsTitle, JobTitle);
		selectDropdown(JobCat, 1);
		selectDropdown(jobtype, 0);
		sendKeys(Tags,"abcd");
		click(TagValuejobs);
		sendKeys(jobApplyLink, "ewfwefwef");
		sendKeys(address, Constant.Location);
		sendKeys(streetAddress, "ovel");
		sendKeys(suburb, "adeled");
		sendKeys(StateOrProvince, "stateLess");
		sendKeys(JobStartDate, "2018-09-13");
		sendKeys(JobEnd, "2018-09-29");
		sendKeys(ApplicationOpen, "2018-10-13");
		sendKeys(ApplicationClose, "2018-12-13");
		click(SinglepostJob);
		sendKeys(JobHideDate, "2018-10-13");
		sendKeys(Pay, "1000");
		selectDropdown(PayType, 1);
		selectDropdown(currency, 1);
		sendKeys(JobDescription, "op");
		sendKeys(JobIncludes, "op");
		
		sendKeys(ImagePost, "C:\\\\Users\\\\iTelaSoft-User\\\\Downloads\\\\snowbo_images\\\\6.jpg");
		sendKeys(VideoLink, "https://www.youtube.com/watch?v=VGPi1zWtdeA");
		click(SelectPlan);
		waitForPageLoad();
		click(freePlan);
		click(SaveAcco);
		waitForPageLoad();
		accoValue = getSelector(JobTitle);
		assertTrue(elementExists(accoValue));
		click(jobsTab);
		waitForPageLoad();
		assertTrue(elementExists(accoValue));
		click(newsfeed);
		assertTrue(elementExists(accoValue));
		
		
		
		
		
		
	}
	
	
	
	
}
