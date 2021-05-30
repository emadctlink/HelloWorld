package javaDemo;

public class Arrays_loops {

	public static void main(String[] args) {

		//We can store any value in Arrays in two ways.
		//Way 1......
		//dataType[]arrays={value(s)};
	/*	
		String[] names = {"Abul", "Bashar", "Chowdury" };
		int [] num = {10,20,30,40,50};
		char [] letter = {'a','b','c','d'};
		
		System.out.println(names.length);
		System.out.println(names[1]);
		System.out.println(num[4]);
		System.out.println(letter.length);
		System.out.println(letter[2]);		
		                          
	/*	for(char i=0;i<=letter.length; i++) {
			System.out.println(letter[i]);		
		}
		
		for (int i =0; i<=names.length; i++) {
		System.out.println(names[i]);				//? why it's int
		}
		
		for (int i =0; i<=num.length; i++) {
			System.out.println(num[i]);
		}
		
		int i=0;
		while (i<=num.length){
			System.out.println(num[i]);
			i++;
		}	
		
		char i=0;
		do {
			System.out.println(letter[i]);
			i++;
		}while (i<=letter.length);
	*/	
	/*	for each loop
		for(dataType eachCollections : collections){
		System.out.println(eachCollections);
		}
	
		for(int eachNum :num) {
			System.out.println(eachNum);
		}
	
	*/	
		System.out.println("------------------------");
		
		//Way 2....
		//ClassName[]obj = new ClassName[];
		String[]obj = new String[4];
		obj[0]="Arshan";
		obj[1]="Wadud";
		obj[2]="Khan";
		obj[3]="Zimam";
			
		System.out.println(obj.length);
		System.out.println(obj[3]);
		System.out.println(obj[0]);
		
		System.out.println("--------------------------");
	
		//Arrays and loop
	/*	for(int i=0; i<=obj.length;i++) {
			System.out.println(obj[i]);			//Why int instead of string?
		}
	 */
		//for each loop
		for(String eachCollection : obj) {
			System.out.println(eachCollection);
		}
	
	
	}

}
