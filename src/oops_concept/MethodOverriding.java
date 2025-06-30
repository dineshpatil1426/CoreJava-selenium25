package oops_concept;

class A1 {
	public void a1() {
		System.out.println("This is a1 Method in A Class");
	}
}

class B1 extends A1 {
	public void a1() {
		System.out.println("This is a1 Method in B Class");
	}
}

class C1 extends B1 {
	public void a1() {
		System.out.println("This is a1 Method in C Class");
	}
}

public class MethodOverriding extends C1 {

	
	public void a1() {
		System.out.println("This is a1 Method in MethodOverriding Class");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding obj= new MethodOverriding();
		obj.a1();
	}

}
