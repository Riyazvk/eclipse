package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedinLogin {
WebDriver driver;
By username=By.id("username");
By password=By.id("password");
By signin=By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
public LinkedinLogin(WebDriver driver)
{
	this.driver=driver;
}
public void enterbyid(String userid)
{
	 driver.findElement(username).sendKeys(userid);
}
public void enterbypass(String pass)
{
	 driver.findElement(password).sendKeys(pass);
}
public void login()	
{
	 driver.findElement(signin).click();
}


}
