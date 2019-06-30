package com.emirates.assignment.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.emirates.assignment.utils.CommonUtils;
import com.emirates.assignment.utils.TestBase;

public class HomePage extends TestBase {

	// private static final FlightSearchPage FlightSearchPage = null;

	@FindBy(xpath = "//input[contains(@name,'Departure airport')]")
	WebElement departurePort;

	@FindBy(name = "Arrival airport")
	WebElement arrivalPort;

	@FindBy(xpath = "//input[@class='checkbox__input js-one-way control__one-way']")
	WebElement oneWayCheckBox;

	@FindBy(css = "button.cta:nth-child(23)")
	WebElement searchFlightsBtn;

	@FindBy(className = "checkbox__input js-one-way control__one-way")
	WebElement datePicker;
	
	@FindBy(linkText = "Continue")
	WebElement continueBtn;
	
	@FindBy(xpath =".//*[@aria-label=\"17  Jul 19\"]")
	WebElement departureDate;

	// Initializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateThePageTitle() {
		return driver.getTitle();
	}

	public void navigateToFlightSearchScreen(String DeparturePort, String ArrivalPort) {
		driver.manage().timeouts().implicitlyWait(CommonUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		departurePort.sendKeys(DeparturePort);
		arrivalPort.sendKeys(ArrivalPort);
		if(continueBtn.isDisplayed()) {
			continueBtn.click();
		}
		//datePicker.click();
		oneWayCheckBox.click();
		
	}

	public void select_departure_date() {
		selectDepartureDate();
	}

	public void btnClick() {
		searchFlightsBtn.click();
	}

	private void selectDepartureDate() {
		departureDate.click();
		
		

		}

	}

