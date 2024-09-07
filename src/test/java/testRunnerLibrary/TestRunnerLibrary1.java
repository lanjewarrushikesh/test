package testRunnerLibrary;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features =("src/test/resources/FeatureFiles/"),
			glue = {"stepDefinitions"},
			plugin = {"pretty","html:target/cucumber-report.html"}
			)

public class TestRunnerLibrary1 {

}
