
public class prnitnext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="i got job in cts";
int p1=0,p2=0;
for(int i=0;i<s.length();i++)
{
	p2=s.indexOf(' ',p1);
	
	if(p2==-1)
	{
		p2=s.length();
	}
	System.out.println(s.substring(p1,p2));
	p1=p2+1;		
}

	}

}
