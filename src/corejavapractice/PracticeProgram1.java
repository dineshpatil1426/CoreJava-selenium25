package corejavapractice;

public class PracticeProgram1 {

	private static final double radius = 7.5;

	public static void main(String[] args) {

		// Write a Java program that takes a number as input and prints its
		// multiplication table up to 10. Test Data: Input a number: 8

		for (int i = 1; i <= 10; i++) {

			System.out.println("8" + "*" + i + "=" + i * 8);
		}

		System.out.println("***********************Program1***********************");

		// Write a Java program to compute the specified expressions and print the
		// output. ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))

		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

		System.out.println("***********************Program2***********************");

		// Write a Java program to print the area and perimeter of a circle. Radius =
		// 7.5

		double perimeter = 2 * Math.PI * radius;

		double area = Math.PI * radius * radius;

		System.out.println("Perimeter is :" + perimeter);
		System.out.println("Area is : " + area);

		System.out.println("***********************Program3***********************");
		// Write a Java program that takes three numbers as input to calculate and print
		// the average of the numbers.

		int num1 = 10, num2 = 20, num3 = 30, num4 = 40, num5 = 50;

		System.out.println("Average of five numbers is:" + (num1 + num2 + num3 + num4 + num5) / 5);

		System.out.println("***********************Program4***********************");
		// Write a Java program to print the area and perimeter of a rectangle. Width =
		// 5.5 Height = 8.5

		final double Width = 5.5;
		final double Height = 8.5;

		double perimeter1 = 2 * (Width * Height);

		double area1 = Width + Height;

		System.out.println("Perimeter is :" + perimeter1);
		System.out.println("Area is :" + area1);

		System.out.println("***********************Program5***********************");
		// Write a Java program to swap two variables.

		int a = 15, b = 27, temp;

		System.out.println("Before swapping : a,b=" + a + "," + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping : a,b=" + a + "," + b);

		System.out.println("***********************Program6***********************");

		// Write a Java program that displays the sum of n odd natural numbers.

		int sum = 0;
		for (int i = 1; i <= 7; i += 2) {

			System.out.println("-> "+i);
			sum += i;
		}
		System.out.println(sum);
		System.out.println("***********************Program7***********************");
		
		//Write a Java program to display the pattern like a right angle triangle with a number. 	Input number of rows : 10
		
		for(int i=1;i<=10;i++) {
			
			for(int j=1;j<i;j++) {
				System.out.print(j);
			}
			System.out.println(i);
		}
		System.out.println("***********************Program8***********************");
		
		for(int i=1;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("***********************Program9***********************");
		
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++);
				System.out.println(" ");
			}
			
		}
	}

}
