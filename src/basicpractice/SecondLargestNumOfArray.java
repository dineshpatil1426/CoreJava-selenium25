package basicpractice;

//Write a Java Program to print the second largest number in a given array.	
public class SecondLargestNumOfArray {

	public static void main(String[] args) {
		
		int[] arr= {20,32,15,45,56,69,74,88,99,151};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Second Largest Number Of Array is: " + arr[1]);

	}

}
