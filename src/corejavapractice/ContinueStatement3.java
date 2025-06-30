package corejavapractice;

public class ContinueStatement3 {

	public static void main(String[] args) {
		
		int i=0;
		
		do {
			i++;
			if(i==3) {
				
				continue;
			}
			System.out.println("i Value is :"+i);
			
		}while(i<5);

	}

}
