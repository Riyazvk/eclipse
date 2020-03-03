package Exception;

public class throws_example_1 {
 
	public void f1() throws ArithmeticException
	{
		System.out.println("In f1 before ");
		int a=10,b=0,c;
		c=a/b;
		System.out.println("in f1-after");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("in main-before");
  try {
  throws_example_1 te=new throws_example_1();
  te.f1();
  }
  catch(ArithmeticException ae)
  {
	  System.out.println("IN Arithmeticexception");
  }
  System.out.println("in main-after");
	}

}
