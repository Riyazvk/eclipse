
public class Stringblank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="calculate the number of words in the strings";
int count=0,i;
System.out.println(s.indexOf('a',0));
//System.out.println(s.replaceAll(" ","\n"));


for( i=0;i<s.length();i++)
{
	if(s.charAt(i)==' ')
	{

		count++;
	}
}
count++;
System.out.println("number of words="+count);
	}

}
