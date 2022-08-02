package strings;

import java.util.Arrays;

public class Decode {

	public static void main(String[] args) {
		String s="the sky is the limit";
		String str[]=s.split(" ");
		int ch[]=new int[str.length];
		
		for(int i=0; i<str.length; i++)
		{
			int sum=0;
			for(int j=0; j<str[i].length(); j++)
			{
				sum=sum+((str[i].charAt(j))-97);
			}
			ch[i]=sum;
			System.out.println(str[i]+" "+sum);
		}
		System.out.println();
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]>ch[j])
				{
				int temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				
				String t=str[i];
				str[i]=str[j];
				str[j]=t;
				}
			}
			System.out.println(ch[i]+" "+str[i]);
		}
		
       // System.out.println(Arrays.toString(ch));
	}

}
