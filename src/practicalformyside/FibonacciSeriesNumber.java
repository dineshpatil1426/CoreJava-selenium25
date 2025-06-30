package practicalformyside;

public class FibonacciSeriesNumber {

	//0 1 1 2 3 5 8 13 21 34 
	
	public static void main(String[] args) {
		
		int num=10;
		int a=0;
		int b=1;
		
		for(int i=1;i<=num;i++) {
			System.out.print(a+" ");
			int temp=a+b;
			a=b;
			b=temp;
		}
		

	}

}
