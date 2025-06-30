package practicalformyside;

import java.util.Arrays;
import java.util.Scanner;

//Write a program that fills the existing array named array with integers read from the keyboard.

public class ArrayBasic2 {

	public static int[] array = new int[10];

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Array Value :");
		for (int i = 0; i < array.length; i++) {

			array[i] = s1.nextInt();
		}

		System.out.println(Arrays.toString(array));
		s1.close();
	}

}
