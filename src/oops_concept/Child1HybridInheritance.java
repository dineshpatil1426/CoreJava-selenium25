package oops_concept;

class GrantParents1 {
	public void land() {
		System.out.println("This is land");
	}
}

class BigParents1 extends GrantParents1 {
	public void gold() {
		System.out.println("This is Gold");
	}
}

class ElderParents2 extends GrantParents1 {
	public void shares() {
		System.out.println("This is Share");
	}
}

public class Child1HybridInheritance extends BigParents1 {

	public void house() {
		System.out.println("This is House");
	}

	public static void main(String[] args) {

		System.out.println("*******BigParents Child1*******");
		Child1HybridInheritance obj = new Child1HybridInheritance();
		obj.land();
		obj.gold();
		obj.house();
		System.out.println("*******ElderParents2*******");
		ElderParents2 ed= new ElderParents2();
		ed.land();
		ed.shares();
		System.out.println("*******BigParents1*******");
		BigParents1 bp= new BigParents1();
		bp.land();
		bp.gold();
		System.out.println("*******GrantParents1*******");
		GrantParents1 gp= new GrantParents1();
		gp.land();
		
	

	}

}
