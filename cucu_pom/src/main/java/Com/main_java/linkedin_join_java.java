package Com.main_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedin_join_java {
	WebDriver driver;
	//WebElement cucumber;

	public void Url() {
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1218//Downloads//chromedriver_win32//chromedriver.exe");		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void joinpage() {
		driver.get("https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");

	}

	public void join() {

   driver.findElement(By.name("email-or-phone")).sendKeys("riyariyaz.1109@gmail.com");
   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("riyaz");
			
	}
	public void cucu() {
		driver.findElement(By.xpath("//*[@id=\"join-form-submit\"]")).click();
	}
	
}
