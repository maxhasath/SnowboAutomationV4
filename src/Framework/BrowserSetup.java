package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {
	
public static WebDriver driver;
	
	public void Browser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://snowbo.itelasoft.com.au");
		
	}


}
