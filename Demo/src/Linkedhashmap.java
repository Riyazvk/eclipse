
import java.util.LinkedHashMap;
import java.util.Map;
public class Linkedhashmap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedHashMap<Integer,String>al=new LinkedHashMap<Integer,String>();
	
	al.put(19,"Riyaz");
	al.put(17,"nas");
	al.put(16,"Aru");
	al.put(null,"vicky");
	al.put(15,null);
	al.put(18,"sanju");
	al.put(null,null);
	//al.put(null,null);
	
	
	System.out.println(al);
	
	al.remove(19);
	System.out.println(al);
	
	for(Map.Entry<Integer,String>Mentry:al.entrySet())
	 System.out.println("key:"+Mentry.getKey() + "\t value:"+Mentry.getValue());
	}
}
