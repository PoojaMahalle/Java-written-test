package exceptionhandling;

import java.util.Scanner;

public class MultipleException {
	static void div(int a,int b)
	{
		System.out.println("Division is: "+(a/b));
	}

	static void arrayElement(int arr[],int i)
	{
		System.out.println("element at the index is: "+arr[i]);
	}
    static void stringLength(String s)
    {
    	System.out.println("String length: "+s.length());
    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     int arr[]= {10,20,30,50,60,70};
	     System.out.println("Enter 2 number: ");
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     
	     try
	     {
	    	 try
	    	 {
	    		 try
	    		 {
	    			 arrayElement(arr,3);
	    		 }
	    		 catch(ArrayIndexOutOfBoundsException e)
	    	     {
	    	    	 System.out.println(e);
	    	     }
	    		 div(a,b);
	    	     }
	    	     catch(ArithmeticException e)
		         {
		    	// System.out.println(e);
		    	 e.printStackTrace();
		         }
	    	    stringLength(null);
	    	     }
	      catch(NullPointerException e)
	     {
	    	 e.printStackTrace();
	     }
	     
	     
	     System.out.println("Done with the operation");

	}

}
