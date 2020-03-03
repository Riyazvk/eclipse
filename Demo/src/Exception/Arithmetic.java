package Exception;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=10,b=0,c;
 
 try {
	 int arr[]= {1,2,3};
	 System.out.println(arr[3]);
	 System.out.println("hii");
	 c=a/b;
	 System.out.println(c);
	 
 }
 catch(ArithmeticException ae)
 {
	 System.out.println("in catch arithmetic exception ");
 }
 catch(ArrayIndexOutOfBoundsException ae)
 {
	 System.out.println("in catch Array index out of bound exception");
 }
 //c=a/b;
 //System.out.println(c);
 System.out.println("after catch block");
	}

}
