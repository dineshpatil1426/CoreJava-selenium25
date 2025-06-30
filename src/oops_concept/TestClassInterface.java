package oops_concept;

interface TestInterface{
	
	final int a=10;
	
	void display();
}


class Testclass implements TestInterface{
	

	@Override
	public void display() {
		System.out.println("Hotstar");
	}
	
}

public class TestClassInterface {

	public static void main(String[] args) {
		
			TestInterface obj= new Testclass();
			obj.display();
			System.out.println(obj.a);
	}

}
