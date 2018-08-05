package Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Element.Constant;

public class UIActions extends BrowserSetup {
	WebDriverWait wait;

	public void sendKeys(By element, String input) {
		try {
			waitForPageLoad();
			WebElement sendKeys = driver.findElement(element);
			sendKeys.clear();
			sendKeys.sendKeys(input);
		} catch (NoSuchElementException e) {
			fail(Constant.errorMessage + element);
		}
	}

	public void click(By element) {
		try {
			waitForPageLoad();
			fliuentWait(element);
			driver.findElement(element).click();
		} catch (NoSuchElementException exception) {
			fail(Constant.errorMessage + element);
		}
	}

	public String getText(By element) {
		String text = "";
		try {
			elementToBeVisible(element);
			WebElement message = driver.findElement(element);
			text = message.getText();
		} catch (Exception e) {
			fail(Constant.errorMessage + element);
		}
		return text;
	}

	public String geUrl(By element) {
		String url = "";
		try {
			elementToBeVisible(element);
			String currenturl = driver.getCurrentUrl();
			url = currenturl;
		} catch (Exception e) {
			fail(Constant.errorMessage + element);
		}
		return url;
	}

	public WebElement locateElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (Exception e) {
			fail(Constant.errorMessage + locator);
		}
		return element;
	}

	/**
	 * Get Web Element List for Given Locator
	 * 
	 * @param locator
	 * @return
	 */
	public List<WebElement> locateElements(By locator) {
		List<WebElement> elements = new ArrayList<>();
		try {
			elements = driver.findElements(locator);
		} catch (Exception e) {
			fail(Constant.errorMessage + locator);
		}
		return elements;
	}

	public boolean isDisplayed(By element) {
		boolean isDisplayed = false;
		try {
			boolean ElementisDisplayed = driver.findElement(element).isDisplayed();
			elementToBeVisible(element);
			isDisplayed = ElementisDisplayed;
		} catch (Exception e) {
			fail(Constant.errorMessage + element);
		}
		return isDisplayed;
	}

	public void waitForPageLoad() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			pause(1);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(expectation);
		} catch (Throwable error) {
			fail(Constant.errorMessage + error);
		}
	}

	protected void WaitforPage_To_Load() {

		wait = new WebDriverWait(driver, 30);
		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		});
	}

	protected void elementToBeVisible(By locator) {
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitForElementPresent(String element, int timeout) throws Exception {

		for (int second = 0;; second++) {
			if (second >= timeout)
				fail("Timeout. Unable to find the Specified element" + element);
			try {
				break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}
	}

	public void pause(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
		}
	}

	@SuppressWarnings("deprecation")
	public void fliuentWait(By locator) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(60, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS)
				.until(ExpectedConditions.elementToBeClickable(locator));
		wait.ignoring(NoSuchElementException.class);

	}

	public boolean elementExists(By locator) {
		try {
			return !driver.findElements(locator).isEmpty();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/**
	 * Generate Random String
	 * 
	 * @return
	 */
	public String getRandomValue() {
		return Long.toString(System.currentTimeMillis());
	}

	public String randomAlphaNumeric(int count, String AlphaNumeric) {
		StringBuilder builder = new StringBuilder();

		while (count-- != 0) {
			int character = (int) (Math.random() * AlphaNumeric.length());
			builder.append(AlphaNumeric.charAt(character));
		}
		return builder.toString();
	}

	public By getSelector(String value) {
		return By.xpath("//*[contains(text(), '" + value + "')]");
	}

	public void fail(String errorMessage) {
		System.out.println("[-FAILED BECAUSE OF] " + errorMessage);
		Assert.assertTrue(false);
	}

}
