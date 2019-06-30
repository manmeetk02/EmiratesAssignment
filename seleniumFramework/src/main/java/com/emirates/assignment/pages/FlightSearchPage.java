package com.emirates.assignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.emirates.assignment.utils.TestBase;

import junit.framework.Assert;

/**
 * 
 * Page class contains all the operation to be Performed on the Flight Search
 * screen.
 *
 * @author Manmeet Kaur
 *
 */

public class FlightSearchPage extends TestBase {

	// ** Flight List Container **//
	@FindBy(className = "ts-fbr-flight-list-container__bg")
	WebElement flightList;

	// Initializing the Page Objects
	public FlightSearchPage() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Getting the page title
	 */
	public String validateThePageTitle() {
		return driver.getTitle();
	}

	/**
	 * Method to check whether flight list container is displayed or not
	 */
	public void flightListingCheck() {
		Assert.assertTrue("Flights are listed", flightList.isDisplayed());

	}

}
