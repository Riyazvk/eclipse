import java.util.Scanner;
public class Array {
 public static  void main(String[] args) {
	 int n,i,j,temp;
	 int a[]= new int[10];
	 
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
             if (a[i] < a[j]) 
             {
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         }
     }
	 for(i=0;i<n;i++)
	 {
		 System.out.println(a[i]);;
	 }
	 
 }
}
