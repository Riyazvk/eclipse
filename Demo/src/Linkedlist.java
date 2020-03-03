import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LinkedList<Float> al= new LinkedList<Float>();
 al.add(10.12F);
 al.add(20.13F);
 al.add(30.05f);
 al.add(40.99f);
 System.out.println(al);
Iterator itr=al.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
al.remove(2);
System.out.println("After removing 2nd element" +al);
}

}
