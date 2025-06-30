package oops_concept;

class Sports {
	public void play() {
		System.out.println("Playing a sport...\n");
	}
}

class FootBall extends Sports {

	public void play() {
		System.out.println("Playing football...");
	}
}

class BasketBall extends Sports {

	public void play() {
		System.out.println("Playing Basketball...");
	}
}

class Rugby extends Sports {

	public void play() {
		System.out.println("Playing Rugby...");
	}
}

public class SportPoly {

	public static void main(String[] args) {
		
		Sports sport= new Sports();
		FootBall football= new FootBall();
		BasketBall basketball= new BasketBall();
		Rugby rg= new Rugby();
		
		sport.play();
		football.play();
		basketball.play();
		rg.play();
		
		
		
	}

}
