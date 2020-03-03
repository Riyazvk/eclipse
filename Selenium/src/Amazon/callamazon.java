package Amazon;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;

public class callamazon {
	public static void main(String[] args) throws IOException, InterruptedException {
		amazon a=new amazon();
		a.launchapp("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
//	    a.time(2000);
//		a.clickbyxpath1("//*[@id=\"ap_customer_name\"]","Riyaz");
//		a.time(2000);
//		a.clickbyxpath("//*[@id=\"auth-country-picker-container\"]/span/span/span");
//		a.time(2000);
//		a.clickbyxpath("//*[@id=\"auth-country-picker_90\"]");
//		a.time(2000);
//		a.enterbyid("ap_phone_number","8667347662");
//		a.time(2000);
//		a.enterbyid("ap_email","riyariyaz.1109@gmail.com");
//		a.time(2000);
//		a.enterbyid("ap_password","Riyaz7**");
//		a.time(2000);
		a.clickbyxpath("//*[@id=\"continue\"]");	
		//a.time(2000);
		a.clickbyxpath("//*[@id=\"ap_register_form\"]/div/div/div[8]/a");
		//a.Screenshot("C:\\Users\\BLTuser.BLT1218\\Desktop\\New folder\\Selenium\\screeenshot\\1.png");
		a.time(2000);
		a.enterbyid("ap_email","soundaryariya27@gmail.com");
		//a.time(2000);
		a.clickbyxpath("//*[@id=\"continue\"]");
		
		a.enterbyid("ap_password","soundarya");
		a.clickbyxpath("//*[@id=\"signInSubmit\"]");
		//a.time(2000);
		
		a.clickbyxpath1("//*[@id=\"twotabsearchtextbox\"]", "adidas shoe for mens");
		a.clickbyxpath("//*[@id=\"nav-search\"]/form/div[2]/div/input");
		a.clickbyxpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[3]/h2/a/span");
		a.tabswitch();
		a.clickbyxpath("//*[@id=\"variation_size_name\"]");
		a.clickbyxpath("//*[@id=\"native_size_name_0\"]");
		a.clickbyxpath("//*[@id=\"a-autoid-10-announce\"]/div/div[1]/img");
		a.clickbyxpath("//*[@id=\"add-to-cart-button\"]");
		a.enterbyid("buy-now-button");
		//a.clickbyxpath("//*[@id=\"buy-now-button\"]");
	}
}
