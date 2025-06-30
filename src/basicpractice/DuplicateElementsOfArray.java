package basicpractice;

public class DuplicateElementsOfArray {

	public static void main(String[] args) {
		
		int[] arr= {1, 2, 2, 3, 3, 3, 4, 5};
		
		int[] temp= new int[arr.length];
		
		int newsize=0;
		
	
		for(int i=0;i<arr.length;i++){
			boolean isduplicate=false;
			for(int j=0;j<newsize;j++) {
				if(arr[i]==temp[j]) {		
					isduplicate=true;
					break;
				}
				
			}
			if(!isduplicate) {
				temp[newsize]=arr[i];
				newsize++;
			}
			
		}
		
		System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newsize; i++) {
            System.out.print(temp[i] + " ");
        }

	}

}
