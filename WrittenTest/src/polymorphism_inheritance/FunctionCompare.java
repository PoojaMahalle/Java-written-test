package polymorphism_inheritance;

import java.util.Scanner;

public class FunctionCompare {

	void compare(int num1,int num2)
	{
		if(num1 > num2)
		{
			System.out.println("int Num1 is greater");
		}
		else 
		{
			System.out.println("int num2 is greater");
		}
	}
	
	void compare(char a, char b)
	{
		if(a > b)
		{
			System.out.println("Char a is higher numeric value");
		}
		else
		{
			System.out.println("Char b is higher numeric value");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FunctionCompare fc = new FunctionCompare();
		System.out.println("Enter int num1 num2 number");
		int num1, num2;
		num1=sc.nextInt();
		num2=sc.nextInt();
		fc.compare(num1, num2);
		
		System.out.println("Enter char a b number");
		char a, b;
		a=sc.next().charAt(0);
		b=sc.next().charAt(0);
		fc.compare(a, b);
				

	}

}
