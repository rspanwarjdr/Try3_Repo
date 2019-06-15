package Package1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel_Read {
	
	public void excelread() throws BiffException, IOException{
		
		File f = new File("C:\\Users\\r.singh.panwar\\Desktop\\Excel_Try.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		int r = s.getRows();
		int c = s.getColumns();
		for(int i=0; i < r ; i++){
			for (int j=0;j<c;j++) {
				Cell c1 = s.getCell(j, i);
				System.out.println(c1.getContents());
			}
		}	
	}
	
	
public void excelwrite() throws BiffException, IOException, RowsExceededException, WriteException{
		
		File f = new File("C:\\Users\\r.singh.panwar\\Desktop\\Excel_Try1.xls");
		WritableWorkbook ww = Workbook.createWorkbook(f);
		WritableSheet ws = ww.createSheet("Sheet1", 0);
		for(int r=0; r < 3 ; r++){
			for (int j=0;j<3;j++) {
		      Label l = new Label(j,r,"Expert");
		      ws.addCell(l);
			}
		}	
		ww.write();
		ww.close();
		System.out.println("File Write Successful!");
	}
	public static void main(String[] args)  throws BiffException, IOException, RowsExceededException, WriteException{
		
	Excel_Read e = new Excel_Read();
	e.excelread();
	e.excelwrite();
	
   }	
}
