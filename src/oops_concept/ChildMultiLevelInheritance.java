package oops_concept;

class GrantParents {
	
	public void land() {
		System.out.println("This is land");
	}

}

class Parents extends GrantParents {

	public void gold() {
		System.out.println("This is gold");
	}
}

public class ChildMultiLevelInheritance extends Parents {

	public void shares() {
		System.out.println("This is Shares");
	}

	public static void main(String[] args) {
		
		ChildMultiLevelInheritance obj= new ChildMultiLevelInheritance();
		
		obj.land();
		obj.gold();
		obj.shares();
	}

}
