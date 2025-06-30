package corejavapractice;

public class XyzConstructor1 {

	XyzConstructor1(){
		System.out.println("This is Default Constructor");
	}
	public void method1() {
		System.out.println("this is Method");
	}
	public static void main(String[] args) {
		
		XyzConstructor1 obj= new XyzConstructor1();
		obj.method1();

	}

}
