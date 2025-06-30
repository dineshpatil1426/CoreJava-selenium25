package oops_concept;

class Animal {
	public void makeSound() {
		System.out.println("The animal makes a sound");
	}
}

class Bird extends Animal {
	public void makeSound() {
		System.out.println("The bird chirps");
	}
}

public class PolymorphismCat extends Animal {
	public void makeSound() {
		System.out.println("The cat meows");
	}

	public static void main(String[] args) {
		
			Animal an= new Animal();
			Bird b= new Bird();
			PolymorphismCat c= new PolymorphismCat();
			
			an.makeSound();
			b.makeSound();
			c.makeSound();
	}

}
