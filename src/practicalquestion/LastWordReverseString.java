package practicalquestion;

// string str="I love jave Programing"; 
//output : I love jave 

public class LastWordReverseString {

	
	
	
	public static void main(String[] args) {
		
		
		String str="I love java Programming";
		
		String str1=str.toLowerCase();
		
		String str2="";
		
		String[] arr=str1.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			boolean isFlag=false;
			if(arr[3].equals(arr[i])) {
				isFlag=true;
				str2=arr[i];
				
				for(int j=str2.length()-1;j>=0;j--) {
					System.out.print(str2.charAt(j));
				}			
			}
		
			if(!isFlag) {
				System.out.print(arr[i]+ " ");
			}
			
		}
		
	}

}
