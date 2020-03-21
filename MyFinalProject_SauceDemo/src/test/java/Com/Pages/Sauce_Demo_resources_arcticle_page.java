package Com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Excel.Excel_utility;

public class Sauce_Demo_resources_arcticle_page extends Sauce_Demo_baseclass{
	
	By username= By.id("user-name");
	By password=By.id("password");
	By login=By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");

    By option=By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	By About=By.id("about_sidebar_link");
	By Resource=By.linkText("Resources");
	By Articles=By.linkText("Articles");
	
//	public void url()
//	{
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//	}
//
//	//homepage
//	public void homepage()
//	{
//		driver.get("https://www.saucedemo.com/");
//		System.out.println(driver.getTitle());
//	}
//	//login page
//	public void login() throws IOException, InterruptedException
//	{
//		Excel_utility excel= new Excel_utility();
//		
//		driver.findElement(username).sendKeys(excel.excel_username(1));
//		Thread.sleep(2000);
//	    driver.findElement(password).sendKeys(excel.excel_password(1));
//	    Thread.sleep(2000);
//	    driver.findElement(login).click();
//	}
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
//taking screenshot
//	public void screenshot(String path) throws IOException, InterruptedException
//	{
//	   TakesScreenshot ts=(TakesScreenshot)driver;
//	   File src=ts.getScreenshotAs(OutputType.FILE);
//	   FileUtils.copyFile(src,new File(path));					
//}
//
//		//closing browser
//	public void closebrowser() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		driver.close();
//	}
//
}
