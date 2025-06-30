package practicalformyside;

public class PowerOfNumber {
	
	//Java Program to Calculate the Power of a Number
	public static void main(String[] args) {
		
		int base=2;
		int exponet=9;
		
		long result=1;
		
		while (exponet!=0) {
			result=result*base;
			--exponet;
		}
		System.out.println(result);
	}

}
