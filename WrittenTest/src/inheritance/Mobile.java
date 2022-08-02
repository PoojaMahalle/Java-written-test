package inheritance;

public class Mobile {
     int price;
     String color,brand;
     
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
     
     void switchOn()
     {
    	 System.out.println("Your mobile is now switch on");
     }
     
     void switchOff()
     {
    	 System.out.println("Your mobile is now switch off");
     }
     
     void screenType()
     {
    	 System.out.println("Your mobile has touch screen");
     }
}
