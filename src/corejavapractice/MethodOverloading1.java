package corejavapractice;

public class MethodOverloading1 {

	public static void additionOfNum(int num1, int num2) {

		System.out.println(num1 + num2);
	}

	public static void additionOfNum(int num1, int num2, int num3) {
		
		System.out.println(num1+num2+num3);
	}
	
	public static void additionOfNum(int num1, int num2, int num3,int num4) {
		System.out.println(num1+num2+num3+num4);
	}
	
	public static void additionOfNum(String Fname, String lName) {

		System.out.println(Fname + lName);
	}
	public static void additionOfNum(int num1, Double num2) {

		System.out.println(num1 + num2);
	}

	public static void main(String[] args) {

		additionOfNum(50, 60);
		additionOfNum(50, 60, 70);
		additionOfNum(80, 90, 100, 110);
		additionOfNum("Dinesh","patil");
		additionOfNum(50, 10.56);

	}

}
