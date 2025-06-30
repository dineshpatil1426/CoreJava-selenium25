package basicpractice;

public class LargestNumOfArray {
	
	//Write a Java Program to Find the Largest Element in Array
	public static void main(String[] args) {

		int[] arr= {4, 2, 5, 1, 7};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						 int temp=arr[i];
						 arr[i]=arr[j];
						 arr[j]=temp;
					}
			}
			
		}
		System.out.print(arr[0]);
	}

}
