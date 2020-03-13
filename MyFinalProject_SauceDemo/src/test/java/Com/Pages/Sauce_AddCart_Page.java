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

public class Sauce_AddCart_Page {
	WebDriver driver;
	By username= By.id("user-name");
	By password=By.id("password");
	By login=By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");
	By Addcart=By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
    By ViewCart=By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"); 
    By Checkout=By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]");
    By FirstName=By.id("first-name");
    By LastName=By.id("last-name");
    By PostalCode=By.id("postal-code");
    By Continue=By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input");
    By Finish=By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]");
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
 public void addcart() throws InterruptedException
 {
	   driver.findElement(Addcart).click();
	   Thread.sleep(2000);
	   driver.findElement(ViewCart).click();
	   Thread.sleep(2000);
	   driver.findElement(Checkout).click();
	   Thread.sleep(2000);
	   driver.findElement(FirstName).sendKeys("Riyaz");
	   Thread.sleep(2000);
	   driver.findElement(LastName).sendKeys("Ahamed");
	   Thread.sleep(2000);
	   driver.findElement(PostalCode).sendKeys("605110");
	   Thread.sleep(2000);
	   driver.findElement(Continue).click();
	   Thread.sleep(3000);
	   driver.findElement(Finish).click();
 }
 public void Screenshot(String path) throws InterruptedException, IOException
 {
	 TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(path));
		Thread.sleep(3000);
		driver.close();
 }
}
