package oops_concept;

//1. Example of Abstract Class that has Abstract method

abstract class Sunstar{
	
	 abstract void printInfo();
}

class Employee2 extends Sunstar{
	
	@Override
	void printInfo() {
		
		String name="Dinesh";
		int age=34;
		float salary=222.2f;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
}



public class AbstractClass1 {

	public static void main(String[] args) {
		
		Employee2 obj= new Employee2();
		obj.printInfo();

	}

}
