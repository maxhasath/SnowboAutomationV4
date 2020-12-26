package TestCases;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.ProductElements;
import Framework.UIActions;

public class UploadPhotoTest extends UIActions implements ProductElements {
	String path = "";
	LoginTest login;
	int sizeOf = 0;
	WebDriverWait wait;

	@BeforeClass
	public void SetupBrowser() throws InterruptedException {
		login = new LoginTest();
		// this.browser = login.browser;
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

		click(imageUploaderbtn);
		sendKeys(BrowseImage, "C:\\Users\\iTelaSoft-User\\Downloads\\snowbo_images\\expected.jpg");
		// isVisible(preview);
		click(UploadImageBtn);
		waitForPageLoad();
		Thread.sleep(5000);

		WebElement imgElementnew = driver.findElement(uploadedimage);
		String srcValueAfter = imgElementnew.getAttribute("src");

		assertNotEquals(srcValueBefore, srcValueAfter);

		System.out.println(srcValueBefore);
		System.out.println(srcValueAfter);

		path = splitString(srcValueAfter);
		// assertNotNull(locateElement(By.xpath(
		// ".//*[@id='activity-feed']/div/div[div[1]/div[3]/a/img[@src='" +
		// srcValueAfter + "']]")));

		List<WebElement> sizeOfElements = locateElements(By.xpath("//img[contains(@src,'" + path + "')]"));
		sizeOf = sizeOfElements.size();

		System.out.println(sizeOf);

		assertTrue(locateElements(By.xpath("//img[contains(@src,'" + path + "')]")).size() == 2);
		
		// Check in Media tab
		click(MediaTab);
		waitForPageLoad();

		assertNotNull(locateElement(By.xpath("//img[contains(@src,'" + path + "')]")));

		//Check in Newsfeed
		click(newsfeed);
		waitForPageLoad();
		// assertNotNull(locateElement(By.xpath(
		// ".//*[@id='snowbofeed']/div[1]/div/div[2]/div/div/a/img[@src='" +
		// srcValueAfter + "']]")));

		assertNotNull(locateElement(By.xpath("//img[contains(@src,'" + path + "')]")));

	}

	private String splitString(String imagePath) {
		return imagePath.substring(imagePath.lastIndexOf('/'));
	}

}
