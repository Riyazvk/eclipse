package Com.main_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedin_login_java {
	WebDriver driver;
	//WebElement cucumber;

	public void launchUrl() {
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1218//Downloads//chromedriver_win32//chromedriver.exe");		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void homepage() {
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

	}

	public void cucumber() {

   driver.findElement(By.id("username")).sendKeys("riyariyaz.1109@gmail.com");
   driver.findElement(By.id("password")).sendKeys("riyaz");
			
	}
	public void cucumber1() {
		driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
	}
	
}