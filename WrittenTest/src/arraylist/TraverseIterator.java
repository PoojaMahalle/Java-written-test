package arraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TraverseIterator {

	public static void main(String[] args) {
		 LinkedList<Integer> l1 = new LinkedList<Integer>();
			
			l1.add(10);
			l1.add(20);
			l1.add(30);
			l1.add(40);
			l1.add(50);
			l1.add(60);
			l1.add(76);
			l1.add(80);
			l1.add(90);
			l1.add(100);
			System.out.println(l1);
			
			System.out.println("Reverse Direction: ");
			ListIterator<Integer> litr = l1.listIterator(l1.size());
			while(litr.hasPrevious())
			{
				System.out.print(litr.previous()+" ");
			}

	}

}
