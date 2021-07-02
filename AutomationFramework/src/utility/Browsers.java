package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browsers {

	public WebDriver driver;
	
	public WebDriver launchBrowser(String browser) throws Exception {
		if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe\\");
			driver = new FirefoxDriver();
			
		}

		else if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe\\");

			driver = new ChromeDriver();
		
		}

		else if (browser.equalsIgnoreCase("Edge")) {

			System.setProperty("webdriver.edge.driver", ".\\MicrosoftWebDriver.exe");

			driver = new EdgeDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		return driver;
	}
	
}
