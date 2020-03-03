package Com.Steps;

import Com.main_java.linkedin_join_java;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class join_steps {
	linkedin_join_java b=new linkedin_join_java();
	@Given("^launch the chrome browser$")
	public void launch_the_chrome_browser()  {
	    // Write code here that turns the phrase above into concrete actions
	    b.Url();
	}

	@When("^the user opens linkedin join page$")
	public void the_user_opens_linkedin_join_page() {
	    // Write code here that turns the phrase above into concrete actions
	   b.joinpage();
	}

	@Then("^verify the user id and password$")
	public void verify_the_user_id_and_password()  {
	    // Write code here that turns the phrase above into concrete actions
	    b.join();
	}

	@Then("^to verify joinin$")
	public void to_verify_joinin(){
	    // Write code here that turns the phrase above into concrete actions
	    b.cucu();
}
}
