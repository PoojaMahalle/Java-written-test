package inheritance;

public class TwoBhkHouse extends House {
    
	String h_name,color;

	public String getH_name() {
		return h_name;
	}

	public void setH_name(String h_name) {
		this.h_name = h_name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString()
	{
		return h_name+" "+color+" "+rooms+" "+doors+" "+windows;
	}
}
