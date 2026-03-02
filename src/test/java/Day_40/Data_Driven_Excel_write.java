package Day_40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Excel_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file=new FileOutputStream("C:\\Automation25\\myfile.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook();
		
		XSSFSheet sheet= workbook.createSheet("Data");
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Course");
		row1.createCell(1).setCellValue("Date");
		row1.createCell(2).setCellValue("amount");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Selenium");
		row2.createCell(1).setCellValue("09-09-25");
		row2.createCell(2).setCellValue("15000");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");
	}

}
