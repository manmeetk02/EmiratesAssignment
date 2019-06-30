package com.emirates.assignment.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.emirates.assignment.utils.CommonUtils;
import com.emirates.assignment.utils.TestBase;

/**
 * 
 * Page class contains all the operation to be Performed on the home screen.
 *
 * @author Manmeet Kaur
 *
 */

public class HomePage extends TestBase {

	// ** Departure Port **//
	@FindBy(xpath = "//input[contains(@name,'Departure airport')]")
	WebElement departurePort;

	// ** Arrival Port **//
	@FindBy(name = "Arrival airport")
	WebElement arrivalPort;

	// ** One way checkBox **//
	@FindBy(xpath = "//input[@class='checkbox__input js-one-way control__one-way']")
	WebElement oneWayCheckBox;

	// ** Search Flights Button **//
	@FindBy(css = "button.cta:nth-child(23)")
	WebElement searchFlightsBtn;

	// ** Continue Button **//
	@FindBy(linkText = "Continue")
	WebElement continueBtn;

	// ** Departure Date **//
	@FindBy(xpath = ".//*[@aria-label=\"17  Jul 19\"]")
	WebElement departureDate;

	// Initializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Validating the page title
	 * 
	 * @return
	 */
	public String validateThePageTitle() {
		return driver.getTitle();
	}

	/**
	 * Navigating to the Flight search Screen by entering the arrival and departure
	 * ports then clicking the search button
	 * 
	 * @param DeparturePort,
	 *            ArrivalPort
	 * @return
	 */
	public void navigateToFlightSearchScreen(String DeparturePort, String ArrivalPort) {
		driver.manage().timeouts().implicitlyWait(CommonUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		departurePort.sendKeys(DeparturePort);
		arrivalPort.sendKeys(ArrivalPort);
		if (continueBtn.isDisplayed()) {
			continueBtn.click();
		}

		oneWayCheckBox.click();

	}

	/**
	 * Selecting the departure date from the calendar
	 *
	 */
	public void select_departure_date() {
		departureDate.click();
	}

	/**
	 * Search Flights Button click
	 *
	 */
	public void btnClick() {
		searchFlightsBtn.click();
	}

}
