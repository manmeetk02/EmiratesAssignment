package Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/Manmeet Kaur/projectEmirates/cucumber/src/test/java/Features/flightSearch.feature"
		,glue= {"StepDefinitions"}
		//format= {"pretty, html:test-outout"}
		)
public class TestRunner {

}
