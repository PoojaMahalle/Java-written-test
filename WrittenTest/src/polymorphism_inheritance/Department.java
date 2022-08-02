package polymorphism_inheritance;

public class Department {

	int id;
	String dname;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String toString()
	{
		return id+" "+dname;
	}
}
