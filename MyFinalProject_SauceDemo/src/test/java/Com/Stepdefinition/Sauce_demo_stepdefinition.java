package Com.Stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_Demo_Invalid_contactdetail_page;
import Com.Pages.Sauce_Demo_Invalid_login_page;
import Com.Pages.Sauce_Demo_addtocart_page;
import Com.Pages.Sauce_Demo_baseclass;
import Com.Pages.Sauce_Demo_companyaboutus_page;
import Com.Pages.Sauce_Demo_companycareer_page;
import Com.Pages.Sauce_Demo_companynews_page;
import Com.Pages.Sauce_Demo_login_page;
import Com.Pages.Sauce_Demo_platform_supportedbrowsers_page;
import Com.Pages.Sauce_Demo_resources_arcticle_page;
import Com.Pages.Sauce_Demo_search_page;
import Com.Pages.Sauce_Demo_solution_aotomatedtesting_Page;
import Com.Pages.Sauce_Demo_solution_livetesting_page;
import Com.Pages.Sauce_Demo_validcontactdetail_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Sauce_demo_stepdefinition {
	
	Sauce_Demo_login_page                      s1=new Sauce_Demo_login_page();
	Sauce_Demo_Invalid_login_page              s2=new Sauce_Demo_Invalid_login_page();  
	Sauce_Demo_search_page                     s3=new Sauce_Demo_search_page();
	Sauce_Demo_addtocart_page                  s4=new Sauce_Demo_addtocart_page();
	Sauce_Demo_companycareer_page              s5=new Sauce_Demo_companycareer_page();
	Sauce_Demo_resources_arcticle_page         s6=new Sauce_Demo_resources_arcticle_page();
	Sauce_Demo_platform_supportedbrowsers_page s7=new Sauce_Demo_platform_supportedbrowsers_page();
	Sauce_Demo_solution_livetesting_page       s8=new Sauce_Demo_solution_livetesting_page();
	Sauce_Demo_solution_aotomatedtesting_Page  s9=new Sauce_Demo_solution_aotomatedtesting_Page();
	Sauce_Demo_companyaboutus_page             s10=new Sauce_Demo_companyaboutus_page();
	Sauce_Demo_companynews_page                s11=new Sauce_Demo_companynews_page();
	Sauce_Demo_validcontactdetail_page         s12=new Sauce_Demo_validcontactdetail_page();
	Sauce_Demo_Invalid_contactdetail_page      s13=new Sauce_Demo_Invalid_contactdetail_page();
	Sauce_Demo_baseclass s=new Sauce_Demo_baseclass(); 
	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application()  {
	    s.url();
	    
	}

	@When("^the user open the Sauce_demo Home page$")
	public void the_user_open_the_Sauce_demo_Home_page()   {
		s.homepage();
	
	}

	@Then("^the user login using username and password$")
	public void the_user_login_using_username_and_password() throws IOException, InterruptedException  {
		for(int i=1;i<3;i++)
			   {
			       s1.signin(i);
			   }
		s.screenshot("src\\test\\resources\\Screenshot\\valid.png");
	}

	@Then("^close the browser$")
	public void close_the_browser() throws InterruptedException  {
	    s.closebrowser();
		}

	@Then("^the user login using invalid username and password$")
	public void the_user_login_using_invalid_username_and_password() throws IOException, InterruptedException  {
	    s2.Invalidlogin();
	    s.screenshot("src\\test\\resources\\Screenshot\\Invalid.png");
	}

	@Then("^The user login the home page$")
	public void the_user_login_the_home_page() throws IOException, InterruptedException  {
	    s.login();
	
	}

	@Then("^Search the product$")
	public void search_the_product() throws InterruptedException, IOException {
	    s3.Searching();
	    s.screenshot("src\\test\\resources\\Screenshot\\search.png");
	}

	@Then("^Add to cart$")
	public void add_to_cart() throws InterruptedException, IOException  {
	    
		s4.addcart();
	    s.screenshot("src\\test\\resources\\Screenshot\\addcart.png");
	}

	@Then("^Select any field in about$")
	public void select_any_field_in_about() throws InterruptedException, IOException  {
	    s5.About_company_career();
	    s.screenshot("src\\test\\resources\\Screenshot\\about.png");
	}
	@Then("^Select Articles from resource field$")
	public void select_Articles_from_resource_field() throws IOException, InterruptedException  {
	    s6.resource_field();
	    s.screenshot("src\\test\\resources\\Screenshot\\Resources.png");
	   
	}

	@Then("^checking supported browsers in platform field$")
	public void checking_supported_browsers_in_platform_field() throws IOException, InterruptedException  {
	    s7.platform_field();
	    s.screenshot("src\\test\\resources\\Screenshot\\Platform_supported_browser.png");
	}

	@Then("^checking Live testing option in Solution field$")
	public void checking_Live_testing_option_in_Solution_field() throws IOException, InterruptedException  {
	    s8.Solution_field_live_testing();
	    s.screenshot("src\\test\\resources\\Screenshot\\livetesting.png");
	}
	@Then("^checking Automated testing option in Solution field$")
	public void checking_Automated_testing_option_in_Solution_field() throws InterruptedException, IOException  {
	    s9.Solution_field_Automated_testing();
	    s.screenshot("src\\test\\resources\\Screenshot\\Automatedtesting.png");

	}
	@Then("^check about us in company field$")
	public void check_about_us_in_company_field() throws InterruptedException, IOException  {
	    s10.company_about_us();
	    s.screenshot("src\\test\\resources\\Screenshot\\company_aboutus.png");
	}

	@Then("^check company news in company field$")
	public void check_company_news_in_company_field() throws InterruptedException, IOException  {
	    s11.company_news();
	    s.screenshot("src\\test\\resources\\Screenshot\\company_news.png");
	}
	
	@Then("^check valid partnership details in the company field$")
	public void check_valid_partnership_details_in_the_company_field() throws InterruptedException, IOException  {
	    s12.valid_partner_details();
	    s.screenshot("src\\test\\resources\\Screenshot\\valid_partner_detail.png");
	    Thread.sleep(2000);
	  
	}
	
	@Then("^check Invalid partnership details in the company field$")
	public void check_Invalid_partnership_details_in_the_company_field() throws IOException, InterruptedException  {
	   s13.Invalid_partners_details();
	   s.screenshot("src\\test\\resources\\Screenshot\\Invalid_partner_detail.png");
	   Thread.sleep(2000);
	 
	}

	}
	
