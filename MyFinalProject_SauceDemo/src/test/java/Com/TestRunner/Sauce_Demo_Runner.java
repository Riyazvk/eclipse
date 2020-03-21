package Com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/Test.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC06_Select_resource_field_in_about_option"},
		glue = {"Com.Stepdefinition"},
		monochrome = true
		)
public class Sauce_Demo_Runner 
{

}