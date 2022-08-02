package inheritance;

import java.util.Scanner;

public class HouseMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: Hname,color,rooms,doors,windows");
		
		String h_name=sc.next();
		String color=sc.next();
		int rooms=sc.nextInt();
		int doors=sc.nextInt();
		int windows=sc.nextInt();
		
		TwoBhkHouse t1 = new TwoBhkHouse();
		t1.setH_name(h_name);
		t1.setColor(color);
		t1.setRooms(rooms);
		t1.setDoors(doors);
		t1.setWindows(windows);
		System.out.println(t1);
		
		t1.society();
	}

}
