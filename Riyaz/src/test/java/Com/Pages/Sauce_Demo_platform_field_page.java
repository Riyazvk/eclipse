package Com.Pages;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import Com.Excel.Excel_utility;


public class Sauce_Demo_platform_field_page {
	WebDriver driver;
	
	By username= By.id("user-name");
	By password=By.id("password");
	By login=By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");
	By option=By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	By About=By.id("about_sidebar_link");
	By Platform=By.linkText("Platform");
	By Selenium =By.linkText("Selenium");
	By cookies=By.linkText("OK");
	By platform_config=By.linkText("Platform configurator");
	By w3c=By.xpath("//*[@id=\"webdriver-api\"]/div[1]");
	By device=By.xpath("//*[@id=\"main-content\"]/div/ng-view/div/div[2]/spc-select/div/button[1]");
	By select_device=By.xpath("//*[@id=\"desktop\"]/div/div[1]/div/span[2]/span");
	By os=By.xpath("//*[@id=\"main-content\"]/div/ng-view/div/div[3]/spc-select/div/button[1]");
	By select_os=By.xpath("//*[@id=\"operating-system\"]/div/div[1]/div");
	By Browser =By.xpath("//*[@id=\"main-content\"]/div/ng-view/div/div[5]/div[1]/spc-select/div/button[1]");
    By select_browser=By.xpath("//*[@id=\"ms-edge\"]/div[2]/div[1]/div/span[2]/span"); 
	By view=By.xpath("//*[@id=\"copy-code\"]");
	
//Launch the required browser
		public void launchChrome(String browser) {
			try {
				if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
					driver = new ChromeDriver();
				}
				else if (browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Driver\\geckodriver.exe");
						driver = new FirefoxDriver();
					} 
				else if (browser.equalsIgnoreCase("internetexplorer")) {
						System.setProperty("webdriver.ie.driver", "src\\test\\resources\\Driver\\IEDriverServer.exe");
						driver = new InternetExplorerDriver();
					}
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				} catch (WebDriverException e) {
					System.out.println("browser cant be launched");
				}
			}

// launching homepage
		public void homepage()
		{
			driver.get("https://www.saucedemo.com/");
			System.out.println(driver.getTitle());
		}
		
//login into home page
		public void login() throws IOException, InterruptedException
		{
			Excel_utility excel= new Excel_utility();
			
			driver.findElement(username).sendKeys(excel.excel_username(1));
			Thread.sleep(2000);
		    driver.findElement(password).sendKeys(excel.excel_password(1));
		    Thread.sleep(2000);
		    driver.findElement(login).click();
		}
//searching product Z to A
		public void platformfield() throws InterruptedException
		{ 
		    driver.findElement(option).click();
		    driver.findElement(About).click();
		    Thread.sleep(2000);
		    driver.findElement(Platform).click();
		    driver.findElement(Selenium).click();
		    Thread.sleep(2000);
		    driver.findElement(cookies).click();
		    Thread.sleep(2000);
		    driver.findElement(platform_config).sendKeys(Keys.ENTER);
            driver.findElement(w3c).click();
            Thread.sleep(2000);
            driver.findElement(device).click();
            driver.findElement(select_device).click();
            Thread.sleep(2000);
            driver.findElement(os).click();
            driver.findElement(select_os).click();
            Thread.sleep(2000);
            driver.findElement(Browser).click();
            driver.findElement(select_browser).click();
	        driver.findElement(view).click();	
		}
//Taking screenshot		
		public void screenshot(String path) throws IOException, InterruptedException
		{
		   TakesScreenshot ts=(TakesScreenshot)driver;
		   File src=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src,new File(path));					
	}

//closing browser
		public void closebrowser() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.close();
		}


	
	
}
