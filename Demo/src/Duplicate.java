import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		int n,i,j;
		 int a[]= new int[10];
		 int b[]= new int[10];
		 
		 System.out.println("enter the number");
		 Scanner in =new Scanner(System.in);
		 
		 n=in.nextInt();
		 for(i=0;i<n;i++)
		 {
			 a[i]=in.nextInt();
		 }
		 for ( i = 0; i < n; i++) 
	     {
	         for ( j = i + 1; j < n; j++) 
	         {
	             if (a[i] == a[j]) 
	             {
	            	 b[i]=a[i];
	            	 n--;
	            	 
	               
	             }
	         }
	     }
		
		 for(i=0;i<n;i++)
		 {
			 System.out.println(a[i]);
		 }	// TODO Auto-generated method stub

	}

}
