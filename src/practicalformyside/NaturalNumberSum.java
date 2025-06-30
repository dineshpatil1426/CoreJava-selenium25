package practicalformyside;

public class NaturalNumberSum {

	//Natural Number sum 
	
	public static void main(String[] args) {
		
		int num=100;
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			
			sum+=i;
		}
		System.out.println("Natuaral Number Sum of : " + sum);
		
		System.out.println("-----------------------");
		//Logic 2
		int sum1=0;
		int k=1;
		while(k<=num) {
			sum1+=k;
			k++;
		}
		System.out.println("Natuaral Number Sum of : " + sum1);
		
	}

}
