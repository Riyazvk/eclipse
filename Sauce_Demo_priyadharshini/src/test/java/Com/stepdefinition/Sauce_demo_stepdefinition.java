package Com.stepdefinition;

import java.io.IOException;


import Com.Pages.Sauce_Demo_baseclass;

import Com.Pages.Sauce_Demo_platform_supportedbrowsers_page;
import Com.Pages.Sauce_Demo_resources_arcticle_page;
import Com.Pages.Sauce_Demo_solution_aotomatedtesting_Page;
import Com.Pages.Sauce_Demo_solution_livetesting_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sauce_demo_stepdefinition {
	Sauce_Demo_resources_arcticle_page         s1=new Sauce_Demo_resources_arcticle_page();
	Sauce_Demo_platform_supportedbrowsers_page s2=new Sauce_Demo_platform_supportedbrowsers_page();
	Sauce_Demo_solution_livetesting_page       s3=new Sauce_Demo_solution_livetesting_page();
	Sauce_Demo_solution_aotomatedtesting_Page  s4=new Sauce_Demo_solution_aotomatedtesting_Page();
	Sauce_Demo_baseclass s=new Sauce_Demo_baseclass(); 
	
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
	public void select_Articles_from_resource_field() throws InterruptedException {
		s1.resource_field();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws InterruptedException  {
        s.closebrowser();	    
	}

	@Then("^checking supported browsers in platform field$")
	public void checking_supported_browsers_in_platform_field() throws InterruptedException {
	    s2.platform_field();	
	}

	@Then("^checking Live testing option in Solution field$")
	public void checking_Live_testing_option_in_Solution_field() throws InterruptedException {
	  s3.Solution_field_live_testing();   
	}

	@Then("^checking Automated testing option in Solution field$")
	public void checking_Automated_testing_option_in_Solution_field() throws InterruptedException  {
	   s4.Solution_field_Automated_testing();
	}

	}
	
