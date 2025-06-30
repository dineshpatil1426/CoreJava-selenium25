package basicpractice;

public class SumOfArray {

	//Write a Java Program to Compute the Sum of Array Elements.
	public static void main(String[] args) {
		
		int [] arr= {2, 4, 6, 7, 9};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		System.out.println("Sum of Array:"+sum);
		
	}

}
