package Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library.Wrapperclass;
import Pages.LinkedinLogin;

public class logintestcases extends Wrapperclass{
@BeforeClass
public void startup()
{
	launchApplication("chrome","https://www.linkedin.com/login");
}
@Test
public void login()
{
	LinkedinLogin lpage=new LinkedinLogin(driver);
	lpage.enterbyid("riyariyaz.1109@gmail.com");
	lpage.enterbypass("riyaz7**");
	lpage.login();
}
@AfterClass
public void close()
{
	quit();
}
}
