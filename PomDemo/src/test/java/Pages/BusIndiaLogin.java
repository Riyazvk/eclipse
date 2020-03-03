package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BusIndiaLogin {
	WebDriver driver;
	By oneway=By.id("radOnewayOrReturnTrip1");
	By roundtrip=By.id("radOnewayOrReturnTrip2");
	By from=By.id("matchFromPlace");
	By to=By.id("matchToPlace");
	By dept=By.xpath("//*[@id=\"txtdeptDateRtrip\"]");
	By ddate=By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[4]/a");
	By Return=By.xpath("//*[@id=\"txtretnDateRtrip\"]");
	By returndate=By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[6]/a");
    By search=By.xpath("//*[@id=\"searchForm\"]/div[3]/div[1]/div/div/div/div[1]/div[8]/button");
    public BusIndiaLogin(WebDriver driver)
    {
    	this.driver=driver;
    }
    public void onewaytrip()
    {
    	 driver.findElement(oneway).click();
    }
    public void roundwaytrip()
    {
    	 driver.findElement(roundtrip).click();
    }
    public void fromid(String value)
    {
    	 driver.findElement(from).sendKeys(value);
    }
    public void Toid(String value)
    {
    	 driver.findElement(to).sendKeys(value);
    }
    public void deptdate()
    {
    	driver.findElement(dept).click();
    }
    public void deptdate1()
    {
    	driver.findElement(ddate).click();
    }
    public void returndate()
    {
    	driver.findElement(Return).click();
    }
    public void returndate1()
    {
    	driver.findElement(returndate).click();
    }
    public void searchbutton()
    {
    	 driver.findElement(search).click();
    }
}
