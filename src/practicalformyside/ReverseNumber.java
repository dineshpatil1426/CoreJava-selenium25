package practicalformyside;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=185;
		int rem;
		int sum=0;
		
		System.out.println("Before Reverse Number:"+num);
		
		while(num!=0) {
			
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		
		System.out.println("After Reverse Number:"+sum);

	}

}
