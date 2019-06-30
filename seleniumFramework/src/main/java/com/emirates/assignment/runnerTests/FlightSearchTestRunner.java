package com.emirates.assignment.runnerTests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/Manmeet Kaur/projectEmirates/seleniumFramework/src/main/java/com/emirates/assignment/features/flightSearch.feature"
		,glue= {"com/emirates/assignment/stepdefinitions"},
		monochrome = true, plugin = {"html:target/cucumber-html-report", "junit:junit_output/cucumber.xml"},
		dryRun= false
	
		)

public class FlightSearchTestRunner {




}
