package Training;

import java.io.IOException;

public class callwrapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Wrapper w=new Wrapper();
		w.launchapp("https://www.linkedin.com/");
		w.clickbyxpath("/html/body/nav/a[3]");
		w.enterbyid("username","riyariyaz.1109@gmail.com");
		w.enterbyid("password", "naseeha7**");
		w.clickbyxpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
		w.Screenshot("C:\\Users\\BLTuser.BLT1218\\Desktop\\New folder\\Selenium\\screeenshot\\.png");
	
	}
}
