package oops_concept;

//Java Program to Illustrate Abstract Class 
//Can contain Constructors

abstract class Base {

	public Base() {

		System.out.println("Base Constructor Called");
	}

	abstract void fun();

}

class Derived extends Base {

	public Derived() {
		System.out.println("Derived Constructor Called");
	}

	@Override
	void fun() {

		System.out.println("Derived fun() called");
	}

}

public class AbstractClass3 {

	public static void main(String[] args) {
		
		Derived obj = new Derived();
		obj.fun();
	}

}
