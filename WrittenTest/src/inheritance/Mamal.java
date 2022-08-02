package inheritance;

public class Mamal extends Animal {

	int age;
	String name,size;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return name+" "+sound+" "+color+" "+size+" "+age;
	}
}
