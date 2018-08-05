package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class LoginTest extends UIActions implements ProductElements {
	BrowserSetup browser = new BrowserSetup();

	WebDriverWait wait;

	public LoginTest() {
		browser.Browser();
		wait = new WebDriverWait(driver, 30);
	}

	@Test(priority = 4)
	public void login_MP10327() throws InterruptedException {

		waitForPageLoad();
		wait.until(ExpectedConditions.visibilityOf(locateElement(NewsLetter)));

		click(NewsLetterClose);

		click(LoginEmail);
		sendKeys(EmailField, Constant.InstructorEmail);
		sendKeys(PasswordFiled, Constant.InstructorPassword);
		click(LoginButton);

		waitForPageLoad();

		String url = geUrl(Newsfeed);
		assertEquals(true, url.contains("https://snowbo.itelasoft.com.au/user/newsfeed"));
		// assertEquals(currentUrl, "https://snowbo.itelasoft.com.au/instructor/index");
	}

}
