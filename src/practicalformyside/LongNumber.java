package practicalformyside;

// interview Question: Output when print a long number with L and without L suffix in

public class LongNumber {

	public static void main(String[] args) {
		
		long longNumberWithoutL=1000*60*60*24*365;  //1471228928
		long longNumberWithL=1000*60*60*24*365L;   //31536000000

	
		
		System.out.println(longNumberWithoutL);
		System.out.println(longNumberWithL);

	}

}
