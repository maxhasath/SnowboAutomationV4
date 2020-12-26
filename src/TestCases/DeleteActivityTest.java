package TestCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class DeleteActivityTest extends UIActions implements ProductElements {

	
	StatusUpdateNewsfeedTest statusUpdateNewsfeedTest;
	By postSelector;

	@BeforeTest
	public void SetupBrowser() throws Exception {
		this.statusUpdateNewsfeedTest = new StatusUpdateNewsfeedTest();
		//this.statusUpdateNewsfeedTest.setupBrowser();
		this.statusUpdateNewsfeedTest.statUpdate();
	}

	@Test
	public void statUpdate() throws Exception {
	
		WebElement postedElement = locateElement(By.xpath(".//*[@id='activity-feed']/div/div[div[1]/div[2]/p[text()='"
				+ this.statusUpdateNewsfeedTest.randomValue + "']]"));
		assertNotNull(postedElement);
		postedElement.findElement(By.xpath(".//div[2]/form/button")).click();
		click(deletebtn);
		waitForPageLoad();
		assertFalse(elementExists(getSelector(this.statusUpdateNewsfeedTest.randomValue)));
		click(newsfeed);
	
		waitForPageLoad();
		assertFalse(elementExists(getSelector(this.statusUpdateNewsfeedTest.randomValue)));
	}

}
