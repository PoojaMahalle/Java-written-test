package sets_map;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemsMap {

	public static void main(String[] args) {
        ArrayList<Items> al= new ArrayList<>();
		
        al.add(new Items(106,"Cadburry",10,30));
		al.add(new Items(101,"Nestle",5,50));
		al.add(new Items(102,"ParleG",20,10));
		al.add(new Items(103,"Sunfeast",5,60));
		al.add(new Items(104,"Britannia",20,10));
		al.add(new Items(106,"Cadburry",5,30));
		al.add(new Items(107,"Patanjali",15,20));
		al.add(new Items(130,"ParleG",15,50));
		al.add(new Items(110,"Nestle",10,50));
		al.add(new Items(181,"Cadburry",25,50));
		
		HashMap<String, Integer> hm= new HashMap<>();
		for(Items i: al)
		{
					if(hm.containsKey(i.name))
					{
				      hm.put(i.name, hm.get(i.name)+i.qty);
				    }
					else
					{
						hm.put(i.name, i.qty);
					}
			
		}
		System.out.println(hm);
		

	}

}
