package oops_concept;

//Abstract classes can also have final methods (methods that cannot be overridden)

//Java Program to Illustrate Abstract classes
//Can also have Final Methods

abstract class Base2{
	
	final void fun() {
		
		System.out.println("Base fun() called");
	}
}

class Derived2 extends Base2{
	
	// This class only inherits the Base class methods and
    // properties

}

public class AbstractClass5 {

	public static void main(String[] args) {
		
		Derived2 obj= new Derived2();
		obj.fun();
	}

}
