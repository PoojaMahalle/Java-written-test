package comparatorhashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListContains {

	public static void main(String[] args) {
     ArrayList<String> al= new ArrayList<>();
		
		al.add("Pune");
		al.add("Mumbai");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Nashik");
		al.add("Pune");
		
		HashMap<String, Integer> hm= new HashMap<>();
		for(String s: al)
		{
			if(hm.containsKey(s))
			{
				hm.put(s, hm.get(s)+1);
			}
			else
			{
				hm.put(s, 1);
			}
			
		}
		System.out.println(hm);

	}

}
