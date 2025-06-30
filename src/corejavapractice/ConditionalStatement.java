package corejavapractice;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		int a= 10;
		int b= 5;
		int c= 3;	
		
		
		
		/*
		// If Condition  

		if(a>b) {
			
			System.out.println("A is Less Than B");
		}
		*/
		
		/*
         // if else Condition 		
		if(a<b) {
			
			System.out.println("A is Less Than B");
		}
		else {
			System.out.println("A is not less Than B");
		}
		*/
		
		// Nested if 
		if(a<b && a<c) {
			System.out.println("A is Less than Value");
		}else 
			if(b<c) {
				System.out.println("B is Less than Value");
			}else {
				System.out.println("C is Less than Value");
			}

	}

}
