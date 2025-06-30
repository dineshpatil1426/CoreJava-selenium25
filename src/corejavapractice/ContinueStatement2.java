package corejavapractice;

public class ContinueStatement2 {

	public static void main(String[] args) {

		int i = 0;

		while (i <= 5) {
			
			if (i == 3) {
				i++;
				continue;
			}
			System.out.println("i value is :" + i);
			i++;
		}

	}

}
