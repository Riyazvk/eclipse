package Com.Stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_AddCart_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sauce_Addcart_Stepdefinition {
Sauce_AddCart_Page step=new Sauce_AddCart_Page();
	
	@Given("^launching the chrome application for Add to cart scenario$")
	public void the_user_launch_the_chrome_application(){
	    // Write code here that turns the phrase above into concrete actions
	  step.url();  
	}

	@When("^Login the home page$")
	public void the_user_open_the_Sauce_demo_Home_page() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    step.login();
	}

	@Then("^Add to cart$")
	public void searching_the_product() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  step.addcart();
	   
	}
	@Then("^Close Browser$")
	public void close_browser() throws InterruptedException, IOException
	{
		step.Screenshot("src\\test\\resources\\Screenshot\\addcart.png");
	}
}

