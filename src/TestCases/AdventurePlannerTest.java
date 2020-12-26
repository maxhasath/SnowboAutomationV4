package TestCases;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class AdventurePlannerTest extends UIActions implements ProductElements {

	//BrowserSetup browser = new BrowserSetup();
	//Constant constant = new Constant();
	LoginTest login;
	By image;
	// holds current user`s username
	
	// holds image unique server given image src value
	String AccomodationName = "Added a tour";

	WebDriverWait wait;

	@BeforeClass
	public void SetupBrowser() throws InterruptedException {
		login = new LoginTest();
		//this.browser = login.browser;
		this.wait = login.wait;
		login.login_MP10327();
	}
	
	
	
	@Test
	public void addAdventurePlanner() throws InterruptedException {
		
		
		//List<WebElement> newsFeeds = locateElements(By.xpath(
				//".//*[@id='snowbofeed']/div[1]/div/div[1]/div[2][div[text()='" + this.AccomodationName + "']]"));
	
		List<WebElement> newsFeeds = locateElements(plannerCat);
		
		
		//List<WebElement> newsFeeds = locateElements(By.xpath(
		//".//*[@id='snowbofeed']/div[div/div[1]/div[2]/div[contains(string(),'Added a course')]]"));
		
		//*[@id="snowbofeed"]/div[1]/div/div[1]/div[2]
		//List<WebElement> newsFeeds = locateElements(AdventurePlanner);
		
		
		
		System.out.println(newsFeeds.size());
		
		if (newsFeeds.size() > 0) {
			
			
			//*[@id="snowbofeed"]/div[div/div[2]/div/a]
			 newsFeeds.get(0).findElement(By.xpath(".//div[contains(@class, 'news-pkg')]/a")).click();
			 waitForPageLoad();
//			 click(AddToAdevnturePlanner);
//			 AccomodationName = getText(AccoName);
//			 By postValue = getSelector(AccomodationName);
//			 click(AdventurePlannertab);
//			 waitForPageLoad();
//			 assertTrue(elementExists(postValue));

			
		} else {
			System.out.println("No Elements found : problem with upload function");
		}
	}
	
	
}
