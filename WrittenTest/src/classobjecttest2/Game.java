package classobjecttest2;

import java.util.Scanner;

public class Game {
	String country;
	
	void setData(String cn)
	{
		country=cn;
	}
	
	public String toString()
	{
		return country;
	}
	
	void game()
	{
		switch(country)
		{
		case "India":
			System.out.println("National game is Hockey");
			break;
		case "China":
			System.out.println("National game is Table Tennis");
			break;
		case "Bangladesh":
			System.out.println("National game is Kabaddi");
			break;
		case "Italy":
			System.out.println("National game is Footable");
			break;
		case "US":
			System.out.println("National game is Baseball");
			break;
		default:
			System.out.println("Invalid country");
			
		}
	}

	public static void main(String[] args) {
		String country;
		Scanner sc =new Scanner(System.in);
		
		
		Game g1=new Game();
		System.out.println("Enter country name");
		country = sc.next();
		g1.setData(country);
		g1.game();
		
		/*
		 * Game g2=new Game(); System.out.println("Enter country name"); country=
		 * sc.next(); g2.setData(country); g2.game();
		 * 
		 * Game g3=new Game(); System.out.println("Enter country name"); country =
		 * sc.next(); g3.setData(country); g3.game();
		 * 
		 * Game g4=new Game(); System.out.println("Enter country name"); country =
		 * sc.next(); g4.setData(country); g4.game();
		 * 
		 * Game g5=new Game(); System.out.println("Enter country name"); country =
		 * sc.next(); g5.setData(country); g5.game();
		 */

	}

}
