package inheritance;

public class Animal {
    String sound,color;
    
    void walk()
    {
    	System.out.println("Animal is walking");
    }
    void eat()
    {
    	System.out.println("Animal is eating");
    }
    void numberOfLegs()
    {
    	System.out.println("Animal has 4 legs");
    }
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
    
    
}
