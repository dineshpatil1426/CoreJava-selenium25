package practicalformyside;

import java.util.Arrays;

public class AllArrayProgram1 {

	public static void main(String[] args) {
		
		System.out.println("*********Question 1**********");
		//Question 1: Creating and Initializing an Array
		int[] myArray= {1,2,3,4,5};
		System.out.println("Array created with elements: " +Arrays.toString(myArray));
		
		System.out.println("*********Question 2**********");
		//Question 2: Accessing Elements of an Array
		System.out.println("The first element is: "+ myArray[1]);
		System.out.println("The first element is: "+ myArray[4]);
		
		System.out.println("*********Question 3**********");
		//Question 3: Modifying Elements of an Array
		myArray[1]=10;
		System.out.println(Arrays.toString(myArray));
		
		System.out.println("*********Question 4**********");
		//Question 4: Finding the Length of an Array
		System.out.println(" The length of the array is: "+ myArray.length);
		
		System.out.println("*********Question 5**********");
		//Question 5: Looping through an Array
		for(int i=0;i<myArray.length;i++) {
			System.out.println("Element at index "+i+ " : "+ myArray[i]);
		}
		System.out.println("*********Question 6**********");
		//Question 6: Multi-dimensional Arrays
		
		int[][] multiArray= {{1,5},{2,6},{3,9}};
		System.out.println("Element at row 1 column 1 : "+multiArray[2][1]);
		
		
			
	}

}
