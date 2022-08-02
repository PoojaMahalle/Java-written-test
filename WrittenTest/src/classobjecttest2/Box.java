package classobjecttest2;

import java.util.Scanner;

public class Box {
	double length,width,height,volume;
	
	void box(double l,double w,double h)
	{
		length = l;
		width = w;
		height = h;
	}
     void volume()
     {
    	 volume=(length*width*height);
     }
     public String toString()
     {
    	 return("Volume= "+(length*width*height));
     }
	public static void main(String[] args) {
		double length,width,height,volume=0;
		Scanner sc=new Scanner(System.in);
		
		Box b = new Box();
		System.out.println("Volume of box: ");
		length=sc.nextInt();
		width=sc.nextInt();
		height=sc.nextInt();
		b.box(length, width, height);
		System.out.println(b);

	}

}
