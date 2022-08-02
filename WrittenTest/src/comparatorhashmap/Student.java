package comparatorhashmap;

public class Student {

	int rollNo,age;
	String name;
	
	Student(int rollNo,String name,int age)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}
	
	public String toString()
	{
		return rollNo+" "+name+" "+age;
	}
}
