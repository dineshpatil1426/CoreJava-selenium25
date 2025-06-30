package array_collection;

import java.util.Scanner;

public class ArrayBasic2 {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the size of Array");
		int size = s1.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter Array" + size + " Value ");
		
		//Loop to Accept into array  
		for(int i=0;i<size;i++) {
			
			arr[i]=s1.nextInt();
		}
		s1.close();
		// loop to View Array List
		System.out.println();
		System.out.print("Array list is:");
		for(int data: arr ) {
			
			System.out.print(data+" ");
		}
		
		System.out.println();
		
		// Reverse Array list 
		System.out.print("Reverse Array list is:");
		for(int i=size-1;i>=0;i--) {
			System.err.print(arr[i]+" ");
		}
		
		

	}

}
