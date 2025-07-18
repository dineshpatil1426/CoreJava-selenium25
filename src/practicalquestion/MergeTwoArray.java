package practicalquestion;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int[] arr1= {1,5,8,4};
		int[] arr2= {2,6,3,7};
		
		int[] merge= new int[arr1.length +arr2.length];
		
		
		for(int i=0;i<arr1.length;i++) {
			merge[i]=arr1[i]; 
		}
			
		for(int i=0;i<arr2.length;i++) {
			merge[arr1.length+i]=arr2[i];
		}
		
		for(int i=0;i<merge.length;i++) {
			for(int j=i+1;j<merge.length;j++) {
				if(merge[i]>merge[j]) {
					int temp=merge[i];
					merge[i]=merge[j];
					merge[j]=temp;
				}
			}
			
			System.out.print(merge[i]+" ");
		}

	}

}
