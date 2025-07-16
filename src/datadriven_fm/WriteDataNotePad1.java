package datadriven_fm;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class WriteDataNotePad1 {

	public static void main(String[] args) throws Exception {
		
		
		FileWriter fw= new FileWriter("/Users/macmini/Downloads/output.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("Hi I am dinesh Patil");
		bw.close();
		

	}

}
