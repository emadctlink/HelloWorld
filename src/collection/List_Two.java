package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Two {

	public static void main(String[] args) {
		
		/* Collection is a resizeable array and don't need to declare the size () of array.
		 	you can add or remove item anytime.
		 -List is an interface of Super Interface collection
		 -List has two implementation classes
		 	Array List
		 	LinkedLIst
		 
		 -Allow Duplicate
		 -Maintain Inserting Order
		  
		 */
		
		List<Integer> id = new ArrayList<Integer>();
		id.add(101);
		id.add(102);
		id.add(103);
		id.add(104);
		id.add(105);
		id.add(106);
		
		System.out.println(id.size());
		System.out.println(id);
		
		id.add(107);
		id.add(109);
		id.add(107);
		System.out.println(id.add(108));
		
		System.out.println(id.size());
		System.out.println(id);
		System.out.println(id.contains(107));
		id.remove(8); //remove (107)
		System.out.println(id);
		
		System.out.println(id.isEmpty());
		
		System.out.println("----for each-----loop-----------");
		//for each loop
		for(Integer eachID:id) {
			System.out.println(eachID);
		}

		
		
		System.out.println("----------linked list----------------");
		
		List<String>name = new LinkedList<String>();
		name.add("Mamaun");
		name.add("Ashraf");
		name.add("Atia");
		name.add("Selina");
		name.add("Hasan");
		name.add("Sumayla");
		name.add("Najmul");
	
		System.out.println(name.size());
		System.out.println(name);
		name.add("Mahtab");
		System.out.println(name.size());
		System.out.println(name.contains("Ashraf"));
		System.out.println(name.contains("Eva"));
		System.out.println(name);
		
		System.out.println("---for each loop-----------");
		
		//for each loop
		for(String eachName:name) {
			System.out.println(eachName);   //for(String eachCollection:Collection)
		}
		
		System.out.println("-----while----loop-----------");	
		// while loop
		int i=0;
		while(i<name.size()){
			System.out.println(name.get(i));
			i++;
		}
		
	/*	System.out.println("------for---loop-----------");
	  
		//forloop											//?exception ?
		for (int i=0; i<=name.size(); i++) {
			System.out.println(name.get(i));
		}
	*/	
		
	
		
		
	/*	System.out.println("-------while--loop-----------");
		
			//while loop							//exception
			int i=0;
			while(i<=id.size()) {
			System.out.println(id.get(i));
			i++;
			}
		
		//for loop								//exception
		for (int i=0;i<=id.size(); i++) {
			System.out.println(id.get(i));
		}
		
			
		//do while loop							//exception
		int i=0;
		do {
			System.out.println(id.get(i));
			i++;
		}while (i<=id.size());
	*/
	}

}
