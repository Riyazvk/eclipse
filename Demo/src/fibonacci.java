import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,t1=0,t2=1,t3;
System.out.println("enter the number");
Scanner in=new Scanner(System.in);
System.out.println(+t1+ +t2);
n= in.nextInt();
for(int i=0;i<=n;i++)
{
	t3=t1+t2;
	System.out.println(+t3);
	t1=t2;
	t2=t3;
}

	}

}
