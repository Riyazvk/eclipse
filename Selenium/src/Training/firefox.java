package Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:/Users/BLTuser.BLT1218/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver fire=new FirefoxDriver();
		fire.get("https://www.google.com/intl/en-GB/gmail/about/");
	}

}
