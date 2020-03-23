package Com.Stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_Demo_platform_field_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sauce_Demo_platformfield_Stepdefinition {
	Sauce_Demo_platform_field_page step =new Sauce_Demo_platform_field_page();
	@Given("^user launch the chrome application$")
	public void user_launch_the_chrome_application() {
		step.launchChrome("chrome");
	}

	@When("^user open the Sauce_demo Home page$")
	public void user_open_the_Sauce_demo_Home_page() {
		step.homepage();
	}

	@Then("^The user login the home page$")
	public void the_user_login_the_home_page() throws IOException, InterruptedException {
		step.login();
	}

	@Then("^check selenium configuration$")
	public void search_the_product() throws InterruptedException, IOException   {
		step.platformfield();
		step.screenshot("src\\test\\resources\\Screenshot\\selenium.png");
	}

	@Then("^closing the browser$")
	public void closing_the_browser() throws InterruptedException {
		step.closebrowser();
	}

}
