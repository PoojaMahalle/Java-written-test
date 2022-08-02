package arraylist;

import java.util.ArrayList;

public class FailFast {

	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<Integer>();
			
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(10);
			al.add(50);
			al.add(60);
			al.add(70);
			al.add(10);
			al.add(80);
			//System.out.println(al);
			
			for(Integer i:al)
			{
				if(i==20)
					al.add(200);
			}

	}

}
