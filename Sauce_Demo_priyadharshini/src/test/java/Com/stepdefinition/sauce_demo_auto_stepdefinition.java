package Com.stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_Demo_solution_aotomatedtesting_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sauce_demo_auto_stepdefinition {
	Sauce_Demo_solution_aotomatedtesting_Page s=new Sauce_Demo_solution_aotomatedtesting_Page();
	@Given("^user launching the chrome application$")
	public void user_launching_the_chrome_application() {
		s.url();
	}

	@When("^user opens the Sauce_demo Home page$")
	public void user_opens_the_Sauce_demo_Home_page() {
		s.homepage();
	}

	@Then("^logins the home page$")
	public void logins_the_home_page() throws IOException, InterruptedException {
		s.login();
	}

	@Then("^checking Automated testing option in Solution field$")
	public void checking_Automated_testing_option_in_Solution_field() throws InterruptedException, IOException {
		s.Solution_field_Automated_testing();
		s.screenshot("src\\test\\resources\\Screenshot\\autotesting.png");

	}

	@Then("^Closing the browser$")
	public void closing_the_browser() throws InterruptedException {
		s.closebrowser();
	}

}
