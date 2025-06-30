package basicpractice;

public class SwapTwoNum {

	public static void main(String[] args) {
		
			int a=2;
			int b=5;
			System.out.println("Before Swap Two Num: " +a+"  "+ b);
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("After Swap Two Num: " +a+"  "+ b);

	}

}
