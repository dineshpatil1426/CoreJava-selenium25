package corejavapractice;

public class MethodWithArgDiffClass {

	public static void main(String[] args) {
		
		MethodWithArg1.s1(70,80);
		MethodWithArg1.s3(90,100);
		MethodWithArg1.s4(110,120);
		MethodWithArg1 obj= new MethodWithArg1();
		obj.n1(70,5);
		obj.n3(80, 5);
		obj.n4(90, 5);

	}

}
