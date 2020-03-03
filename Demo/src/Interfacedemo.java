abstract class int1 implements Interface1
{
	abstract  void show1();
	
	public void display()
	{
		System.out.println("Display method ");
	}
}
class int2 extends int1 implements Interface1
{
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		public void show()
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		{
		System.out.println("Show method");
	}
	public void display()
	{
	 	System.out.println("Display method  in derived");
	 	super.display();
	}
	
	void show1() {
		System.out.println("aru");
		// TODO Auto-generated method stub
		
	}
}
public class Interfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int2 obj=new int2();
		obj.show();
		obj.display();
		obj.show1();
		

	}

}
