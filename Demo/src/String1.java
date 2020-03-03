
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s= "i love cricket";
 String S1;
 String S2="Riyaz",S3="Riyaz ",S4="riyaz";
 s=s.substring(0,6);
 int l=s.length();
 System.out.println(l);
 System.out.println(s);
 System.out.println(S2.compareToIgnoreCase(S4));
 System.out.println(S2.compareTo(S4));
 System.out.println(S2.equals(S3));
 if (S2.equals(S3))
 {
	 System.out.println("both r same");
 }
	}
	

}
