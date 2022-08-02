package sets_map;

import java.util.Iterator;
import java.util.LinkedList;

public class CombineLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(4);
		System.out.println("First list: "+list1);
		
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);
		System.out.println("Second list"+list2);
		
		LinkedList<Integer> list3 = new LinkedList<>();
		for(int i=0; i<list1.size(); i++)
		{
			list3.add(list1.get(i));
			if(i<list2.size())
			{
				list3.add(list2.get(i));
			}
		}
        System.out.println(list3);
	}

}
