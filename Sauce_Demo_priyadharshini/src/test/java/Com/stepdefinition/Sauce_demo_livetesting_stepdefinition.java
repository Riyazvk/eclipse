package Com.stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_Demo_solution_livetesting_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sauce_demo_livetesting_stepdefinition {
	Sauce_Demo_solution_livetesting_page s=new Sauce_Demo_solution_livetesting_page();
	@Given("^user launch the chrome application$")
	public void user_launch_the_chrome_application() {
      s.url();
	}

	@When("^user open the Sauce_demo Home page$")
	public void user_open_the_Sauce_demo_Home_page() {
		s.homepage();
	}

	@Then("^login the home page$")
	public void login_the_home_page() throws IOException, InterruptedException {
		s.login();
	}

	@Then("^checking Live testing option in Solution field$")
	public void checking_Live_testing_option_in_Solution_field() throws InterruptedException, IOException {
		s.Solution_field_live_testing();
		s.screenshot("src\\test\\resources\\Screenshot\\livetesting.png");

	}

	@Then("^closing the browser$")
	public void closing_the_browser() throws InterruptedException {
		s.closebrowser();
	}


}
