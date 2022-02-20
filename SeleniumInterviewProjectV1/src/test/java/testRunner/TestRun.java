package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
//		features = {".//FeatureFiles/Login.feature"},
//		features = {".//FeatureFiles/Login.feature", ".//FeatureFiles/another.feature"},   //runnung multiple features
		features = ".//FeatureFiles/",        //executes all feature files under the specified folder
		glue = "stepDefinitions",
		dryRun = false,
		plugin = {"pretty", "html:Reports/cucumber-report/results.html"},
//		tags = "@smoke or @regression",
//		tags = "@smoke and not @regression",
//		tags = "@smoke and @regression",
//		tags = "@smoke",
		monochrome = true
				)

public class TestRun {

}
