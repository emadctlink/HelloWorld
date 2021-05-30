package Class_MethodSignature;

public class practice {

	
	public static void main(String[] args) {
		
		practice obj = new practice();
		
		pubstat();
		pvtstat();
		defstat();
		protstat();
		
		obj.pub();
		obj.pvt();
		obj.def();
		obj.prot();
		
		fruits("apple", " Banana");
		cat("Black", " White");
		number(25);
		chair("Brown",1, "Table");
		
		obj.car("color","silver ");
		obj.car("one ", "car");
		obj.house("single", " family");
		obj.number1(25);
		obj.name("Zimam");
		obj.name("Zainab");
		
	
	}

	//parameter
	public static void pubstat() {
		System.out.println("this is public static");
	}
	private static void pvtstat() {
		System.out.println("this private static");
	}
	static void defstat() {
		System.out.println("this is default static");
	}
	protected static void protstat() {
		System.out.println("this is protected static");
	}
	public void pub() {
		System.out.println("this is public non static");
	}
	private void pvt() {
		System.out.println("this is private non static");
	}
	void def() {
		System.out.println("this is default non static");
	}
	protected void prot() {
		System.out.println("this is protected non static");
	}
	
	//Return Type
	public static String fruits(String a, String b) {
		System.out.println("I like "+(a+b));
		return a+b;
	}
	private static String cat(String c, String d) {
		System.out.println("Cat is "+(c+d));
		return c+d;
	}
	static int number(int i) {
		System.out.println("number = "+i);
		return i;
	}
	protected static  String chair(String e, int f, String g ) {
		System.out.println("Table = "+(f+e+g));
		return f+e+g;
	}
	public String car(String j, String k ) {
		System.out.println("My car is "+(k+j));
		return j+k;
	}
	
	private String house(String l, String m) {
		System.out.println(l+m);
		return l+m;
	}
	int number1(int o) {
		System.out.println(50+o);
		return o;
	}
	protected String name(String p) {
		System.out.println(p);
		return p;
	}
	
	
}
