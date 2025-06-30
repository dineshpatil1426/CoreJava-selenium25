package practicalformyside;

public class LargestAmongThreeNumber {

	public static void main(String[] args) {
		
		int x=100;
		int y=200;
		int z=300;
		
		if(x>y && x>z) {
			System.out.println("x is the Greatest");
		}else if(y>z){
			System.out.println("y is the Greatest");
		}else
		{
			System.out.println("z is the Greatest");
		}
		
		
		//Second Logic 
		if(x>=y) {
			if(x>=z) {
				System.out.println("x is the Greatest");
			}else {
				System.out.println("z is the Greatest");	
			}
		}else {
			if(y>=z) {
				System.out.println("y is the Greatest");
			}else {
				System.out.println("z is the Greatest");	
			}
		}
			

	}

}
