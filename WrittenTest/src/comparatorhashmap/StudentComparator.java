package comparatorhashmap;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparator {

	public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
		
		al.add(new Student(1,"Raj",25));
		al.add(new Student(2,"Ram",35));
		al.add(new Student(3,"Riya",20));
		al.add(new Student(4,"Rahul",25));
		al.add(new Student(5,"Pooja",25));
		al.add(new Student(6,"Lina",25));
		al.add(new Student(7,"Tina",25));
		al.add(new Student(8,"Mina",25));
		al.add(new Student(9,"Bharti",25));
		
		Collections.sort(al, new StudentNameComparator());
		System.out.println(al);
		Collections.sort(al, new StudentRollNoComparator());
		System.out.println(al);
		Collections.sort(al, new StudentAgeComparator());
		System.out.println(al);

	}

}
