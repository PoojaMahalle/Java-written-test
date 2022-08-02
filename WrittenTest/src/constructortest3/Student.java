package constructortest3;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	
//	Student(Student s1)
//	{
//		id=s1.id;
//		name=s1.name;
//	}
//	
//	Student(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	public String toString()
	{
		return id+" "+name;
	}
	
   void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		int id;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: id,name");
		id=sc.nextInt();
		name=sc.next();
		
//		Student s1 = new Student(id,name);
//		
////		s1.setId(id);
////		s1.setName(name);
////		
//		Student s2 = new Student(s1);
//		s1.display();
//		s2.display();
		
		Student s1 = new Student();
		s1.setId(id);
		s1.setName(name);
		Student s2 = new Student();
		s2.setId(s1.getId());
		s2.setName(s1.getName());
		s1.display();
		s2.display();
		

	}

}
