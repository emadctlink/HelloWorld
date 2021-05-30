package collection;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_Three {

	public static void main(String[] args) {
	
		/* Interface Map has 3 Implementation classes
			-HashMap (Random Order)
			-Linked HashMap(Ascending Order)
			-Tree Map(maintain Inserting/Put order)
			
		- Map is 2 Dimension(here Name= Key ---- ---- ID = Value)
		- Key and Value pair is called Entry(1 pair)
		- Set/Collection  of Entry is called EnetrySet
		- Key does not allow Duplicate
		- Value allows duplicate
		Syntex
		Map<Key, Value> variable = new Map<Key, Value>();
		Map<String, Integer> map = new Map<String, Integer>();
		*/
		
		Map<String, Integer> map1	= new HashMap<String, Integer>();
		Map<String, String> map2 = new LinkedHashMap<String, String>();
		Map<Integer, String> map3 = new TreeMap<Integer, String>();
		
		map1.put("Zimam", 101);		// does not allow duplicate so Zimam will be 105
		map1.put("Zainab", 102);	//Name is Key ----and ---- number is Value
		map1.put("Arshan", 103);
		map1.put("Arash", 104);
		map1.put("Zimam", 105);	
		map1.put("Anabia", 106);
		
		//---------------------------
		
		map2.put("Mamun", "Barishal");
		map2.put("Eva", "Sylhet");
		map2.put("Ashraf", "Comilla");
		map2.put("Sumayla", "Canada");
		map2.put("Najmul", "Michigan");
		map2.put("Eva", "Jamaica");				// Eva from Jamaica not Sylhet
		
		//-----------------
		map3.put(1001, "Texas");
		map3.put(1005, "New York");
		map3.put(1002, "Michigan");
		map3.put(1007, "Alberta");
		map3.put(1006, "Dhaka");
		map3.put(1003, "New York");
		
		//-------------------------
		
		//check size of collection
		System.out.println(map1.size());
		System.out.println(map2.size());
		System.out.println(map3.size());
		
		System.out.println("----------map1-----------------");
		//HashMap print entrySet
		for (Entry<String, Integer> eachMap1 : map1.entrySet()) {
			System.out.println(eachMap1.getKey()+"    "+ eachMap1.getValue());
		}
		System.out.println("-------map2--------------------");
		// Linked HashMap print all entry
		for (Entry<String,String> eachMap2 : map2.entrySet()) {
			System.out.println(eachMap2.getKey()+"     "+eachMap2.getValue());
		}
		System.out.println("-----------map3----------------");
		for(Entry<Integer, String> eachMap3 : map3.entrySet()) {
			System.out.println(eachMap3.getKey()+"      "+ eachMap3.getValue());
		}
		
		System.out.println("---------------------------");
		// Add new entry for all
		System.out.println(map1.put("Khan", 110));
		System.out.println(map2.put("Hasan", "Dhaka"));
		System.out.println(map3.put(1010, "New Jersy"));
		
		System.out.println("---------------------------");
		
		
		System.out.println("---------------------------");
		//check the key or value is available or not
		System.out.println(map1.containsKey("Zimam"));
		System.out.println(map2.containsValue("comilla"));
		System.out.println(map3.containsKey(1015));
		
		System.out.println("---------------------------");
		//get value of key
		System.out.println(map1.get("Zimam"));
		System.out.println(map3.get(1003));
		
		System.out.println("---------------------------");
		
		// clear all data
			map1.clear();
			map2.clear();
			map3.clear();
			
		//check size of collection after clear
			System.out.println(map1.size());
			System.out.println(map2.size());
			System.out.println(map3.size());	
		System.out.println("---------------------------");
		//check is empty
		System.out.println(map1.isEmpty());
		System.out.println(map2.isEmpty());
		System.out.println(map3.isEmpty());
	}

}
