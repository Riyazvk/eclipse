 import java.util.Map;
import java.util.TreeMap;
public class Treemap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeMap<Integer,String>al=new TreeMap<Integer,String>();
	
	al.put(19,"Riyaz");
	al.put(17,"nas");
	al.put(16,"Aru");
	al.put(20,"vicky");
	al.put(15,"vinoth");
	al.put(16,"sanju");
//	al.put(null,null);
	//al.put(null,null);
	
	
	System.out.println(al);
	
	al.remove(19);
	System.out.println(al);
	
	for(Map.Entry<Integer,String>Mentry:al.entrySet())
	 System.out.println("key:"+Mentry.getKey() + "\t value:"+Mentry.getValue());
	}
}
