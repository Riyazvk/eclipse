package Collections;

import java.util.ArrayList;

public class Arraylist {

	ArrayList<Student> std=new ArrayList<Student>();
	public void create()
	{
		Student S1=new Student(15,"riyaz",85,88);
		Student S2=new Student(16,"nase",86,90);
		Student S3=new Student(15,"riyazvk",80,98);
		S1.average();
		S2.average();
		S3.average();
	std.add(S1);
	std.add(S2);
	std.add(S3);
	}
	public void Display()
	{
		for(Student s: std)
		{
			System.out.println("Regno:"+s.regno+"\n Name:"+s.name+"\n java mark:"+s.java+ "\n selenium mark:"+s.selenium+"\n average:"+s.avg );
			
		}
	}
	
	
	public static void main(String arg[])
	{
	 Arraylist al=new Arraylist();
	 al.create();
	 System.out.println("Array list is created");
	 al.Display();
	 System.out.println("Displayed");
	 
	}
}
