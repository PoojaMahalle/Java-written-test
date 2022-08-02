import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int r = sc.nextInt();
		
		for(int i=r; i>=1; i--)
		{
			for(int k=1; k<=r-i; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			for(int a=i-1; a>=1; a--)
			{
				System.out.print(a);
			}
			
			System.out.println();
		}
	}

}
