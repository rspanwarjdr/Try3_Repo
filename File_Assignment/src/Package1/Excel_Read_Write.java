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

public class Excel_Read_Write {
	
	public void excelreadwrite() throws BiffException, IOException, RowsExceededException, WriteException{
		
		File f = new File("C:\\Users\\r.singh.panwar\\Desktop\\Excel_Try.xls");
		Workbook w = Workbook.getWorkbook(f);
		
		File f1 = new File("C:\\Users\\r.singh.panwar\\Desktop\\Excel_Try1.xls");
		WritableWorkbook ww = Workbook.createWorkbook(f1);
		WritableSheet ws = ww.createSheet("Sheet1", 0);
		Sheet s = w.getSheet(0);
		int r = s.getRows();
		int c = s.getColumns();
		for(int i=0; i<r ;i++){
			for (int j=0;j<c;j++) {
				Cell c1 = s.getCell(j, i);
				Label l = new Label(j,i,c1.getContents());
			    ws.addCell(l);
			}
		}
		ww.write();
		ww.close();
	}
		
    public static void main(String[] args)  throws BiffException, IOException, RowsExceededException, WriteException{
		
	Excel_Read_Write e = new Excel_Read_Write();
	e.excelreadwrite();
	
    }	
}
