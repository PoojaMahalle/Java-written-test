package constructortest3;

import java.util.Scanner;

public class Employee {

	int id,salary;
    String name;
    
    Employee(){}
    
    int getId()
    {
    	return id;
    }
    void setId(int id)
    {
    	this.id=id;
    }
    
    String getName()
    {
    	return name;
    }
    void setName(String name)
    {
    	this.name=name;
    }
    int getSalary()
    {
    	return salary;
    }
    void setSalary(int salary)
    {
    	this.salary=salary;
    }
    
    Employee(int id,String name,int salary)
    {
    	this.id=id;
    	this.name=name;
    	this.salary=salary;
    }
    void display()
    {
    	System.out.println(id+" "+name+" "+salary);
    }
	public static void main(String[] args) {
		int id,salary;
	    String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: id,name,salary");
		id=sc.nextInt();
		name=sc.next();
		salary=sc.nextInt();
		
		Employee e1 = new Employee();
		e1.setId(id);
		e1.setName(name);
		e1.setSalary(salary);
		e1.display();
		
		System.out.println("Enter: id,name,salary");
		id=sc.nextInt();
		name=sc.next();
		salary=sc.nextInt();
		
		Employee e2 = new Employee(id,name,salary);
		//e2.Employee(id,name,salary);
		e2.display();

	}

}
