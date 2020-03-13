package Com.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass
{
	protected WebDriver driver;
	public void launchApp(String browser,String url)
	{
	
	//To launch chrome browser	
	try {
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	// To launch firefox browser	
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	// To Maximize the windows	
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		}catch(WebDriverException e) {
		 	
			System.out.println("browser could not be launched");
		}
	}
	// To Take Screenshot
	public void screenshot(String path) throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File Source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source,new File(path));
	}
	// To close the browser
	public void close() throws InterruptedException
	{
		Thread.sleep(3000); //sleep time 3 sconds
		driver.close();
	}
}
