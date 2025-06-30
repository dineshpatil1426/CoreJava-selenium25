package oops_concept;

//Hybrid Inheritance

class c{
	public void disp() {
		System.out.println("c");
	}
}

class A extends c{
	public void disp() {
		System.out.println("A");
	}
}
class B extends c {
	public void disp() {
		System.out.println("B");
	}
}

public class D extends A {

	public void disp() {
		System.out.println("D");
	}
	
	public static void main(String[] args) {
		
		D obj= new D();
		obj.disp();
		

	}

}
