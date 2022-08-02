package comparatorhashmap;

import java.util.HashMap;
import java.util.LinkedList;

public class MapLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(1);
		l1.add(4);
		l1.add(2);
		l1.add(1);
		l1.add(3);
		l1.add(1);
		l1.add(4);
		LinkedList<String> l2=new LinkedList<>();
		for(int i=0;i<l1.size();i++)
		{
		if(l1.get(i)==1)
		{
			l2.add("One");
		}
		else if(l1.get(i)==2)
		{
			l2.add("Two");
		}
		else if(l1.get(i)==3)
		{
			l2.add("Three");
		}
		else if(l1.get(i)==4)
		{
			l2.add("Four");
		}
		else if(l1.get(i)==5)
		{
			l2.add("Five");
		}
		}
		HashMap<String, Integer> hm=new HashMap<>();
		for(String s:l2)
		{
			if(hm.containsKey(s))
			{
//				int v=hm.get(s)+1;
//				hm.put(s, v);
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

