package TestCases;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.ProductElements;
import Framework.UIActions;

public class UploadVideoTest extends UIActions implements ProductElements{

LoginTest login;

	
	
	WebDriverWait wait;
	
	@BeforeClass
	public void SetupBrowser() throws InterruptedException
	{
	        login = new LoginTest();
	        //this.browser = login.browser;
	        this.wait = login.wait;
	        login.login_MP10327();
	}
	
	
	@Test
	public void statUpdate() throws Exception {
		
		
		
		click(dropdown);
		click(myprofile);
		waitForPageLoad();
		
		WebElement imgElement = driver.findElement(uploadedimage);
		String srcValueBefore = imgElement.getAttribute("src");
	
		click(videoUploadBtn);
		sendKeys(videoLinkField, "https://www.youtube.com/watch?v=piQx9v1gVMY&t=7s");
		//isVisible(preview);
		click(videoSaveBtn);
		waitForPageLoad();
		
		
		
		WebElement imgElementnew = driver.findElement(uploadedimage);
		String srcValueAfter = imgElementnew.getAttribute("src");
		
		 assertNotEquals(srcValueBefore, srcValueAfter);
		
		System.out.println(srcValueBefore);
		System.out.println(srcValueAfter);
	//assertNotNull(locateElement(By.xpath(
				//".//*[@id='activity-feed']/div/div[div[1]/div[3]/a/img[@src='" + srcValueAfter + "']]")));
		//Boolean isPresent = driver.findElements(By.xpath("//img[contains(@src,srcValueAfter)]").size() > 0;
		
		//assertNotNull(locateElements(By.xpath("//img[contains(@src,srcValueAfter)]")));
		
	
		//click(MediaTab);
		//waitForPageLoad();
		
	
		
		
		
		//assertNotNull(locateElement(By.xpath("//img[contains(@src,srcValueAfter)]")));
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
