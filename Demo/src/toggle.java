import java.util.Scanner;

public class toggle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str;
    int i;
    System.out.println("\n enter the name ");
    Scanner b =new Scanner(System.in);
    str=b.nextLine();
    char a[]= str.toCharArray();
    for(i=0;i<a.length;i++)
    {
    	if ( a[i]>='A' && a[i]<='Z')
    	{
    		a[i]=(char)((int)a[i]+33);
    	}
    	else if( a[i]>='a' && a[i]<='z')
    	{
    		a[i]=(char)((int)a[i]-33);
    	}
    }
    System.out.println("the toggled string is...");
    for(  i=0;i<a.length;i++)
    	System.out.print(a[i]);
    
	}
}
