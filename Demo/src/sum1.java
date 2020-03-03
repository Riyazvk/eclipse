
public class sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {21,14,7,15,-2,18,22,9,6};
 int i,j,sum=0;
 for(i=0;i<=8;i++)
	 for(j=i+1;j<=8;j++)
		 if(a[i]+a[j]==36)
		 {
			 sum=a[i]+a[j];
			 System.out.println(a[i]+ "+" +a[j]+"="+sum) ;
		 }
	}

} 
