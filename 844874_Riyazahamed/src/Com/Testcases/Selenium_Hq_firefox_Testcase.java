package Com.Testcases;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.BaseClass.Baseclass;
import Com.Pages.SeleniumHq_Page;
import org.testng.Assert;

public class Selenium_Hq_firefox_Testcase extends Baseclass {

@BeforeClass
//launching firefox browser
public void launch()
{
	launchApp("firefox","https://www.seleniumhq.org/");
}

@Test
//checking assert conditions of downloaded file
public void Assert()
{
	SeleniumHq_Page sel=new SeleniumHq_Page(driver);
	sel.click();
	String filename="IEDriverServer_x64_3.150.1.zip";
	File download_file=new File("C:\\Users\\BLTuser.BLT1218\\Downloads\\IEDriverServer_x64_3.150.1.zip");	
	Assert.assertEquals(filename,download_file.getName());
	System.out.println(download_file.getName());
	System.out.println("Successful download of the zip file");
}

@AfterClass
//taking screenshot and closing browser
public void closebrowser() throws IOException, InterruptedException
{
	screenshot("Screenshot\\firefoxdownload.png");
	close();
}

}