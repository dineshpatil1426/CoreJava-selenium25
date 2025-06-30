package oops_concept;

abstract class B2 {

	abstract class C2 {
		abstract void myAbstractMethod();
	}
}

class D2 extends B2 { 
	class E2 extends C2 {

		@Override
		void myAbstractMethod() {
			System.out.println("Inside abstract method implementation");

		}
	}
}

public class AbstractClass7 {

	public static void main(String[] args) {
		
		
		// Instantiating the outer class
		D2 outer= new D2();
		
		// Instantiating the inner class
		D2.E2 inner = outer.new E2();
		inner.myAbstractMethod();
	}

}
