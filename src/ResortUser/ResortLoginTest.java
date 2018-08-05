package ResortUser;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Element.Constant;
import Element.ProductElements;
import Framework.BrowserSetup;
import Framework.UIActions;

public class ResortLoginTest extends UIActions implements ProductElements {
	BrowserSetup browser = new BrowserSetup();
	Constant constant = new Constant();

	WebDriverWait wait;


	
	 public ResortLoginTest() {
		// TODO Auto-generated constructor stub
		browser.Browser();
		wait = new WebDriverWait(driver, 30);
	}
	

	@Test
	public void login_Resort() throws InterruptedException {

		waitForPageLoad();
		wait.until(ExpectedConditions.visibilityOf(locateElement(NewsLetter)));

		click(NewsLetterClose);

		click(LoginEmail);
		sendKeys(EmailField, constant.ResortEmail);
		sendKeys(PasswordFiled, constant.ResortPassword);
		click(LoginButton);

		waitForPageLoad();

		String url = geUrl(Newsfeed);
		assertEquals(true, url.contains("https://snowbo.itelasoft.com.au/user/newsfeed"));
		// assertEquals(currentUrl, "https://snowbo.itelasoft.com.au/instructor/index");
	}

}
