package corejavapractice;

public class PyramidPatternNestedForLoop {

	public static void main(String[] args) {

		// half pyramid pattern using nested loops
		/*
		 * int rows = 5;
		 * 
		 * for(int i=1; i <= rows; ++i) {
		 * 
		 * for(int j=1;j<=i;++j) {
		 * 
		 * System.out.print(j+ " ");
		 * 
		 * } System.out.println(); }
		 */

		// Decending order pyramid pattern using nested loops
		/*
		 * int rows=1; for(int i =5; i>=rows; --i) {
		 * 
		 * for(int j =5;j>=i; --j) { System.out.print(j+ " "); } System.out.println(); }
		 */

		/*
		 * int rows=5; for(int i=1;i<=rows;i++) {
		 * 
		 * for(int j=1;j<=i;j++) {
		 * 
		 * System.out.print(i + " "); } System.out.println(); }
		 */

		

		for (int i = 1; i <= 5; i++) {

			for (int j = 4; j >= i; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
