package arraytest4;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeValueReplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" element");
		int arr[]=new int [size];
		
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<size; i++)
		{
			if(arr[i]<0)
			{
				arr[i]=arr[i-1]*arr[i-1]; 
			}
			//System.out.print(arr[i]+" ");
		}
		System.out.println(Arrays.toString(arr));

	}

}
