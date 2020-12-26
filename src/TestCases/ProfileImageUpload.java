package TestCases;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class ProfileImageUpload extends UIActions implements ProductElements {

	
	//BrowserSetup browser = new BrowserSetup();
	//Constant constant = new Constant();
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
		click(myprofile2);
		waitForPageLoad();
		WebElement imgElement = driver.findElement(proimage);
		String imgSrcValueBefore = imgElement.getAttribute("src");
		sendKeys(proimageUpload, "C:\\Users\\iTelaSoft-User\\Downloads\\snowbo_images\\Proimg.jpg");
		
		waitForPageLoad();
		WebElement imgElement1 = driver.findElement(proimage);
		String imgSrcValueAfter = imgElement1.getAttribute("src");
		
	    assertNotEquals(imgSrcValueBefore, imgSrcValueAfter);
		
		
		
		
	}
	
	
}
