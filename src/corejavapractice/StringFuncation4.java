package corejavapractice;

public class StringFuncation4 {

	public static void main(String[] args) {

		/*
		 * 
		 * String str = "GeeksForGeeks";
		 * 
		 * int index = 5;
		 * 
		 * char ch = str.charAt(index);
		 * 
		 * System.out.println("Character from " + str + " at index " + index + " is " +
		 * ch);
		 * 
		 * System.out.println("********************Pro2**************************");
		 * 
		 * String str1 = "Geeks Gor Geeks";
		 * 
		 * int index1 = 6;
		 * 
		 * char ch1 = 'F';
		 * 
		 * System.out.println("Original String = " + str1);
		 * 
		 * str1 = str1.substring(0, index1) + ch1 + str1.substring(index1 + 1);
		 * 
		 * System.out.println("Modified String = " + str1);
		 * 
		 * System.out.println("********************Pro3**************************");
		 * 
		 * String s = "Dinesh"; String r = ""; char ch2;
		 * 
		 * for (int i =0; i <s.length(); i++) {
		 * 
		 * ch2 = s.charAt(i);
		 * 
		 * r = ch2 + r;
		 * 
		 * } System.out.println(r);
		 * 
		 */

		System.out.println(5 + "\n" + 13 + " " + 21 + "\n");
		System.out.println(8 + "\n" + 15);
		System.out.println(1 + " " + 2 + " " + 3 + " " + 4 + " " + 5);
		System.out.println("1 2 3 4 5");
		System.out.println("I"+"\n"+"love"+"\n"+"codeChef");
		
		for(int i=1;i<=5;i++){
		
			System.out.println(i +"-" +i*i);
			
		}
		
		int x = 20;
        int y = 6;
        System.out.println("Divide x by y : "+ x/y);
        
        float temperature =25.5f;
        float Celsius =temperature;
        float Kelvin =273f;
        
        System.out.println("Celsius-"+Celsius);
        System.out.println("Kelvin-"+(Celsius+Kelvin));
        

	}

}
