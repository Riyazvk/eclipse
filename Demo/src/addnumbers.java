import java.util.Scanner;

public class addnumbers {
 public static void main(String[]arg) {
 int a,b;
  int c,d,e;
  Scanner add =new Scanner(System.in);
  System.out.println("Enter the number a");
  a= add.nextInt();
  System.out.println("enter the numbner b");
  b=add.nextInt();
  System.out.println("enter the numbner c");
  c=add.nextInt();
  d=a+b+c;
  e=d/3;
  System.out.println("the sum is"+d);
  System.out.println("the average is"+e);
 }
}