package cucu;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class testrunner {
/// I AM RUNNING WITH CUCUMBER CLASS
	@RunWith(Cucumber.class)
	@CucumberOptions(features="feature/testcase.feature", glue="stepdefinition")
	public class Testrunner_googlehomepage
	{
		
	}
}
