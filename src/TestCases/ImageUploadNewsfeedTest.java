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

public class ImageUploadNewsfeedTest extends UIActions implements ProductElements {
	BrowserSetup browser = new BrowserSetup();
	Constant constant = new Constant();
	LoginTest login;
	By image;
	// holds current user`s username
	String usernameText ;
	// holds image unique server given image src value
	String imageSrc = "";

	WebDriverWait wait;

	@BeforeClass
	public void SetupBrowser() {
		login = new LoginTest();
		this.browser = login.browser;
		this.wait = login.wait;
	}

	@Test
	public void statUpdate() throws Exception {
		// 1. login
		login.login_MP10327();
		// 2. upload image
		sendKeys(imageUpload, "C:\\Users\\iTelaSoft-User\\Downloads\\snowbo_images\\6.jpg");
		click(statusbtn);
		waitForPageLoad();
		// 3. get current users username
		usernameText = getText(username);
		// 4. get last newsfeed post by current user
		List<WebElement> newsFeeds = locateElements(By.xpath(
				".//*[@id='snowbofeed']/div[div/div[1]/div[2]/div[1]/a/h4[text()='" + this.usernameText + "']]"));
		// check whether elements found
		if (newsFeeds.size() > 0) {
			// 5. pick the first post to find image src
			imageSrc = newsFeeds.get(0).findElement(By.xpath(".//div/div[2]/div/div/a/img")).getAttribute("src");
			
			//div[1]/div/div[2]/div[contains(@class, 'news-pkg')]/a
			System.out.println("imageSrc : " + imageSrc);

			// 6. move to my profile page
			click(dropdown);
			click(myprofile);
			waitForPageLoad();

			// 7. check image found on photos & videos section
			// assertNotNull(locateElement(
			// By.xpath(".//*[@id='media-section']/div/div[2]/div/div[a/img[@src='" +
			// splitString(imageSrc) + "']]")));

			// 8. check image on activity list
			assertNotNull(locateElement(By.xpath(
					".//*[@id='activity-feed']/div/div[div[1]/div[3]/a/img["
					+ "@src='" + splitString(imageSrc) + "']]")));
		} else {
			System.out.println("No Elements found : problem with upload function");
		}
	}

	/**
	 * Sub String image path only src value
	 * 
	 * @param imagePath
	 * @return
	 */
	private String splitString(String imagePath) {
		return imagePath.substring(imagePath.indexOf('/', 8));
	}

}
