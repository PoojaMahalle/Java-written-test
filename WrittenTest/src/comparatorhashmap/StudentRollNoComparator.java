package comparatorhashmap;

import java.util.Comparator;

public class StudentRollNoComparator implements Comparator<Student> {
	
	public int compare(Student s1,Student s2)
	{
		return s1.rollNo-s2.rollNo;
	}

}
