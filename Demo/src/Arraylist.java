import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<String> al = new  ArrayList<String>();
   al.add("Riyazvk");
   al.add("nas");
   al.add("Aru");
   al.add("Riyazvk");
   
   System.out.println(al);
   Iterator itr=al.iterator();  
   while(itr.hasNext()){  
   System.out.println(itr.next());  
   }  
   al.remove(2);
   System.out.println("After removing 2nd element" +al);
   Iterator itr1=al.iterator();  
   while(itr1.hasNext()){  
   System.out.println(itr1.next());  
   }  
   
	}

}
