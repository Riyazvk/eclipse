package Assign;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class countlinks {
	static WebDriver driver;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1218//Downloads//chromedriver_win32//chromedriver.exe");
		 driver=new ChromeDriver();
          driver.get("https://www.google.com/search?source=hp&ei=xdFLXo3RDsKv8QOv5YfgDA&q=java&oq=java&gs_l=psy-ab.3..0j0i131j0l8.17956.18361..18669...0.0..0.130.506.0j4....2..0....1..gws-wiz.......46i322i395j46i322i131i395j46i199i291i395..23%3A0g152g135g138g147j24%3A0g1g1g1g1.v7Z3U177Wm0&ved=0ahUKEwjNx9_MhtvnAhXCV3wKHa_yAcwQ4dUDCAc&uact=5");
          
          List<WebElement> links = driver.findElements(By.xpath("//a"));    //Identify the number of Link on webpage and assign into Webelement List 
          
          int linkCount = links.size();     // Count the total Link list on Web Page
          
          System.out.println("Total Number of link count on webpage = "  + linkCount);    //Print the total count of links on webpage
          
          List<WebElement> allElements = driver.findElements(By.xpath("//*"));      //Identify all the elements on web page
          
          int elementsCount = allElements.size();     //Count the total all element on web page
          
          System.out.println("Total Number of All Element on webpage = "  + elementsCount);         //Print the total count of all element on webpage
          
                   
    }
}
