package inheritance;

import java.util.Scanner;

public class AnimalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: name,sound,color,size,age");
		
		String name=sc.next();
		String sound=sc.next();
		String color=sc.next();
		String size=sc.next();
		int age=sc.nextInt();
		
		Mamal m1 = new Mamal();
		
		m1.setName(name);
		m1.setSound(sound);
		m1.setColor(color);
		m1.setSize(size);
		m1.setAge(age);
		
		System.out.println(m1);
		
		m1.walk();
		m1.eat();
		m1.numberOfLegs();
	}

}
