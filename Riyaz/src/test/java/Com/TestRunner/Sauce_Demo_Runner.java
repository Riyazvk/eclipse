package Com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/Sauce_Demo.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		//tags = {"@TC01_Login_SauceDemo"},
		glue = {"Com.Stepdefinition"},
		monochrome = true
		)
public class Sauce_Demo_Runner 
{

}