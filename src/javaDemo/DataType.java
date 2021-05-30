package javaDemo;

public class DataType {

	public static void main(String[] args) {
		
		/*
		Two Type Data  1. primitive data Type 2.Non primitive data type
			Primitive = short, int, double, long, float, boolean, char
			NonPrimitive = String, arrays,classes, interface 
		*/
		
		//Primitive
		short s = 11;
		int x =20;
		int y = 20+40;
		double d = 10.25;
		long l = 1234567890;
		float f = 10.20f;
		boolean m = (10>11); //false		boolean is logical(true or false only)
		boolean n = (19>15); //true
		boolean a = (19!=15); //true
		boolean b = (20!=20); //false
		boolean c = (25==25); //true
		char ch = 'c';
		
		//Non Primitive
		String z = "Is it okay";
		String line = "I am learning Java";
		
		//Return
		System.out.println("short = "+s);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("Double  is "+d);
		System.out.println("Long  is "+l);
		System.out.println("float is "+f);
	
		System.out.println("m is "+m);
		System.out.println("n is "+n);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(ch);
		
		System.out.println(line);
		System.out.println(z);
		
		
		
	}

}