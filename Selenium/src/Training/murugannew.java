package Training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class murugannew {

	public static void main(String[] args) throws IOException 
	{
    System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1218//Downloads//chromedriver_win32//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://sts.cognizant.com/adfs/ls/?client-request-id=d8e1f50c-394c-4c35-b8d4-7da9d9e37d7c&username=&wa=wsignin1.0&wtrealm=urn%3afederation%3aMicrosoftOnline&wctx=estsredirect%3d2%26estsrequest%3drQIIAeNisFLKKCkpKLbS18_PS03OT8_LrErMK9FDZuUWCXEJ8Hx9eMPH0tRnx5XalTcf19bMYuRFUbOK0ZqwQfrBjr4-wcH--o6lJRnBqUVlmcmpxfqOycWHGFXjk80szVPMTU11jQ0sTHVNTAzTdC3SUs10zS2SklISEw0NUpKSLzAyvmBkvMXEGpyYm2M0i5lRfxOzSkqqgUWyiYG5rqFlkqWuiZF5iq5lWqqFbmpKmpGpibGBQXKi-QUWnlcsPAbMVhwcbAKMEgwKDD9YGBexAj3Wq1PCG3A9wG1vx4-X-Yc1GE6x6pcbp6RkhhkYFml7pnhb5pT7m-e7Baa4uQaXRQT6R1iGBruVWOb76heZh1nYWloZTmDjPcXG8IGNsYOd4QAn4y0uESMDIwNdAyNdI0MFA6ACIysD4ygA0#");
  TakesScreenshot sc=((TakesScreenshot)driver);
  File src=sc.getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(src,new File("C:\\Users\\BLTuser.BLT1218\\Desktop\\muurgan.png"));
  
  
    /*driver.findElement(By.xpath("//*[@id=\"newUsedSearchOption\"]/li[2]")).click();
   driver.findElement(By.id("usedCarsList")).sendKeys("pondicherry");
   driver.findElement(By.id("usedCarsList")).sendKeys(Keys.ENTER);
   driver.findElement(By.xpath("//*[@id=\"minPriceList\"]/li[4]")).click();
   driver.findElement(By.xpath("//*[@id=\"maxPriceList\"]/li[4]")).click();
   driver.findElement(By.id("btnFindCar")).click();*/
   
   
   
	}

}
