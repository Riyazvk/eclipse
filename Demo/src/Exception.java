
public class Exception {
 public static void main (String []args) {
 
int a=10,b=6,c;
try {	
	c= a/(b-6);
   System.out.println("c value is: "+c);	
    }
   catch(ArithmeticException ae)
{
	 System.out.println("Divide by Zero is error");
}
}
}
