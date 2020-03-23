package Com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Sauce_Demo_resources_arcticle_page extends Sauce_Demo_baseclass{
	
	By username= By.id("user-name");
	By password=By.id("password");
	By login=By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");

    By option=By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	By About=By.id("about_sidebar_link");
	By Resource=By.linkText("Resources");
	By Articles=By.linkText("Articles");
	
	//checking Articles tab in resources field
	public void resource_field() throws InterruptedException
	{
		driver.findElement(option).click();
		Thread.sleep(2000);
		driver.findElement(About).click();
		Thread.sleep(2000);
		driver.findElement(Resource).click();
		Thread.sleep(2000);
		driver.findElement(Articles).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
	}
}
