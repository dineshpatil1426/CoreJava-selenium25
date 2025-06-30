package oops_concept;

class Parent2 {
	final void display() {
		System.out.println("Display method in parent class ");
	}

}

public class FinalMethod extends Parent2 {
     
	//Override the Method with Final keyword
	
	//void display() 
	void display1(){
		System.out.println("Display method in Child class ");
	}

	public static void main(String[] args) {
		
		FinalMethod obj = new FinalMethod();
		obj.display();
		
	}

}
