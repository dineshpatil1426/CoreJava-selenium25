package corejavapractice;

public class MethodReturnTypeWithArg {

	public static int M1(int x, int y) {
		int z = x + y;
		return z;
	}

	public int m2(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {

		MethodReturnTypeWithArg obj = new MethodReturnTypeWithArg();
		System.out.println(M1(50, 25));
		System.out.println(obj.m2(50, 85));

	}

}
