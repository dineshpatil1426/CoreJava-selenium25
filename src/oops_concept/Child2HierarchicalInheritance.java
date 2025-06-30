package oops_concept;

class Parents1 {

	public void land() {
		System.out.println("This is Land");
	}

	public void gold() {
		System.out.println("This is Gold");
	}

}
class Child1 extends Parents1{
	public void shares() {
		System.out.println("This is Shares");
	}
}


public class Child2HierarchicalInheritance extends Parents1 {
	
	public void house() {
		System.out.println("This is house");
	}

	public static void main(String[] args) {
		
		Child1 chld1=new Child1();
		chld1.land();
		chld1.gold();
		chld1.shares();
		System.out.println("*********Child2 Properties*********");
		Child2HierarchicalInheritance obj= new Child2HierarchicalInheritance();
		obj.land();
		obj.gold();
		obj.house();
		
		
	}

}
