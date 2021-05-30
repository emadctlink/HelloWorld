package javaDemo;

public class StringConcept {

	public static void main(String[] args) {
		
	/*In Java if two or more variable has same value that time Java does not 
		use different location to store the same value. So instead of two 
		location or space Java use one location and when any variable called value 
		java get from the same location where all value stored. */
		
	String abc = "Hello String";
	String abc1 = "Hello String";
	String abc2 = "  HELLO WORLD";
	
	System.out.println(System.identityHashCode(abc)); //stored location Id of abc value.
	System.out.println(System.identityHashCode(abc1));
	System.out.println(System.identityHashCode(abc2));
	
	//both string value are same or not true/false
	System.out.println(abc.equals(abc1));
	System.out.println(abc.equals(abc2));
	
	//memory location same or not true/false
	System.out.println(abc==abc1);
	System.out.println(abc1==abc2);
	
	//count/size the value
	System.out.println(abc.length());
	System.out.println(abc1.length());
	System.out.println(abc2.length());	
		
	//Concatenation- Join more than one String Value
	System.out.println(abc.concat(abc2));
	
	//Concat String/Integer and  int/int we use +
	String a ="10";
	int b = 20;
	int c = 30;
	
	System.out.println(a.concat(abc2)); //string/string
	System.out.println(b+c);			//int/int
	System.out.println(b+abc2);			//int/string
	
	//trim- remove the white space
	String abc3 = "  Learning Trim  ";
	System.out.println(abc3.length());
	System.out.println(abc3.trim());
	System.out.println(abc3.trim().length());
	
	
	//Lowercase to Uppercase vice versa 
	System.out.println(abc.toUpperCase());
	System.out.println(abc2.toLowerCase());
	
	//contains -given string is available or not true/false
	System.out.println(abc.contains("Hel"));
	System.out.println(abc2.contains("  "));
	System.out.println(abc3.contains("Bangla"));
	
	
	
	}

}
