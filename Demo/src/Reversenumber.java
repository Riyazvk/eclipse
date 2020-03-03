import java.util.Scanner;

public class Reversenumber {
	public static void main(String args[]) {
		int n,rev=0,remainder;
		System.out.println("Enter the number");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int temp=n;
		while(n!=0)
		{
			remainder=n%10;
			rev=rev*10+remainder;
			n=n/10;
		}
		System.out.println("thr reverse number is"+rev);
	    if(temp==rev)
	    {
	    	System.out.println("the number is palindrome");
	    }
	    else
	    {
	    	System.out.println("the number is not palindrome");
	    }
	}
}
