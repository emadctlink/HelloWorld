package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Three {

	public static void main(String[] args) {
		
		/* Set is an interface and it's has 3 implementation classes
		-HashSet(Random order and ascending order)
		-linked HashSet (Inserting order)
		-TreeSet (Ascending Order)
		
		-Not allow duplicate
		- Single dimension
		-allow one null value
		-get(item) method-it's not use in Set
		 */
		
		
		Set<Integer> obj = new HashSet<Integer>();
		Set<Integer> obj1 = new LinkedHashSet<Integer>();
		Set <String> obj2 = new TreeSet<String>();
		
		obj.add(103);
		obj.add(101);
		obj.add(102);
		obj.add(104);
		obj.add(105);
		obj.add(000);
		
		
		obj1.add(205);
		obj1.add(208);
		obj1.add(207);
		obj1.add(201);
		obj1.add(202);
		obj1.add(207);
		obj1.add(209);
		
		obj2.add("Salam");
		obj2.add("Jahan");
		obj2.add("Zimam");
		obj2.add("Zainab");
		obj2.add("Israt");
		obj2.add("Emad");
		
		
		// Display by for each loop
		for (String eachObj2: obj2) {
			System.out.println(eachObj2);
		}
		System.out.println("---------------------");
		
		for (Integer eachObj1 : obj1) {
			System.out.println(eachObj1);
		}
		System.out.println("---------------------");
		
		for (Integer eachObj : obj) {
			System.out.println(eachObj);
		}
		
		System.out.println("---------------------");
		
		//check size of collection/array
		System.out.println(obj.size());
		System.out.println(obj1.size());
		System.out.println(obj2.size());
		
		System.out.println("---------------------");
		
		//check the value is available or not. result- true/false
		System.out.println(obj.contains(000));
		System.out.println(obj1.contains(110));
		System.out.println(obj2.contains("Eva"));
		
		System.out.println("---------------------");
		
		//Remove/Delete any particular item
		obj.remove(000);
		obj1.remove(207);
		obj2.remove("Emad");
		
		System.out.println("---------------------");
		
		// again check size of collection/array
		System.out.println(obj.size());
		System.out.println(obj1.size());
		System.out.println(obj2.size());
		
		System.out.println("---------------------");
		
		//print/display all items in the Set 
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println("---------------");
		
		//Clear all item
		obj.clear();
		obj1.clear();
		obj2.clear();
		
		//check is it clear or not Result true/false
		System.out.println(obj.isEmpty());
		System.out.println(obj1.isEmpty());
		System.out.println(obj2.isEmpty());
		
		
	}

}
