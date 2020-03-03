import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int n,i;
		boolean flag=true;
		System.out.println("enter any number");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=2;i<=n;i++)
		{
			if (n%2==0)
			{
				flag=false;
				break;
						
			}
		}
		if(flag)
			
			{
				System.out.println("it is  prime number ");
			}
		else
		{
			System.out.println("it is not prime number ");
		}
		
	}
}
