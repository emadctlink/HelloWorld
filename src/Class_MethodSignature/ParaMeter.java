package Class_MethodSignature;

public class ParaMeter {

	public static void main(String[] args) {

		ParaMeter obj = new ParaMeter();

		obj.pub();
		obj.pvt();
		obj.def();
		obj.prot();

		defStat();
		pvtStat();
		protStat();

	}

	// public non static
	public void pub() {
		System.out.println("This is public non static");
	}

	// Private non static
	private void pvt() {
		System.out.println("This is private non satic parameterized");
	}

	// Default non static
	void def() {
		System.out.println("This is default/no modifire non static");
	}

	// protected non static
	protected void prot() {
		System.out.println("This is protected non static");
	}

	// Default static
	static void defStat() {
		System.out.println("This is default/no modifire");
	}

	// Private static
	private static void pvtStat() {
		System.out.println("This is private static parameterized");
	}

	// Protected static parameter
	protected static void protStat() {
		System.out.println("This is protected static parameterized");
	}
	//here
	//public-	 Access Modifier
	//void-		 return type
	//prostat()-	 Method name
	//{ System.out.println("this is protected..");}-Method body

}
