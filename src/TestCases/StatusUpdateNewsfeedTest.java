package TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class StatusUpdateNewsfeedTest extends UIActions implements ProductElements {

	//BrowserSetup browser = new BrowserSetup();
	//Constant constant = new Constant();
	LoginTest login;
	By postValue;
	String randomValue;

	WebDriverWait wait;

	@BeforeTest
	public void setupBrowser() throws InterruptedException {
		login = new LoginTest();
		//this.browser = login.browser;
		this.wait = login.wait;
		login.login_MP10327();
	}

	@Test
	public void statUpdate() throws Exception {

		
		randomValue = getRandomValue();
		postValue = getSelector(randomValue);
		sendKeys(statusbar, randomValue);
		click(statusbtn);
		waitForPageLoad();
		assertTrue(elementExists(postValue));
		click(dropdown);
		click(myprofile2);
		waitForPageLoad();
		assertTrue(elementExists(postValue));

	}

}
