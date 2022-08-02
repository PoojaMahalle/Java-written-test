package arraytest4;

import java.util.Arrays;
import java.util.Scanner;

public class MinChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" element");
		char arr[]=new char[size];
		
		for(char i=0; i<size; i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		for(char i=0; i<size; i++)
		{
			for(char j=0; j<size-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
				char temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Minimum char: "+ arr[0]);

	}
	

}

