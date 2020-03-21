package Com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Com.Excel.Excel_utility;

public class Sauce_Demo_search_page extends Sauce_Demo_baseclass {

	
	By username= By.id("user-name");
	By password=By.id("password");
	By login=By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");
	
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
	//login page
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

	//searching product Z to A
	public void Searching() throws InterruptedException
	{ 
		Thread.sleep(2000);
		Select search=new Select (driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")));
	    search.selectByValue("za");
	    
	}
	//taking screenshot
	public void screenshot(String path) throws IOException, InterruptedException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(path));
				
				
	}

//	//closing browser
//	public void closebrowser() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		driver.close();
//	}

}
