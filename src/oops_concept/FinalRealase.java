package oops_concept;

abstract class FirstRealase {
	public void offLineClass() {
		System.out.println("Start the off-Line Class");
	}

	public abstract void onlineClass();

	public abstract void corporatClass();
}

abstract class SecondRealase extends FirstRealase {

	@Override
	public void onlineClass() {

		System.out.println("Start the Online Class");
	}
}

public class FinalRealase extends SecondRealase {

	@Override
	public void corporatClass() {

		System.out.println("Start the Corparate class");
	}

	public static void main(String[] args) {

		FinalRealase obj = new FinalRealase();

		obj.offLineClass();
		obj.onlineClass();
		obj.corporatClass();

	}

}
