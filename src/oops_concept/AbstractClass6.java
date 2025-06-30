package oops_concept;

//Java Program to Illustrate 
//Static Methods in Abstract
//Class Can be called Independently

abstract class Helper{
	
	static void demofun() {
		System.out.println("GrowSkill It");
	}
}


public class AbstractClass6 extends Helper {

	public static void main(String[] args) {
		
		Helper.demofun();
	}

}
