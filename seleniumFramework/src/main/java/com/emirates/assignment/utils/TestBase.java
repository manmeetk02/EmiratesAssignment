package com.emirates.assignment.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * Base class contains all the methods for launching browser.
 * 
 **/

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	/**
	 * Constructor to initialize and read the properties file
	 */
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"/Users/Manmeet Kaur/projectEmirates/seleniumFramework/src/main/java/com/emirates/assignment/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	/**
	 * 
	 * Browser initialization and launching browser mentioned in the properties file
	 * 
	 */
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/Manmeet Kaur/projectEmirates/seleniumFramework/src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"/Users/Manmeet Kaur/projectEmirates/seleniumFramework/src/test/resources/drivers/geckodriver.exe");
			driver = new ChromeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(CommonUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(CommonUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
