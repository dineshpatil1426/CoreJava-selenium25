package datadriven_fm;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;


public class ReaddataFromExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f = new  FileInputStream("/Users/macmini/Downloads/Book1.xls");
		
		Workbook wk=Workbook.getWorkbook(f);
		
		Sheet s= wk.getSheet("Sheet1");
		System.out.println(s.getCell(0, 0).getContents());
		System.out.println(s.getCell(1, 0).getContents());
		System.out.println(s.getCell(2, 0).getContents());
		System.out.println(s.getCell(3, 0).getContents());
		
		//System.out.println(s.getCell(3, 5).getContents());
		
		
		
	}

}
