package datadriven_fm;


import java.io.FileOutputStream;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WriteRowAndColumn {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream f = new FileOutputStream("/Users/macmini/Downloads/WriteDataFromExcel.xls");
		
		WritableWorkbook wk= Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("Writesheet", 1);
		
		int a=10;
		int b=200;
		int c=(a*b);
		
		Label l = new Label(0, 1, "Total of C Value is : "+c);
		
		ws.addCell(l);
		
		wk.write();
		wk.close();

	}

}
