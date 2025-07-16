package datadriven_fm;


import java.io.BufferedReader;
import java.io.FileReader;

public class ReadDataFromNotePad {

	public static void main(String[] args) throws Exception {
		
		FileReader f = new FileReader("/Users/macmini/Downloads/notepad.txt");
		
		BufferedReader b = new BufferedReader(f);
		System.out.println(b.readLine());
	}

}
