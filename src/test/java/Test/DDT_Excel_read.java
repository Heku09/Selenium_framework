package Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDT_Excel_read {
	public static void main(String[] args) throws IOException {
		

	
	FileInputStream excel_file=new FileInputStream("C:\\Automation25\\Automation_datadriven.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(excel_file);
	
	XSSFSheet sheet=wb.getSheet("Sheet1");
	
	int row_num=sheet.getLastRowNum();
	int cell_num=sheet.getRow(1).getLastCellNum();
	
	for (int r=0;r<row_num;r++) {
		XSSFRow current_row=sheet.getRow(r);
	
	for (int c=0;c<cell_num;c++) {
		XSSFCell cell=current_row.getCell(c);
		System.out.print(cell.toString()+"\t");
	}
	System.out.println("");
	}
	wb.close();
	excel_file.close();
	
	}

}
