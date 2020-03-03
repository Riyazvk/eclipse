
public class while1 {

	public static void main(String[] args) {
 
		// TODO Auto-generated method stub
	int p1=0,p2=0;
	String s="got job in cts";
	while(p2!=-1)
	{	p2=s.indexOf(' ',p1);
	
		if(p2==-1)
		{
			p2=s.length();
			System.out.println(s.substring(p1,p2));
			break;
		}
		else
		{
			System.out.println(s.substring(p1,p2));
			p1=p2+1;
		}
	}
	}
	
}
		

