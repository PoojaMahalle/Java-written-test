package arraytest4;

import java.util.Scanner;

public class SumOfLowerTriangle {

	public static void main(String[] args) {
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and col: ");
		r=sc.nextInt();
		c=sc.nextInt();
		
		int arr[][]= new int[r][c];
		System.out.println("Enter "+(r*c)+" element: ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				if(i<j)
				sum=sum+arr[i][j];
			}
			
		}
		System.out.println("Sum of lower triangle is = "+sum);

	}

}
