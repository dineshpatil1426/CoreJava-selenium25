package oops_concept;

//Java Program to illustrate Abstract class
//Without any abstract method

//Class 1
//An abstract class without any abstract method

abstract class Base1 {

	void fun() {
		System.out.println("Function of Base class is called");
	}
}

class Derived1 extends Base1{
	// This class only inherits the Base class methods and
    // properties
}

public class AbstractClass4 {

	public static void main(String[] args) {
		
		Derived1 obj= new Derived1();
		obj.fun();
		
	}

}
