package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageUtils {
	 WebDriver driver;
	 public HomePageUtils(WebDriver driver) {
		 this.driver=driver;
	 }
	
public void initialize() throws IOException{
	
	System.setProperty("webdriver.chrome.driver","/cucumber/src/main/java/com/emirates/bddframework/cucumber/Drivers/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.emirates.com/ae/english/");
}
}
