package TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.ProductElements;
import Framework.UIActions;

public class AccountSettingsUpdateTest extends UIActions implements ProductElements {

	LoginTest login;
	String randomValue = "";
	String statusValue = "";
	String UpdatedText = "";

	WebDriverWait wait;

	@BeforeClass
	public void SetupBrowser() throws InterruptedException {
		login = new LoginTest();
		login.login_MP10327();
		// this.browser = login.browser;
		this.wait = login.wait;
	}

	@Test
	public void Booknow() throws InterruptedException {

		click(dropdown);
		click(AccountSettings);
		waitForPageLoad();
		randomValue = getRandomValue();
		sendKeys(name, randomValue);
		click(Updatebtn);
		waitForPageLoad();
		// wait.until(ExpectedConditions.visibilityOf(locateElement(name)));
		// String status = getText(name);
		// UpdatedText = getText(email);
		// UpdateText = name.findElement(by)
		WebElement imgElement1 = driver.findElement(name);
		String imgSrcValueAfter = imgElement1.getAttribute("value");
		System.out.println(imgSrcValueAfter);
		System.out.println(randomValue);
		assertEquals(imgSrcValueAfter, randomValue);
		statusValue = getText(AccountSettingStatus);
		// Assert.assertEquals(UpdatedText, randomValue);
		// assertEquals(true, name.contains(randomValue));
		// statusValue=getText(AccountSettingStatus);
		assertEquals(statusValue, "Profile updated successfully");

	}

}
