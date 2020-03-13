package Com.Stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_Search_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Sauce_Search_Stepdefinition {
Sauce_Search_Page step=new Sauce_Search_Page();
	
	@Given("^Launching the chrome application for Search Scenario$")
	public void the_user_launch_the_chrome_application(){
	    // Write code here that turns the phrase above into concrete actions
	  step.url();  
	}

	@When("^Open Home page and login$")
	public void the_user_open_the_Sauce_demo_Home_page() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    step.login();
	}

	@Then("^Search the product$")
	public void searching_the_product() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  step.Searching();
	   
	}
	@Then("^Closing the Browser$")
	public void close_browser() throws IOException, InterruptedException
	{
		step.screenshot("src\\test\\resources\\Screenshot\\search.png");
	
	}
}


