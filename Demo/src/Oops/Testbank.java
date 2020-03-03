package Oops;

public class Testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank a;
a=new Hdfc();
System.out.println("rate of interest of HDFC Bank is"+a.roi());
a=new Axix();
System.out.println("rate of interest of AXIS Bank is"+a.roi());
	}

}
