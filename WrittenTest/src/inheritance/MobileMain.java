package inheritance;

import java.util.Scanner;

public class MobileMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: name,modelno,brand,color,price");
		
		String name=sc.next();
		String modelno=sc.next();
		String brand=sc.next();
		String color=sc.next();
		int price=sc.nextInt();
		
		SamsungGalaxy sg = new SamsungGalaxy();
		
		sg.setName(name);
		sg.setModelno(modelno);
		sg.setBrand(brand);
		sg.setColor(color);
		sg.setPrice(price);
		System.out.println(sg);
		
		sg.switchOn();
		sg.switchOff();
		sg.screenType();
		sg.battery();
		sg.ram();

	}

}
