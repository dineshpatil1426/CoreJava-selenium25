package corejavapractice;

public class LocalVariable1 {

	// Example 1: Variable’s local scope with initialization
	public static void pupAge() {
		int age = 0;
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	}
	
	/*
	//Example 2: Variable’s local scope without initialization—
	public static void pupAge1() {
		int age;
		age=age + 7;
		System.out.println("Puppy age is : " + age);
	}
	 */
	public static void main(String[] args) {

		pupAge();
		//pupAge1();
	}

}
