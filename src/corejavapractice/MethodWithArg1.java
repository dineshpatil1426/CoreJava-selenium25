package corejavapractice;

public class MethodWithArg1 {

	// public Static Method with Argument
	public static void s1(int a, int b) {

		System.out.println("public Static Method with Argument :" + (a + b));
	}

	// private Static Method with Argument
	private static void s2(int a, int b) {

		System.out.println("private Static Method with Argument :" + (a + b));
	}

	// protected Static Method with Argument
	protected static void s3(int a, int b) {

		System.out.println("protected Static Method with Argument :" + (a + b));
	}

	// Default Static Method with Argument
	static void s4(int a, int b) {

		System.out.println("Default Static Method with Argument :" + (a + b));
	}

	/*
	//return type  Method 
	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;
	}
	 */
	
	// public Non Static Method with Argument
	public void n1(int n1, int n2) {
		System.out.println("public Non Static Method with Argument :" + (n1 * n2));
	}

	// private Non Static Method with Argument
	private void n2(int n1, int n2) {
		System.out.println("private Non Static Method with Argument :" + (n1 * n2));
	}

	// protected Non Static Method with Argument
	protected void n3(int n1, int n2) {
		System.out.println("protected Non Static Method with Argument :" + (n1 * n2));
	}

	// Default Non Static Method with Argument
	void n4(int n1, int n2) {
		System.out.println("Default Non Static Method with Argument :" + (n1 * n2));
	}

	public static void main(String[] args) {

		s1(50, 60);
		s2(90, 100);
		s3(100, 110);
		s4(120, 130);
		//int valueFun =minFunction(15, 20);
		//System.out.println("Minimum Value of :"+valueFun);
		
		MethodWithArg1 obj = new MethodWithArg1();
		obj.n1(60, 5);
		obj.n2(80, 5);
		obj.n3(90, 5);
		obj.n4(100, 5);

	}

}
