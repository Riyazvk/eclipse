package Com.stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_Demo_resources_arcticle_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sauce_demo_resource_article_stepdefinition {
	Sauce_Demo_resources_arcticle_page s=new Sauce_Demo_resources_arcticle_page();
	
	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() {
		s.url();
	}

	@When("^the user open the Sauce_demo Home page$")
	public void the_user_open_the_Sauce_demo_Home_page() {
		s.homepage();
	}

	@Then("^The user login the home page$")
	public void the_user_login_the_home_page() throws IOException, InterruptedException {
	    s.login();
	}

	@Then("^Select Articles from resource field$")
	public void select_Articles_from_resource_field() throws InterruptedException, IOException {
		s.resource_field();
		s.screenshot("src\\test\\resources\\Screenshot\\articles.png");
	}

	@Then("^close the browser$")
	public void close_the_browser() throws InterruptedException  {
        s.closebrowser();	    
	}
	
	}
	
