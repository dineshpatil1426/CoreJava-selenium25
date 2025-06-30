package corejavapractice;

public class MethodFuncation1 {

	// Public Static Method
	public static void s1() {
		int a = 10;
		int b = 20;
		System.out.println("Public Static Method : " + (a + b));
	}

	// private Static Method
	private static void s2() {
		int a = 20;
		int b = 30;
		System.out.println("private Static Method " + (a + b));
	}

	// protected Static Method
	protected static void s3() {
		int a = 30;
		int b = 40;
		System.out.println("protected Static Method " + (a + b));
	}

	// Default Static Method
	static void s4() {
		int a = 40;
		int b = 50;
		System.out.println("Default Static Method : " + (a + b));
	}

	// Public Non Static Method
	public void n1() {
		int n1 = 20;
		int n2 = 5;
		System.out.println("Public Non Static Method : " + (n1 * n2));
	}

	// private Non Static Method
	private void n2() {
		int n1 = 30;
		int n2 = 5;
		System.out.println("private Non Static Method : " + (n1 * n2));
	}

	// protected Non Static Method
	protected void n3() {
		int n1 = 40;
		int n2 = 5;
		System.out.println("protected Non Static Method : " +(n1 * n2));
	}

	// Default Non Static Method
	void n4() {
		int n1 = 50;
		int n2 = 5;
		System.out.println("Default Non Static Method : " + (n1 * n2));
	}

	public static void main(String[] args) {

		s1();
		s2();
		s3();
		s4();
		MethodFuncation1 obj = new MethodFuncation1();
		obj.n1();
		obj.n2();
		obj.n3();
		obj.n4();

	}

}
