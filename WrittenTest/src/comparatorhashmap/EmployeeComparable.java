package comparatorhashmap;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparable {

	public static void main(String[] args) {
        ArrayList<Employee> al=new ArrayList<>();
		
		al.add(new Employee(1,"Raj","HR",65000,new Profile("Maharashtra","India")));
		al.add(new Employee(12,"Barlin","Development",80000,new Profile("Fukui","Japan")));
		al.add(new Employee(3,"Lea","HR",70000,new Profile("California","USA")));
		al.add(new Employee(10,"Shyam","Sales",90000,new Profile("Karnataka","India")));

		Collections.sort(al);
		System.out.println("Sorting: "+al);
	}

}
