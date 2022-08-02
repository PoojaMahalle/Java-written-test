package polymorphism_inheritance;

import java.util.Scanner;

public class MainDeptStud {

	public static void main(String[] args) {
		int id;
		String name;
		int roll_no;
		String dname;
		Department d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: id, name, dname, roll_no");
		id=sc.nextInt();
		name=sc.next();
		dname=sc.next();
		roll_no=sc.nextInt();
		
		Department d1 = new Department();
		d1.setId(id);
		d1.setDname(dname);
		
		Student s1 = new Student();
        s1.setRoll_no(roll_no);
        s1.setName(name);
        s1.setD(d1);
        
        System.out.println(s1);
	}

}
