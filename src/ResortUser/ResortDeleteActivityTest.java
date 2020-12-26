package ResortUser;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Element.ProductElements;
import Framework.UIActions;
import TestCases.StatusUpdateNewsfeedTest;

public class ResortDeleteActivityTest extends UIActions implements ProductElements {

	ResortStatuesUpdateTest ResortstatusUpdateNewsfeedTest;
	By postSelector;

	@BeforeTest
	public void SetupBrowser() throws Exception {
		
		ResortstatusUpdateNewsfeedTest = new ResortStatuesUpdateTest();
		ResortstatusUpdateNewsfeedTest.SetupBrowser();
		ResortstatusUpdateNewsfeedTest.statusUpdate();
	}

	@Test
	public void deleteActivity() throws Exception {
	
		WebElement postedElement = locateElement(By.xpath(".//*[@id='activity-feed']/div/div[div[1]/div[2]/p[text()='"
				+ this.ResortstatusUpdateNewsfeedTest.RandomStatus + "']]"));
		assertNotNull(postedElement);
		
		
		//*[@id="activity-feed"]/div/div[2]
		
		postedElement.findElement(By.xpath(".//div[2]/form/button")).click();
		click(deletebtn);
		waitForPageLoad();
		assertFalse(elementExists(getSelector(this.ResortstatusUpdateNewsfeedTest.RandomStatus)));
		click(newsfeed);
	
		waitForPageLoad();
		assertFalse(elementExists(getSelector(this.ResortstatusUpdateNewsfeedTest.RandomStatus)));
	}
	
}
