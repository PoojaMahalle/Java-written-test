package arraytest4;

import java.util.Scanner;

public class MatrixTranspose {
	
	void display(int arr1[][],int r,int c)
	{
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				//System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

	void trans(int arr1[][],int c,int r)
	{
		System.out.println("Transpose matrix is");
		int arr2[][]= new int[c][r];
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<r; j++)
			{
				arr2[i][j]=arr1[j][i];
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		int cnt=0;
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<r; j++)
			{
				if(arr2[i][j]==arr1[i][j])
				{
					cnt++;
				}
			}
				System.out.println();
			}
			if(cnt==(c*r))
			{
				System.out.println("Matrix is equal");
			}
			else
			{
				System.out.println("Matrix is not equal");
			}
		}
	
	public static void main(String[] args) {
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and col: ");
		r=sc.nextInt();
		c=sc.nextInt();
		
		int arr1[][]= new int[r][c];
		System.out.println("Enter "+(r*c)+" element: ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr1[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		MatrixTranspose mt = new MatrixTranspose();
		mt.display(arr1, r, c);
		mt.trans(arr1, c, r);
	}
}
