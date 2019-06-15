package Package1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel_ReadData {
	
	public void excelreadLine(int n) throws BiffException, IOException{
		
		File f = new File("C:\\Users\\r.singh.panwar\\Desktop\\Excel_Try.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		int r = s.getRows();
		int c = s.getColumns();
		for(int i=0; i < r ; i++){
			if(i==n) {
			    for (int j=0;j<c;j++) {
				     Cell c1 = s.getCell(j, i);
				     System.out.print(c1.getContents() + " " );
			    }
			}
		}	
	}
		
	public static void main(String[] args)  throws BiffException, IOException, RowsExceededException, WriteException{
		
	Excel_ReadData e = new Excel_ReadData();
	Scanner  s = new Scanner(System.in);
	System.out.print("Please enter the line to be read : ");
	int n = s.nextInt();
	e.excelreadLine(n);
	}	
}