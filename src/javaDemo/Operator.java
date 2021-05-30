package javaDemo;

public class Operator {

	public static void main(String[] args) {
		
		//Operator- Arithmetic, assignment, Comparison and Logical
		
		int x = 25;
		int y = 10;
		double d = 3.0;
		
		//Arithmetic
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/d);
		System.out.println(y%x); //dont understand
		
		++x;
		System.out.println(x); //26
		--y;
		System.out.println(y); //9
		
		//Comparison
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		
	}

}
