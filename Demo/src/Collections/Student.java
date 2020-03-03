package Collections;


public class Student {
	int regno;
	String name;
	int java;
	int selenium;
	float avg;
 public void average()
{
	avg=(java+selenium)/2f;
	
}
 public Student(int Regno,String Name,int Java,int Ds)
 {
	 this.regno=Regno;
	 this.name=Name;
	 this.java=Java;
	 this.selenium=Ds;
	 
 }
}
