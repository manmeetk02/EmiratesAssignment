package com.emirates.assignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.emirates.assignment.utils.TestBase;

import junit.framework.Assert;

public class FlightSearchPage extends TestBase {

	@FindBy(className = "ts-fbr-flight-list-container__bg")
	WebElement flightList;

	public FlightSearchPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateThePageTitle() {
		return driver.getTitle();
	}

	public void flightListingCheck() {
		Assert.assertTrue("Flights are listed", flightList.isDisplayed());

	}

}
