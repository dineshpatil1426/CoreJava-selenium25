package corejavapractice;

public class BreakStatement3 {

	public static void main(String[] args) {
		
		int i=0;
		
		do {
			if(i==3) {
				break;
			}
			
			System.out.println("is Value is :"+i);
			i++;
			
		}while(i<=5);

	}

}
