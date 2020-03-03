package Testcases;

import org.testng.annotations.Test;

import Library.Wrapperclass;
import Pages.BusIndiaLogin;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class NewTest extends Wrapperclass{
  @BeforeClass
  public void startup()
  {
  	launchApplication("chrome","http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp");
  }
  @Test
  public void beforeClass() {
	  BusIndiaLogin a=new BusIndiaLogin(driver);
	  a.onewaytrip();
	  a.roundwaytrip();
	  a.fromid("pondicherry");
	  a.Toid("chennai");
	  a.deptdate();
	  a.deptdate1();
	  a.returndate();
	  a.returndate1();
	  a.searchbutton();
  }

  @AfterClass
  public void afterClass() {
	  quit();
  }

}
