package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1218//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	   
		Select day=new Select (driver.findElement(By.id("day")));
	    day.selectByIndex(28);
	    
	    Select month=new Select (driver.findElement(By.id("month")));
	    month.selectByIndex(12);
	    
	    Select year=new Select (driver.findElement(By.id("year")));
	    year.selectByValue("1997");
	    
	    driver.findElement(By.id("u_0_7")).click();
	    
	          
	}

}
