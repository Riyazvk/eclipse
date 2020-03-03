import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedHashSet<Integer> al = new  LinkedHashSet<Integer>();
   al.add(63);
   al.add(2);
   al.add(7);
   al.add(7);
   al.add(2);
   
   System.out.println(al);
   Iterator itr=al.iterator();  
   while(itr.hasNext()){  
   System.out.println(itr.next());  
   }  
   al.remove(7);
   System.out.println("After removing 2nd element" +al);
   Iterator itr1=al.iterator();  
   while(itr1.hasNext()){  
   System.out.println(itr1.next());  
   } 
	}
	}