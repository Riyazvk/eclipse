package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1218//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]")).isDisplayed());
	//out of frame
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Draggable")).click();
	driver.findElement(By.linkText("Droppable")).click();
	WebElement a=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement b=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	Actions c= new Actions(driver);
	c.dragAndDrop(a,b).build().perform();
	}

}
