package strings;

import java.util.Arrays;

public class RemoveAllOccurances {

	public static void main(String[] args) {
		String s="java is a java programming java language java";
		String str[]=s.split(" ");
		
		for(int i=0; i<str.length; i++)
		{
			if(str[i].equals("java"))
			{
				str[i]="";
			}
		}
        System.out.println(Arrays.toString(str));
	}

}
