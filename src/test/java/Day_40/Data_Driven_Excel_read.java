package Day_40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Excel_read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream excel_file = new FileInputStream("C:\\Automation25\\Automation_datadriven.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(excel_file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int row_num=sheet.getLastRowNum();
		int cell_num=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of rows " + row_num);
		System.out.println("Number of cells "+ cell_num );
		
		for (int r=0;r<=row_num;r++) {
			
			XSSFRow current_row=sheet.getRow(r);
			
			for(int c=0;c<cell_num;c++) {
				
				
				XSSFCell cell=current_row.getCell(c);   
				System.out.print(cell.toString()+"\t");  // toString() converts whatever is inside the cell into a String format.
			}
			
			System.out.println();
		}
		
		workbook.close();
		excel_file.close();

	}

}
