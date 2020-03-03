package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststep {
	WebDriver driver;
	@Given("^I launch Chrome browser$")
	public void launch_browser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1218//Downloads//chromedriver_win32//chromedriver.exe");	driver=new ChromeDriver();
	Thread.sleep(5000);
	}
	@When("^I open Google Homepage$")
	public void open_homepage() throws InterruptedException
	{
	Thread.sleep(5000);
	driver.get("https://in.linkedin.com/");
	}
	
	@Then("^I verify sign in page is displayed$")
	public void signin()  {
		driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("^I verify that username is Entered$")
	public void username()  {
		driver.findElement(By.id("username")).sendKeys("riyariyaz.1109@gmail.com");
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("^I verify that password is Entered$")
	public void password()  {
		driver.findElement(By.id("password")).sendKeys("riyaz");
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@And("^clicks the submit button$")
	public void clicks_the_submit_button() {
	    driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
	}
		
}
