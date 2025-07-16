package array_collection;

public class MCQArray {

	public static void main(String[] args) {
		
			int[] arr= {1,6,3,4,5,8};
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>4) {
					continue;
				}
				System.out.print(arr[i]+" ");
			}
			

	}

}
