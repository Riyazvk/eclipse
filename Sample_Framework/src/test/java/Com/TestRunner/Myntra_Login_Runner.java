package Com.TestRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/tc.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC03_Mytra"},
		glue = {"com.Stepdefinition"},
		monochrome = true
		)


public class Myntra_Login_Runner {

}

