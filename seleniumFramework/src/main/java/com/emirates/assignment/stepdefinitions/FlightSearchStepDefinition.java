package com.emirates.assignment.stepdefinitions;

import java.io.IOException;

import com.emirates.assignment.pages.FlightSearchPage;
import com.emirates.assignment.pages.HomePage;
import com.emirates.assignment.utils.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/**
 * 
 * Step Definition class which maps the features from flightSearch.feature
 * Corresponding methods will be called
 * 
 */

public class FlightSearchStepDefinition extends TestBase {

	HomePage homePage = new HomePage();
	FlightSearchPage flightSearchPage = new FlightSearchPage();

	/**
	 * This method launches the browser and navigates to the emirates.com
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Given("^that the user is on Emirates.com$")
	public void navigate_to_emirates_home_page() throws InterruptedException, IOException {
		TestBase.initialization();
	}

	/**
	 * This method will input the arrival and departure ports on the home page
	 * 
	 * @throws InterruptedException
	 */
	@When("^the user enters the \"(.*)\" and \"(.*)\" destinations and journey as one way$")
	public void enter_departure_arrival_dates(String departurePort, String arrivalPort) throws InterruptedException {
		homePage = new HomePage();
		String title = homePage.validateThePageTitle();
		Assert.assertEquals(
				"Emirates flights – Book a flight, browse our flight offers and explore the Emirates Experience",
				title);
		homePage.navigateToFlightSearchScreen(departurePort, arrivalPort);
	}

	/**
	 * This method will select the Journey Type i.e one way
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Then("^user selects the flying dates$")
	public void select_flightTypes() throws InterruptedException, IOException {
		homePage.select_departure_date();

	}

	/**
	 * In this method will navigated to Flight Search Screen
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@And("^clicks on the search flights button$")
	public void select_flying_and_return_dates() throws InterruptedException, IOException {
		homePage.btnClick();

	}

	/**
	 * Flight Search screen will be displayed here and the title of the page and
	 * flight list will be validated
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */

	@Then("^Flight Search Screen is displayed$")
	public void verify_flight_search_screen() throws InterruptedException, IOException {
		flightSearchPage = new FlightSearchPage();
		String title = flightSearchPage.validateThePageTitle();
		Assert.assertEquals("Search results | Make a booking | Emirates", title);
		flightSearchPage.flightListingCheck();

	}

	/**
	 * After performing all the steps, Browser will be closed
	 * 
	 */
	@And("^the browser is closed$")
	public void browser_is_closed() {
		driver.close();
	}

}
