package Com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumHq_Page {
// Selenium home page
// clicking download tab and bit link	
	WebDriver driver;
    By DownloadTab=By.linkText("Downloads");
    By DownloadBit=By.linkText("64 bit Windows IE");

    public SeleniumHq_Page(WebDriver driver)
	{
		this.driver=driver;
	}
    
    
public void click()
{
	driver.findElement(DownloadTab).click();
	driver.findElement(DownloadBit).click();
}

}
