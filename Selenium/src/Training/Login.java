package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1218//Downloads//chromedriver_win32//chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
driver.get("https://www.linkedin.com");
//driver.findElement(By.className("nav__button-secondary")).click();
//driver.findElement(By.id("username")).sendKeys("riyariyaz.1109@gmail.com");
//driver.findElement(By.id("password")).sendKeys("naseeha7**");	
//driver.findElement(By.className("btn__primary--large from__button--floating")).click();	
//relative xpath   
//driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
	//driver.close();
	//driver.quit();
driver.findElement(By.xpath("//*[@class='pill pill--talent-finder-cta']")).click();	
//driver.findElement(By.linkText("Join now")).click();
//driver.findElement(By.partialLinkText("join")).click();

//using or and
driver.findElement(By.xpath("//*[@id='first-name-ember18'and @type='text']")).sendKeys("riyaz");
driver.findElement(By.xpath("//*[@id='last-name-ember18'or @data-test-form-input='lastName']")).sendKeys("Ahamed");
driver.findElement(By.xpath("//*[contains(@id,'address')]")).sendKeys("riyariyaz.1109@gmail.com");	
driver.findElement(By.xpath("//*[starts-with(@id,'password-ember18')]")).sendKeys("Riyaz7**");
//driver.findElement(By.xpath("//*[@class='button-x-large wow-page__submit-button'or @type='submit']")).click();
	
	}

}
