package Com.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Sauce_Demo_solution_livetesting_page extends Sauce_Demo_baseclass {

	
	By username= By.id("user-name");
	By password=By.id("password");
	By login=By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");

    By option=By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	By About=By.id("about_sidebar_link");
	By Solution=By.linkText("Solutions");
	By Live_Testing=By.linkText("Live Testing");
	
	//checking live testing tab in solution field
	public void Solution_field_live_testing() throws InterruptedException
	{
		driver.findElement(option).click();
		Thread.sleep(2000);
		driver.findElement(About).click();
		Thread.sleep(2000);
		driver.findElement(Solution).click();
		driver.findElement(Live_Testing).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
}
