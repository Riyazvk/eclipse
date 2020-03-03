
public class SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {91,22,28,84,37,63,44,32};
int sum=0;
for(int i=0;i<=7;i++)
{
	if (i%2==0)
		if(a[i]%2==0)
		{
			sum=sum+a[i];
			System.out.println(a[i]);
		}
	
}
System.out.println(sum);
	}

}
