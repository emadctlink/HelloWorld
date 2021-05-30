package Class_MethodSignature;

public class ReturnType {

	
	public static void main(String[] args) {
		
	ReturnType obj = new ReturnType();
		
		obj.veg("Spinach"," Squash"," Carrot"); //public non static
		obj.pvt(6, 7); //private non static
		obj.sumaila(5, 10, 20); // Default non static
		obj.prot(10, " Apple"); //protected non static
		
		tricky(20);// static return
		extra("Atia"); //private static 
		extra("Ashraf");
		extra("Apple");
		
		
	}
	
	//public non static
	public String veg(String a, String b, String c) {
		System.out.println(a+b+c);
		return (a+b+c);
	}
	
	//Private non static
	private int pvt(int m, int n) {
		System.out.println(m+n);
		return m+n;
	}
	
	//Default non static
	int sumaila(int x, int y, int z ){
		System.out.println(x+y);
		System.out.println(z-y);
		return(x+y+z);
	}
	
	//protected non static
	protected String prot(int a, String b) {
		System.out.println(a + b);
		return a+b;
	}
	
	// Default static return
	static int tricky(int x){
		System.out.println(x + 50);
		return x;
	}
	
	//Private static return
	private static String extra(String x) {
		System.out.println(x + " Vai");
		return x;
	}
}
