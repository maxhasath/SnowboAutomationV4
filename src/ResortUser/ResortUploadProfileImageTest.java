package ResortUser;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.ProductElements;
import Framework.UIActions;
import TestCases.LoginTest;

public class ResortUploadProfileImageTest extends UIActions implements ProductElements {

ResortLoginTest login;

	
	
	WebDriverWait wait;
	
	@BeforeClass
	public void BeforeTest() throws InterruptedException
	{
	        login = new ResortLoginTest();
	        //this.browser = login.browser;
	        this.wait = login.wait;
	        login.login_Resort();
	}
	
	
	@Test
	public void statUpdate() throws Exception {
		
		
		
		click(dropdown);
		click(ResortMyProfile);
		waitForPageLoad();
		WebElement imgElement = driver.findElement(Rproimage);
		String imgSrcValueBefore = imgElement.getAttribute("src");
		sendKeys(proimageUpload, "C:\\Users\\iTelaSoft-User\\Downloads\\snowbo_images\\expected.jpg");
		waitForPageLoad();
		WebElement imgElement1 = driver.findElement(Rproimage);
		String imgSrcValueAfter = imgElement1.getAttribute("src");
		
	    assertNotEquals(imgSrcValueBefore, imgSrcValueAfter);
		
		
		
		
	}
	
	
}
