package polymorphism_inheritance;

import java.util.Scanner;

public class FunctionSeries {

	double series(double a)
	{
		double sum=0;
		for(int i=0; i<=a; i++)
		{
			sum=sum+(1/i);
		}
		System.out.println("sum of series a and n: "+sum);
		return sum;
	}
	double series(double a,double n)
	{
		double sum=0,b=1,total=0;
		for(int i=1; i<=n; i++)
		{
				sum=1;
				for(int j=1; j<=b+1; j++)
				{
				sum=sum*a;
				}
				total=total+b/sum;
				b=b+3;
			}
			System.out.println("series of a and n = "+total);
			return total;
		}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FunctionSeries fs = new FunctionSeries();
		System.out.println("Sum of a series ");
		double a,n;
		n=sc.nextDouble();
		fs.series(n);
		
		System.out.println("Sum of a and n series");
		a=sc.nextDouble();
		n=sc.nextDouble();
		fs.series(a,n);		
		

	}

}
