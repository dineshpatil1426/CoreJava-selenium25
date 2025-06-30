package corejavapractice;

public class SwitchCaseCondition {

	public static void main(String[] args) {
		 
		int a=6;
		int b=10;
		int c=b-a;
		
		switch (c) {
		case 1:
			System.out.println("C value is 1 =>"+ c);
			break;
		case 2:
			System.out.println("C value is 2 =>"+ c);
			break;	
		case 3:
			System.out.println("C value is 3 =>"+ c);
			break;
		case 4:
			System.out.println("C value is 4 =>"+ c);
			break;	
		case 5:
			System.out.println("C value is 5 =>"+ c);
			break;
		case 6:
			System.out.println("C value is 6 =>"+ c);
			break;
			
		default:
			System.out.println("C value is out of range");
			break;
		}

	}

}
