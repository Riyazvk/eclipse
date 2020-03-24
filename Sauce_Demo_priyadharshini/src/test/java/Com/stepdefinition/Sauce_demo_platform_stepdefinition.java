package Com.stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_Demo_platform_supportedbrowsers_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sauce_demo_platform_stepdefinition {
	Sauce_Demo_platform_supportedbrowsers_page s=new Sauce_Demo_platform_supportedbrowsers_page();
	@Given("^the user launching the chrome application$")
	public void the_user_launching_the_chrome_application() {
		s.url();
	}

	@When("^the user opens the Sauce_demo Home page$")
	public void the_user_opens_the_Sauce_demo_Home_page() {
		s.homepage();
	}

	@Then("^user login the home page$")
	public void user_login_the_home_page() throws IOException, InterruptedException {
		s.login();
	}

	@Then("^checking supported browsers in platform field$")
	public void checking_supported_browsers_in_platform_field() throws InterruptedException, IOException {
		s.platform_field();
		s.screenshot("src\\test\\resources\\Screenshot\\browser.png");

		
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws InterruptedException {
      s.closebrowser();
}
}
