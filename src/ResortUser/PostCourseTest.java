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

public class PostCourseTest extends UIActions implements ProductElements{
	
	
	ResortLoginTest login;
	 WebDriverWait wait;
	String courseTitle1 ="";
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
	public void addCourse() throws Exception {
		
		
		click(dropdown);
		click(ResortMyProfile);
		click(courseTab);
		wait.until(ExpectedConditions.visibilityOf(locateElement(AddCourse)));
		click(AddCourse);
		waitForPageLoad();
		courseTitle1 = getRandomValue();
		sendKeys(courseTitle, courseTitle1);
		selectDropdown(JobCat, 0);
		
		sendKeys(Tags,"abcd");
		//click(TagValue);
		sendKeys(courseapplyLink, "ewfwefwef");
		sendKeys(AccoLocation, Constant.Location);
		sendKeys(StreetAddress, "ovel");
		sendKeys(Accosub, "adeled");
		sendKeys(state, "stateLess");
		sendKeys(courseStart, "2018-08-09");
		sendKeys(courseEnd, "2018-08-09");
		sendKeys(courseCost, "300");
		selectDropdown(Coursecurrency, 2);
		
		
		
		sendKeys(CourseIncludes, "2000");
		sendKeys(CourseDescription, "2018-08-09");

		sendKeys(ImagePost, "C:\\\\Users\\\\iTelaSoft-User\\\\Downloads\\\\snowbo_images\\\\6.jpg");
		sendKeys(AccoVideo, "https://www.youtube.com/watch?v=VGPi1zWtdeA");
		
		click(SelectPlan);
		waitForPageLoad();
		click(freePlan);
		click(SaveAcco);
		waitForPageLoad();
		accoValue = getSelector(courseTitle1);
		assertTrue(elementExists(accoValue));
		click(courseTab);
		waitForPageLoad();
		assertTrue(elementExists(accoValue));
		click(newsfeed);
		assertTrue(elementExists(accoValue));
		
		
		
		
		
		
		
	}
	
	
	
	

}
