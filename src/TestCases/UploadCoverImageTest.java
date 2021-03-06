package TestCases;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class UploadCoverImageTest extends UIActions implements ProductElements{

	
	LoginTest login;

	
	
	WebDriverWait wait;
	
	@BeforeClass
	public void SetupBrowser()
	{
	        login = new LoginTest();
	       
	        this.wait = login.wait;
	}
	
	
	@Test
	public void statUpdate() throws Exception {
		
		
		login.login_MP10327();
		click(dropdown);
		click(myprofile);
		waitForPageLoad();
		WebElement imgElement = driver.findElement(Coverimage);
		String imgSrcValueBefore = imgElement.getAttribute("src");
		sendKeys(CoverImageUpload, "C:\\Users\\iTelaSoft-User\\Downloads\\snowbo_images\\expected.jpg");
		waitForPageLoad();
		WebElement imgElement1 = driver.findElement(Coverimage);
		String imgSrcValueAfter = imgElement1.getAttribute("src");
		
	    assertNotEquals(imgSrcValueBefore, imgSrcValueAfter);
		
		
		
		
	}
	
	
}
