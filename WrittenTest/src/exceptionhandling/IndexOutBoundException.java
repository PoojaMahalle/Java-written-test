package exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class IndexOutBoundException {
	static void arrayElement(int arr[],int i)
	{
		System.out.println("element at the index is: "+arr[i]);
	}
	static void stringElement(String s,int i)
	{
		System.out.println("element at the index is: "+s.charAt(i));
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter array length: ");
		 int size=sc.nextInt();
		 int arr[]= {10,20,30,40,50};
		 
		 String s="language";
		 int a=0;
		 int b=0;
		
		 
		 try
		 {
			 a=sc.nextInt();
			 b=sc.nextInt();
			 arrayElement(arr,size);
			 stringElement(s, size);
		 }
		
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			//System.out.println(a);
			 e.printStackTrace();
			 
		 }
		 catch(StringIndexOutOfBoundsException e)
		 {
			//System.out.println(a);
			e.printStackTrace();
			 
		 }

	}

}
