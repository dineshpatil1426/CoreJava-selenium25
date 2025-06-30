package basicpractice;

public class OccurrencesOfArray {

	public static void main(String[] args) {
		
		int[] arr= {1, 2, 1, 3, 5, 1};
		int[] newarry=new int[arr.length];
		
		int newsize=1;
		
		for(int i=0; i<arr.length;i++) {
		    boolean isOccurenceArry=false;
		    for(int j=0;j<newsize;j++) {
		    	  if(arr[i]==arr[0]) {
		    		  isOccurenceArry=true;
		    		  break;
		    	  }
		    }
		    if(!isOccurenceArry) {
		    	newarry[newsize]=arr[i];
		    	newsize++;
		    }
		}
		System.out.println("Remove All Occurrences of an Element:");
        for (int i = 1; i < newsize; i++) {
            System.out.print(newarry[i] + " ");
        }

	}

}
