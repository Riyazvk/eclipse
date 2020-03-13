package Com.testcase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Baseclass.WrapperClass;
import Com.ExcelUtility.excellogin;
import Com.pages.Amazon_login_page;


public class Amazon_login_testcase_firefox extends WrapperClass{
	
// Launching firefox browser	
@BeforeMethod
public void startup() 
{
	launchApplication("firefox","https://www.amazon.in/");	
}

//amazon  valid login
@Test
public void login() throws IOException
{
	Amazon_login_page lpage=new Amazon_login_page(driver);
	excellogin data=new excellogin();
	lpage.click_signin();
	lpage.userid(data.excel_username(1)); //read the username from excelsheet
	lpage.next();
	lpage.pass(data.excel_password(1));//read the password from excelsheet
	lpage.sign_in();
}
// amazon invalid login
@Test
public void login1() throws IOException
{
	Amazon_login_page lpage=new Amazon_login_page(driver);
	excellogin data=new excellogin();
	lpage.click_signin();
	lpage.userid(data.excel_username(2)); //read the username from excelsheet
	lpage.next();
	lpage.pass(data.excel_password(2));//read the password from excelsheet
	lpage.sign_in();
}

//taking screenshot and closing the browser
@AfterMethod
public void close() throws IOException
{
	screenshot("src\\test\\resources\\Screenshot\\loginfirefox.png");
	quit();
}
}

