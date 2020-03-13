package Com.TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/Test.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC04_Select_any_one_field_in_about"},
		glue = {"com.Stepdefinition"},
		monochrome = true
		)
public class Sauce_About_Runner {

}
