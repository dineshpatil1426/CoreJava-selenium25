package oops_concept;

//Abstract Class having constructor, data member, and methods

abstract class Subject {

	Subject() {
		System.out.println("Learning Subject");
	}

	abstract void syllabus();

	void learn() {
		System.out.println("Preparing Right Now!");
	}
}

class IT extends Subject {

	@Override
	void syllabus() {
		System.out.println("C , Java , C++");

	}
}

public class AbstractClass2 {

	public static void main(String[] args) {
		Subject obj = new IT();
		obj.syllabus();
		obj.learn();

	}

}
