package classobjecttest2;

import java.util.Scanner;

public class MyDate {
	int date,month,year,d1,m1,y1,y2;
	
	void setData(int d,int m,int y)
	{
		date=d;
		month=m;
		year=y;
	}
	public String toString()
	{
		return date+""+month+""+year;
	}
	void print()
	{
		if(date>0 && date<=31 && month>0 && month<=12)
		{
		if(date<10 && month<10)
		{
			d1=0;
			m1=date;
			y1=0;
			y2=month;
		}
		else
		{
			d1=date/10;
			m1=date%10;
			y1=month/10;
			y2=month%10;
		}
		System.out.println(d1+""+m1+"/"+y1+""+y2+"/"+year);
		}
	}

	public static void main(String[] args) {
		int date,month,year;
		Scanner sc=new Scanner(System.in);
		
		
		MyDate md1 = new MyDate();
		System.out.println("Enter: date, month, year");
		date=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		md1.setData(date, month, year);
		//System.out.println(md1);
		md1.print();

	}

}
