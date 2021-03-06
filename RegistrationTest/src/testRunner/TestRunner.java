package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="stepdefinition",
		format= {"pretty"},
		dryRun=false
		)
public class TestRunner {

}
