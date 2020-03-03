
public class NullException {
	public static void main (String []args) {
		int a=10,b=6,c;
		String name=null;
		try {
		c=a/(b-6);	
		System.out.println(name.length());
        int x= Integer.parseInt(name);		
		}
		catch(ArithmeticException ae)
		{
			 System.out.println("arithmetic exception");
		}
		catch(NullPointerException npe)
		{
			 System.out.println("NullPointerException");
		}
		catch(NumberFormatException nfe)
		{
			 System.out.println("NumberFormatException nfe");
		}
		catch(Exception e)
		{
			 System.out.println("Exception");
		}

		}
		}


