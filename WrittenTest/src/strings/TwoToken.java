package strings;

public class TwoToken {

	public static void main(String[] args) {
		String s="HELLO$WORLD";
		char ch[]=s.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='$')
			{
				ch[i]=' ';
			}
		}
		String s2=new String(ch);
		System.out.println(s2);
		
//		String str[]=s2.split(" ");
//		for(int i=0; i<str.length; i++)
//		{
//			System.out.println(str[i]);
//		}
	}

}
