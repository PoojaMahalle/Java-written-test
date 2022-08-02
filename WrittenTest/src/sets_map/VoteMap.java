package sets_map;

import java.util.HashMap;
import java.util.Map;

public class VoteMap {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("6595623235664", "Congress");
		hm.put("8956232356645", "BJP");
		hm.put("7895623235664", "ShivSena");
		hm.put("3556232356645", "NCP");
		hm.put("9566232356645", "Congress");
		hm.put("6595623235678", "Congress");
		hm.put("3456232356645", "NCP");
		hm.put("8762323566458", "Congress");
		hm.put("9879623235664", "BJP");
		hm.put("7962323566456", "ShivSena");
		hm.put("3156232356645", "NCP");
		hm.put("2195623235664", "ShivSena");
		hm.put("4595623235664", "BJP");
		
		HashMap<String, Integer> hm1 = new HashMap<>();
		
		for(Map.Entry<String, String> ent:hm.entrySet())
		{
			String s=ent.getValue();
			if(hm1.containsKey(s))
			{
				//int v=hm1.get(s)+1;
				hm1.put(s, hm1.get(s)+1);
			}
			else
			{
				hm1.put(s, 1);
			}
		}
		System.out.println(hm1);
		

	}

}
