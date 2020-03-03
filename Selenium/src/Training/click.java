package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1218//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement E1=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		WebElement E2=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		WebElement E3=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		WebElement E4=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		Actions action= new Actions(driver);
		//c.dragAndDrop(a,b).build().perform();
	   action.clickAndHold(E1).clickAndHold(E4).release().build().perform();
	}

}
