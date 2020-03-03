package abstraction;

public class Testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank a=new hdfc() ;


a.detail();
System.out.println("hdfc roi \t" +a.getroi());

a=new icici();
System.out.println("icici roi \t"+a.getroi());


	}

}
