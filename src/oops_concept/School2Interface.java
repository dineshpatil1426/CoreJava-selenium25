package oops_concept;

interface Software {

	public void startDate();

	public void endDate();

	public void fee();
}
interface software1{
	
	public void subject();
}

class School1 implements Software,software1 {

	@Override
	public void startDate() {

		System.out.println("5th June25 ");

	}

	@Override
	public void endDate() {
		System.out.println("15th April25");

	}

	@Override
	public void fee() {
		System.out.println("80,000");
	}
	
	public void Sport() {
		System.out.println("Crikert");
	}

	@Override
	public void subject() {
		System.out.println("subject-1");
		
	}

}

public class School2Interface implements Software {

	@Override
	public void startDate() {
		System.out.println("11th june25");

	}

	@Override
	public void endDate() {
		System.out.println("30 April25");

	}

	@Override
	public void fee() {
		System.out.println("50,000");

	}

	public static void main(String[] args) {
			
		Software s1= new School1(); //upcasting 
		
		s1.startDate();
		s1.endDate();
		s1.fee();
		School1 s2= new School1();
		s2.Sport();
		software1 ss2= new School1();
		ss2.subject();
		System.out.println("************School 2 Details************");
		
		Software s3 = new School2Interface();
		s3.startDate();
		s3.endDate();
		s3.fee();
		
	}

}
