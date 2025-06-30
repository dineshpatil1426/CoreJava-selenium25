package practicalquestion;

public class SpecailCharOfString {

	public static void main(String[] args) {
		
		String str="tommorrow";
		
		String[] arr=str.split("");
		int count=0;
		String str2="";
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("o")) {
				count++;
				for(int j=0;j<count;j++) {
					str2+="$";
				}
					
				}else {
					str2+=arr[i];
				}
			}
		System.out.println(str2);
		}

	}
	
