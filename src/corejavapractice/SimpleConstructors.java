package corejavapractice;

public class SimpleConstructors {

	public SimpleConstructors() {
		System.out.println("This is Constructors ");
	}

	public void method1() {
		System.out.println("This is Simple method");
	}

	public static void main(String[] args) {
		SimpleConstructors obj = new SimpleConstructors();
		obj.method1();

	}

}
