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

import Com.Excel.Excel_utility;

public class Sauce_About_page {
	WebDriver driver;
	By username= By.id("user-name");
	By password=By.id("password");
	By login=By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");
	By option=By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	By About=By.id("about_sidebar_link");
	By company=By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[5]/div[1]/div/a");
	By Aboutus=By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[5]/div[2]/div/div/div/ul/li/div/ul/li/div/ul/li[1]/div/ul/li/a");
	By View_company_fact_sheet=(By.linkText("View company fact sheet"));
	
	public void url()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
	}
	public void login() throws IOException, InterruptedException
	{
		Excel_utility excel= new Excel_utility();
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		driver.findElement(username).sendKeys(excel.excel_username(1));
		Thread.sleep(2000);
	    driver.findElement(password).sendKeys(excel.excel_password(1));
	    Thread.sleep(2000);
	    driver.findElement(login).click();
	}
	public void About() throws InterruptedException
	{
		driver.findElement(option).click();
		Thread.sleep(2000);
		driver.findElement(About).click();
		Thread.sleep(2000);
		driver.findElement(company).click();
		Thread.sleep(2000);
		driver.findElement(Aboutus).click();
		Thread.sleep(2000);
		driver.findElement(View_company_fact_sheet).click();
	}
	public void Screenshot(String path) throws IOException, InterruptedException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(path));
		Thread.sleep(3000);
		driver.close();
	}
}
