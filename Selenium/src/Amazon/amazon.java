package Amazon;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazon { 
	WebDriver driver;
	public void launchapp(String url) 
	  {
		 System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1218//Downloads//chromedriver_win32//chromedriver.exe");
		 driver=new ChromeDriver();
	     driver.get(url);
	     driver.manage().window().maximize();
}
	public void clickbyxpath(String path)	
	 {
		 driver.findElement(By.xpath(path)).click();
	 }
	public void clickbyxpath1(String path,String value)	
	 {
		 driver.findElement(By.xpath(path)).sendKeys(value);
	 }
	public void enterbyid(String loc,String value)
	 {
		 driver.findElement(By.id(loc)).sendKeys(value);
	 }
	public void enterbyid(String loc)
	 {
		 driver.findElement(By.id(loc));
	 }
	public void Screenshot(String path1) throws IOException
	 {
		 TakesScreenshot ts=((TakesScreenshot)driver);
			File Source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source,new File(path1));
	 }
	public void time(long value) throws InterruptedException
	{
		Thread.sleep(value);
	}
	
	public void tabswitch()
	{
		Set<String>winhandles=driver.getWindowHandles();
		for(String winhandle:winhandles)
		{
			driver.switchTo().window(winhandle);	
		}
		 String title=driver.getTitle();
	}
	public void closeapp()
	 {
		 driver.close();
	 }
}
