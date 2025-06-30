package corejavapractice;

public class AccessSpecifierNonStaticVar1 {

	public int a = 20;
	private int b = 30;
	protected int c = 40;
	int d = 50;

	public static void main(String[] args) {

		AccessSpecifierNonStaticVar1 obj = new AccessSpecifierNonStaticVar1();
		System.out.println(obj.a + obj.b + obj.c + obj.d);
	}

}
