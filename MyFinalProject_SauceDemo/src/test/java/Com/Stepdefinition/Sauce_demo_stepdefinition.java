package Com.Stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_Demo_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sauce_demo_stepdefinition {
	
	Sauce_Demo_page step=new Sauce_Demo_page();
	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application()  {
	    step.url();
	}

	@When("^the user open the Sauce_demo Home page$")
	public void the_user_open_the_Sauce_demo_Home_page()   {
		step.homepage();
	}

	@Then("^the user login using username and password$")
	public void the_user_login_using_username_and_password() throws IOException, InterruptedException  {
		for(int i=1;i<3;i++)
			   {
			       step.signin(i);
			   }
		step.screenshot("src\\test\\resources\\Screenshot\\valid.png");
	}

	@Then("^close the browser$")
	public void close_the_browser() throws InterruptedException  {
	    step.closebrowser();
	}

	@Then("^the user login using invalid username and password$")
	public void the_user_login_using_invalid_username_and_password() throws IOException, InterruptedException  {
	    step.Invalidlogin();
	    step.screenshot("src\\test\\resources\\Screenshot\\Invalid.png");
	}

	@Then("^The user login the home page$")
	public void the_user_login_the_home_page() throws IOException, InterruptedException  {
	    step.login();
	}

	@Then("^Search the product$")
	public void search_the_product() throws InterruptedException, IOException {
	    step.Searching();
	    step.screenshot("src\\test\\resources\\Screenshot\\search.png");
	}

	@Then("^Add to cart$")
	public void add_to_cart() throws InterruptedException, IOException  {
	    step.Searching();
		step.addcart();
	    step.screenshot("src\\test\\resources\\Screenshot\\addcart.png");
	}

	@Then("^Select any field in about$")
	public void select_any_field_in_about() throws InterruptedException, IOException  {
	    step.About_company_career();
	    step.screenshot("src\\test\\resources\\Screenshot\\about.png");
	}
	@Then("^Select Articles from resource field$")
	public void select_Articles_from_resource_field() throws IOException, InterruptedException  {
	    step.resource_field();
	    step.screenshot("src\\test\\resources\\Screenshot\\Resources.png");
	   
	}

	@Then("^checking supported browsers in platform field$")
	public void checking_supported_browsers_in_platform_field() throws IOException, InterruptedException  {
	    step.platform_field();
	    step.screenshot("src\\test\\resources\\Screenshot\\Platform_supported_browser.png");
	}

	@Then("^checking Live testing option in Solution field$")
	public void checking_Live_testing_option_in_Solution_field() throws IOException, InterruptedException  {
	    step.Solution_field_live_testing();
	    step.screenshot("src\\test\\resources\\Screenshot\\livetesting.png");
	}
	@Then("^checking Automated testing option in Solution field$")
	public void checking_Automated_testing_option_in_Solution_field() throws InterruptedException, IOException  {
	    step.Solution_field_Automated_testing();
	    step.screenshot("src\\test\\resources\\Screenshot\\Automatedtesting.png");

	}
	@Then("^check about us in company field$")
	public void check_about_us_in_company_field() throws InterruptedException, IOException  {
	    step.company_about_us();
	    step.screenshot("src\\test\\resources\\Screenshot\\company_aboutus.png");
	}

	@Then("^check company news in company field$")
	public void check_company_news_in_company_field() throws InterruptedException, IOException  {
	    step.company_news();
	    step.screenshot("src\\test\\resources\\Screenshot\\company_news.png");
	}
	
	@Then("^check valid partnership details in the company field$")
	public void check_valid_partnership_details_in_the_company_field() throws InterruptedException, IOException  {
	    step.valid_partner_details();
	    step.screenshot("src\\test\\resources\\Screenshot\\valid_partner_detail.png");
	    Thread.sleep(2000);
	  
	}
	
	@Then("^check Invalid partnership details in the company field$")
	public void check_Invalid_partnership_details_in_the_company_field() throws IOException, InterruptedException  {
	   step.Invalid_partners_details();
	   step.screenshot("src\\test\\resources\\Screenshot\\Invalid_partner_detail.png");
	   Thread.sleep(2000);
	 ;
	}

	}
	
