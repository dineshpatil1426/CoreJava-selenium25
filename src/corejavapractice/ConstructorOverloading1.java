package corejavapractice;

public class ConstructorOverloading1 {

	int a;
	int b;
	int c;

	  
	
	
	public ConstructorOverloading1(int m1, int m2) {
		a = m1;
		b = m2;
	}

	public ConstructorOverloading1(int m1, int m2, int m3) {
		a = m1;
		b = m2;
		c = m3;
	}

	void total() {
		System.out.println(a + b);
	}

	void percentage() {
		System.out.println((a+b)/2);
	}
	void total1() {
		System.out.println(a+b+c);
	}
	void percentage1() {
		System.out.println((a+b+c)/3);
	} 
	

	public static void main(String[] args) {
		
		ConstructorOverloading1 obj=new ConstructorOverloading1(95, 75);
		
		obj.total();
		obj.percentage();
		
		ConstructorOverloading1 obj1= new ConstructorOverloading1(90, 91, 92);
		obj1.total1();
		obj1.percentage1();
		

		

	}

}
