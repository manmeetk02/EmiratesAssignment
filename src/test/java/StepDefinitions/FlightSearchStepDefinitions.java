package StepDefinitions;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightSearchStepDefinitions {

	WebDriver driver;

	/**
	 * This method launches the browser and navigates to the emirates.com
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Given("^that the user is on Emirates.com$")
	public void navigate_to_emirates_home_page() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Manmeet Kaur/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.emirates.com/ae/english/");
		driver.manage().window().maximize();
	}

	/**
	 * This method will select the arrival date from the Calendar
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@When("^the user enters the departure and arrival destinations$")
	public void enter_departure_arrival_dates() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("Departure airport")).sendKeys("DXB");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("Arrival airport")).sendKeys("LHR");
		driver.findElement(By.linkText("Continue")).click();
	}
	
	/**
	 * This method will select the Journey Type i.e one way or return
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Then("^selects the journey type$")
	public void select_flightTypes() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//input[@class='checkbox__input js-one-way control__one-way']")).click();
	}

	/**
	 * In this method the dates are selected for the flights
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@And("^user selects the flying and returning dates$")
	public void select_flying_and_return_dates() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		selectDepartureDate();

	}
	
	/**
	 * Search button is clicked after the flight search details are entered
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@And("^clicks on the search flights button$")
	public void click_flight_search_button() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button.cta:nth-child(23)")).click();
	}
	/**
	 * Method to validate flight search listing is displayed
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Then("^Flight Search Screen is displayed$")
	public void verify_flight_search_screen() throws InterruptedException, IOException {
		driver.findElement(By.id("option-0-1-0")).click();

	}
	
	/**
	 * This method will select the current date and will add the 2 days to it,
	 * then the day is extracted and compared with the values on the calendar.
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	private void selectDepartureDate() throws InterruptedException, IOException{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 2);
		int todayDay = calendar.get(Calendar.DAY_OF_MONTH);
		String todayStr = Integer.toString(todayDay);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement dateWidgetFrom = driver.findElement(By.xpath(
				"/html/body/main/div[2]/div/div/div[1]/div/div/div/div[2]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[2]/table/tbody"));
		List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
		for (WebElement cell : columns) {
			if (cell.getText().equals(todayStr)) {
				cell.click();
				break;
			}
		}
	}

}
