package polymorphism_inheritance;

import java.util.Scanner;

public class PerAddMain {

	public static void main(String[] args) {
		int age;
		String name,gender;
		String city, state, country;
		Address a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: name,age,gender,city,state,country");
		
		name=sc.next();
		age=sc.nextInt();
		gender=sc.next();
		city=sc.next();
		state=sc.next();
		country=sc.next();
		
		Address a1 = new Address();
		a1.setCity(city);
		a1.setState(state);
		a1.setCountry(country);
		
		Person p1 = new Person();
		p1.setName(name);
		p1.setAge(age);
		p1.setGender(gender);
		p1.setA(a1);
		
		System.out.println(p1);

	}

}
