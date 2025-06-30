package corejavapractice;

public class NonStaticVar {

	public int a = 20;
	public int b = 30;

	public static void main(String[] args) {

		NonStaticVar obj = new NonStaticVar();
		System.out.println(obj.a * obj.b);

	}

}
