package TestCases;

import static org.testng.Assert.assertNotNull;

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

public class BookNowTest extends UIActions implements ProductElements{
	
//	
//	BrowserSetup browser = new BrowserSetup();
	//Constant constant = new Constant();
	LoginTest login;
	
	

	WebDriverWait wait;

	@BeforeClass
	public void SetupBrowser() throws InterruptedException {
		login = new LoginTest();
		login.login_MP10327();
//		this.browser = login.browser;
		this.wait = login.wait;
	}
	
	
	
	@Test
	public void Booknow() throws InterruptedException {
		
//		login.login_MP10327();
		
		
		List<WebElement> newsFeeds = locateElements(Book);
		
		System.out.println(newsFeeds.size());
		
		if (newsFeeds.size() > 0) {
			
			 newsFeeds.get(0).click();
			 waitForPageLoad();
			 click(BookNowBtn);

			
		} else {
			System.out.println("No Elements found : problem with upload function");
		}
	}


}
