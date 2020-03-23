package Com.Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class Sauce_Demo_platform_supportedbrowsers_page extends Sauce_Demo_baseclass{
	
	By username= By.id("user-name");
	By password=By.id("password");
	By login=By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");

    By option=By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	By About=By.id("about_sidebar_link");
	By Platform=By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[2]/div[1]/div/a");
	By SupportedBrowserDevices=By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[2]/div[2]/div/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[7]/div/ul/li/a");
	

	//checking browsers tab in platform field
	public void platform_field() throws InterruptedException
	{
		driver.findElement(option).click();
		Thread.sleep(2000);
		driver.findElement(About).click();
		Thread.sleep(2000);
		driver.findElement(Platform).click();
		Thread.sleep(2000);
		driver.findElement(SupportedBrowserDevices).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
	}



}
