package strings;

import java.util.Scanner;

public class TotalNumOfAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		
//		char ch[]=s.toCharArray();
		int cnt1=0;
		int cnt2=0;
		int cnt3=0;
		for(int i=0; i<s.length(); i++)
		{
//			for(char j='a'; j<='z'; j++)
//			{
//				if(ch[i]==j)
//				{
//					cnt1++;
//				}
//			}
//			for(char k='0'; k<='9'; k++)
//			{
//				if(ch[i]==k)
//				{
//					cnt2++;
//				}
//			}
			char ch=s.charAt(i);
			if(ch>='a'&& ch<'z')
			{
				cnt1++;
			}
			else if(ch>='0'&& ch<='9')
			{
				cnt2++;
			}
			else
			{
				cnt3++;
			}
		}
		System.out.println("No of alphabet: "+cnt1);
		System.out.println("No of digit: "+cnt2);
		System.out.println("No of special char: "+cnt3);
	}

}
