package Com.Stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_About_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sauce_About_Stepdefinition {
Sauce_About_page step=new Sauce_About_page();
	
	@Given("^launching the chrome application for Selecting any field in about scenario$")
	public void the_user_launch_the_chrome_application(){
	    // Write code here that turns the phrase above into concrete actions
	  step.url();  
	}

	@When("^Login to the home page$")
	public void the_user_open_the_Sauce_demo_Home_page() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    step.login();
	}

	@Then("^Select any field in about$")
	public void searching_the_product() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  step.About();
	   
	}
	@Then("^Close the browser$")
	public void close_browser() throws IOException, InterruptedException
	{
		step.Screenshot("src\\test\\resources\\Screenshot\\about.png");
	}
}