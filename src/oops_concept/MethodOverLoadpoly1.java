package oops_concept;

public class MethodOverLoadpoly1 {

	public void openSheet(String name) {
		System.out.println("Sheet open with Name");
	}
	public void  openSheet(int number) {
		System.out.println("Sheet open with Number");
	}
	
	public static void main(String[] args) {
		MethodOverLoadpoly1 obj=new MethodOverLoadpoly1();
		obj.openSheet("Test");
		obj.openSheet(7);
		

	}

}
