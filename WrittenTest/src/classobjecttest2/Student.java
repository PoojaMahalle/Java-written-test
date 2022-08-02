package classobjecttest2;

import java.util.Scanner;

public class Student {
	int id,m1,m2,m3,percentage,marks;
	String name,dept;
	
	void setData(int i,String n,int a,int b,int c,String d)
	{
		id=i;
		name=n;
		m1=a;
		m2=b;
		m3=c;
		dept=d;
		
	}
	
	public String toString()
	{
		return id+""+name+""+dept+""+m1+""+m2+""+m3;
	}
	
	void marks()
	{
		marks = m1 + m2 + m3;
		System.out.println("Total marks= "+marks);
	}
	void percentage()
	{
		percentage=(marks*100)/300;
		System.out.println("Percentage= "+percentage+"%");
	}
	
	void result()
	{
		if(percentage>=75)
		{
			System.out.println("You got distinction");
		}
		else if(percentage>=60)
		{
			System.out.println("You got first class");
		}
		else if(percentage>=50)
		{
			System.out.println("You got second class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	
	public static void main(String[] args) {
		int id,m1,m2,m3;
		String name,dept;
		Scanner sc=new Scanner(System.in);
		
		Student s1 = new Student();
		System.out.println("Enter: id, name, m1, m2, m3, dept");
		id=sc.nextInt();
		name=sc.next();
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		dept=sc.next();
		s1.setData(id, name, m1, m2, m3, dept);
		System.out.println(s1);
		s1.marks();
		s1.percentage();
		s1.result();
		
		
		Student s2 = new Student();
		System.out.println("Enter: id, name, m1, m2, m3, dept");
		id=sc.nextInt();
		name=sc.next();
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		dept=sc.next();
		s2.setData(id, name, m1, m2, m3, dept);
		System.out.println(s2);
		s2.marks();
		s2.percentage();
		s2.result();
		
		Student s3 = new Student();
		System.out.println("Enter: id, name, m1, m2, m3, dept");
		id=sc.nextInt();
		name=sc.next();
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		dept=sc.next();
		s3.setData(id, name, m1, m2, m3, dept);
		System.out.println(s3);
		s3.marks();
		s3.percentage();
		s3.result();
		
		

	}

}
