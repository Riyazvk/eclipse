import java.util.Scanner;

public class prog_2 {
	public static void main(String[] args) {
		final float pie=(float) 3.14;
		float r,area;
		System.out.println("enter the radius");
		Scanner a= new Scanner (System.in);
		r= a.nextInt();
		area= pie*r*r;
		System.out.println("\n Area of circle is "+area);
		
		
		
		
	}
}
