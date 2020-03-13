package Com.Stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_Login_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sauce_login_Stepdefinition {
	Sauce_Login_page step=new Sauce_Login_page();
	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application(){
	    // Write code here that turns the phrase above into concrete actions
	  step.url();  
	}

	@When("^the user open the Sauce_demo Home page$")
	public void the_user_open_the_Sauce_demo_Home_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    step.homepage();
	}

	@Then("^the user login using username and password$")
	public void the_user_login_using_username_and_password() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   for(int i=1;i<5;i++)
	   {
	       step.signin(i);
	   }
	  
	}
	@Then("^user close the browser$")
	public void close_browser() throws IOException, InterruptedException
	{
		step.Screenshot("src\\test\\resources\\Screenshot\\login.png");
	}
}
