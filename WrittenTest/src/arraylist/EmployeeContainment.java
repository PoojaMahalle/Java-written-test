package arraylist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class EmployeeContainment {

	public static void main(String[] args) {
		LinkedList<Employee> li=new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: id name dept");
		for(int i=0; i<5; i++)
		{
			//System.out.println("Enter: id,name,dept");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			li.add(new Employee(id,name,dept));
		}
		System.out.println(li);
		String dept="";
		for(Employee e:li)
		{
			if(e.id==10)
				dept=e.dept;
		}
//			for(int j=0; j<li.size(); j++)
//			{
//				if(li.get(j).id==10)
//				{
//					dept=li.get(j).dept;
//			}
//			
//		}

      ListIterator<Employee> e=li.listIterator();
      while(e.hasNext())
      {
    	  Employee m=e.next();
    	  if(m.dept.equals(dept))
    	  {
    		  e.remove();
    	  }
      }
      System.out.println(li);

	}

}
