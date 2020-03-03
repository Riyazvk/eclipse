package Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetexplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:/Users/BLTuser.BLT1218/Downloads/IEDriverServer_x64_3.141.59/IEDriverServer.exe");	
		WebDriver ie=new InternetExplorerDriver();	
		ie.get("https://www.google.com/");
	}

}
