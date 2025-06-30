package practicalquestion;

public class OccuranceCharCount {

	public static void main(String[] args) {
		
		
		String str="manas";
		
		// Output : m=1 a=2 n=1 s=1
		
		
		String[] arr=str.split("");
		int count=1;
		String str2="";
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					count++;	
				}
			}
			if(!str2.contains(arr[i])) {
			System.out.println(arr[i]+"="+count);	
			str2+=arr[i];
			count=1;
			}
		}

	}

}
