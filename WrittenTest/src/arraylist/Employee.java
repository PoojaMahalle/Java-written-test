package arraylist;

import java.util.ArrayList;

public class Employee {

	int id;
	String name,dept;
	
	Employee(int id,String name,String d)
	{
		this.id=id;
		this.name=name;
		this.dept=d;
		
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept;
	}
	

//	class Dept{
//		int eNo;
//		
//		Dept(int eNo)
//		{
//			this.eNo=eNo;
//		}
//		
//		public String toString()
//		{
//			return eNo+" ";
//		}

		
	}


