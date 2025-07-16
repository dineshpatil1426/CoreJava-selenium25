package datadriven_fm;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class WriteMultipleNotePad2 {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw= new FileWriter("/Users/macmini/Downloads/output1.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("Selenium data Driven testing ");
		bw.newLine();
		bw.write("Hi I am Dinesh Patil");
		bw.newLine();
		bw.write("QA Automation Engineer");
		bw.close();
		

	}

}
