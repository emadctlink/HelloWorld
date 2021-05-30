package javaDemo;

import java.util.ArrayList;
import java.util.List;

public class Loops_Iterator {

	public static void main(String[] args) {
	
	/*	-loops - for loop, while loop, do while loop, for each loop.
		-When you know exactly how many times you want to loop through a block of code, 
		 use the for loop instead of a while loop:
		-for loop- start with for  
		 */ 
	/*	
		for (int i=1; i<=10; i=i+1) {
			System.out.println(i);
		}
	
		 // interesting in looping
		 //without any assigning any number how can we print 100.
		  
		  String str ="abcdefghij";
		  System.out.println(str.length());
		  
		  int zero = str.length()-str.length();
		  int hundred = str.length()*str.length();
		  
		  
		  for(int i=zero; i<=hundred; i++) {
			  System.out.println(i);
		  }
	 */
		 
		 
		//while loop- start with initialization> while condition > increment in inside the body after syso.
		// loops through a block of code as long as a specified condition is true:
		 
		int i = 1;
		while (i<=10){
			System.out.println(i +" while loop");
			i= i+1;
		}
	
		/*
		
		//do while loop-initialization > inside the body increment > while condition after body
		//The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true,
		// then it will repeat the loop as long as the condition is true
		 
		int i = 1;
		do {
			System.out.println(i +" do while loop");
			i=i+2;
		}while (i<=20);
		
		*/
		// for each loop
		List<Integer> id = new ArrayList<Integer>();	//ArrayList
		id.add(101);
		id.add(102);
		id.add(103);
		id.add(104);
		id.add(105);
		
		for(Integer eachID:id) {
			System.out.println(eachID);
		}
		
	}

}
