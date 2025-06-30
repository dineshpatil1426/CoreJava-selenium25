package oops_concept;

class parent {
	
	 public void land() {
		System.out.println("This is Land");
	}

}

public class ChildSingleInheritance extends parent {

	public void gold() {
		System.out.println("This is Gold");
	}

	public static void main(String[] args) {

		ChildSingleInheritance obj = new ChildSingleInheritance();
		obj.land();
		obj.gold();
	}

}
