package comparatorhashmap;

public class Employee implements Comparable<Employee> {

	int id,salary;
	String name,dept;
	Profile pro;
	
	Employee(int id,String name,String dept,int salary,Profile pro)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.pro=pro;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary+" "+pro;
	}
	
	public int compareTo(Employee e)
	{
		if(this.pro.country.equals(e.pro.country))
		
		 return this.pro.state.compareTo(e.pro.state);
		 else
			 return this.pro.country.compareTo(e.pro.country);
		
		
}
}