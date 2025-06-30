package corejavapractice;

public class ParseKeysword {

	public static void main(String[] args) {

		String s = "200";

		int i = Integer.parseInt(s);
		double d = Double.parseDouble(s);
		float f = Float.parseFloat(s);

		System.out.println("Only String Value: " + s);
		System.out.println("String and integer Value: "+ (s + 100));
		System.out.println("Convert Integer Value: " + (i + 100));
		System.out.println("Convert Double Value:"  +(d + 100));
		System.out.println("Convert Float Value:" + (f + 100));

	}

}
