package ResortUser;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Element.ProductElements;
import Framework.UIActions;
import TestCases.LoginTest;

public class ResortAccoutSettingsUpdate extends UIActions implements ProductElements {
	
	ResortLoginTest login;
	String randomValue = "";
	String statusValue = "";
	String UpdatedText = "";
	String Rname = "Castle rock";

	WebDriverWait wait;

	@BeforeClass
	public void SetupBrowser() throws InterruptedException {
		login = new ResortLoginTest();
		 this.wait = login.wait;
		login.login_Resort();
		
		
	}

	@Test
	public void Booknow() throws InterruptedException {

		click(dropdown);
		click(RAccountSettings);
		waitForPageLoad();
		randomValue = getRandomValue();
		sendKeys(name, randomValue);
		click(Updatebtn);
		waitForPageLoad();
	
		WebElement imgElement1 = driver.findElement(name);
		String imgSrcValueAfter = imgElement1.getAttribute("value");
		System.out.println(imgSrcValueAfter);
		System.out.println(randomValue);
		assertEquals(imgSrcValueAfter, randomValue);
		
		statusValue = getText(AccountSettingStatus);
		System.out.println(statusValue);
		//assertEquals(statusValue, "Profile updated successfully");
		//Assert.assertEquals(true,statusValue.contains("Profile updated successfully"));
		
		assertNotNull(locateElement(By.xpath(
				"//*[contains(string(), 'Profile updated successfully')]")));
		
		
		
		

	}


}
