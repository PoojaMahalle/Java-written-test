package arraylist;

import java.util.ArrayList;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
     ArrayList<String> al = new ArrayList<String>();
		
     al.add("Sun");
     al.add("Mon");
     al.add("Sat");
     al.add("Sun");
     al.add("Mon");
     al.add("Sat");
     al.add("Sun");
     al.add("Sat");
     al.add("Sun");
     al.add("Mon");

		System.out.println(al);
		
		ArrayList<String> al1 = new ArrayList<>();
		
       for(String s:al)
       {
    	   if(!al1.contains(s))
    	   {
    		   al1.add(s);
    	   }
       }
       System.out.println(al1);
	}

}
