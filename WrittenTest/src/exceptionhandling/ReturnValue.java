package exceptionhandling;

import java.util.Scanner;

public class ReturnValue {
	
	static void div(int a,int b)
	{
		System.out.println("Division is: "+(a/b));
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter 2 number: ");
	     int a=0;
	     int b=0;
	     
	     try
	     {
	    	  a=sc.nextInt();
	          b=sc.nextInt();
	    	  div(a,b);
	    	  System.out.println("Try block ");
	    	 // return a;
	    	
	     }
	     catch(ArithmeticException e)
	     {
	    	// System.out.println(e);
	    	 e.printStackTrace();
	     }
	     finally
	     {
	    	 System.out.println("Finally block always executed");
	    	// return a;
	    	 sc.close();
	     }
	     
	     System.out.println("Done with the operation");

}
}
