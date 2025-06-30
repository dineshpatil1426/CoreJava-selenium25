package corejavapractice;

public class StudentConstructor2 {
	int a;
	int b;

	public StudentConstructor2(int m1,int m2) {
		a=m1;
		b=m2;
	}

	void total() {
		System.out.println("Total is :"+(a+b));
	}
	void parcentage() {
		System.out.println("parcentage is :"+ (a+b)/2);
	}
	
	
	public static void main(String[] args) {

		StudentConstructor2 obj=new StudentConstructor2(85, 90);
		obj.total();
		obj.parcentage();
		
		System.out.println("********Students2********");
		
		StudentConstructor2 obj1= new StudentConstructor2(95, 93);
		obj1.total();
		obj1.parcentage();
		
	}

}
