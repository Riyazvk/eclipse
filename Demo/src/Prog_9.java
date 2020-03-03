import java.util.Scanner;

public class Prog_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int unit;
System.out.println("enter the unit");
Scanner a = new Scanner(System.in);
unit=a.nextInt();



if(unit >0 && unit <=100)
{
	System.out.println("free charge");
}
else if(unit >101 && unit <=200)
{
	System.out.println("Rs 2per  unit old charge");
	int oldcharge= unit*2;
	System.out.println(oldcharge);	
	System.out.println("Rs 3per  unit new charge");
	int newcharge= unit*3;
	System.out.println(newcharge);
	int billunit=oldcharge-newcharge;
	System.out.println("billunit");
	System.out.println(billunit);
}
else if(unit >201 && unit <=300)
{
	System.out.println("Rs 3per unit");
	System.out.println(unit*3);
}
else if(unit >301 && unit <=400)
{
	System.out.println("Rs 4per unit");
	System.out.println(unit*4);
}
else if(unit >401)
{
	System.out.println("Rs 2per unit");
	System.out.println(unit*5 + 10/100);
}


	}

}
