package corejavapractice;

public class MethodReturnType {

	public static int m1() {
		int a = 20;
		int b = 30;
		int c=a+b;
		return c;
	}
	public static String s1() {
		String name ="Dinesh";
		return name;
	}
	public String s2() {
		
		String name ="Dinesh QA";
		return name;
	}

	public static void main(String[] args) {

		MethodReturnType obj=new MethodReturnType();
		String value=obj.s2();
		System.out.println(m1());
		System.out.println(s1());
		System.out.println(value);
	}

}
