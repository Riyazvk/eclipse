package Com.Steps;


import Com.main_java.linkedin_login_java;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_steps {
	linkedin_login_java a=new linkedin_login_java();
@Given("^the user launched the chrome browser$")
public void the_user_launched_the_chrome_browser()  {
    // Write code here that turns the phrase above into concrete actions
    a.launchUrl();
}

@When("^the user opens linkedin login page$")
public void the_user_opens_linkedin_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   a.homepage();
}

@Then("^verify the user name and password$")
public void verify_the_user_name_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    a.cucumber();
}

@Then("^to verify signin$")
public void to_verify_signin() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    a.cucumber1();
}


}
