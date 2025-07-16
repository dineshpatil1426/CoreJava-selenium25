package datadriven_fm;

import java.io.BufferedReader;
import java.io.FileReader;

public class MultiLineFromNotePad {

	public static void main(String[] args) throws Exception {
		
		FileReader f = new FileReader("/Users/macmini/Downloads/notepad.txt");
		
		BufferedReader b = new BufferedReader(f);

		String s;
		
		while((s=b.readLine())!=null) {
			
			System.out.println(s);
		}
		

	}

}
