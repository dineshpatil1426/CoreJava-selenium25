package practicalformyside;

import java.util.Arrays;

//Write a program which triples (*3) every third element, starting with 0, in the existing array named array.
public class ArrayBasic3 {
	
	
	public static int [] array= new int[] {-10, 20, 30, -40, -50, 60, 70, -80, -90};

	public static void main(String[] args) {
		
		for(int i=0;i<array.length;i+=3) {
			array[i]=array[i]*3;
			//array[i]*=3;
		}
		System.out.println(Arrays.toString(array));

	}

}
