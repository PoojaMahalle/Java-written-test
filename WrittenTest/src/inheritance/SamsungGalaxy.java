package inheritance;

public class SamsungGalaxy extends Mobile {

	String name,modelno;
	
	void battery()
	{
		System.out.println("6000mAh");
	}
	void ram()
	{
		System.out.println("6GB");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}
	
	public String toString()
	{
		return name+" "+modelno+" "+brand+" "+color+" "+price;
	}
}
