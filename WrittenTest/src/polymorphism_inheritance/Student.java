package polymorphism_inheritance;

public class Student {

	int roll_no;
	String name;
	Department d;
	
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}


	public String toString()
	{
		return roll_no+" "+name+" "+d;
	}
}
