package corejavapractice;

class demo {

	int num;

	demo() {
		 this(100);
		System.out.println("Default Constructor");
	}

	demo(int n) {
		num = n;
		System.out.println("Parameterized Constructor");
	}
}

class demo1 extends demo {

	demo1() {
		super();
		System.out.println("Default Constructor different Class");
	}
}



public class SimpleConstructor {

	public static void main(String[] args) {

		demo obj = new demo1();
	}

}
