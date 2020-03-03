import java.util.Scanner;

public class Prog_4 {
	public static void main(String[] args) {
		int a;
		System.out.println("enter any number");
		Scanner b= new Scanner (System.in);
		a=b.nextInt();
		if (a%7==0)
		{
			System.out.println("\n the number is divisible by 7");
			
		}
		else {
			System.out.println("\n the number is not divisible by 7");
		}
		
	}
}
