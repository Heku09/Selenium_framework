package Day_40;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DD_Excel_Read_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// Step 1: Open the existing file (READ)
		FileInputStream fis =new FileInputStream("C:\\Automation25\\myfile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
        // Step 2: Select sheet
		XSSFSheet sheet=workbook.getSheet("Data");
		
        // Step 3: Modify or add new data
		XSSFRow row=sheet.createRow(2);
		row.createCell(0).setCellValue("Java");
		row.createCell(1).setCellValue("01-01-25");
		row.createCell(2).setCellValue("25000");
		
        // Close input stream after reading
		fis.close();
		
        // Step 4: Write changes back to the file (WRITE)
		FileOutputStream fos=new FileOutputStream("C:\\Automation25\\myfile.xlsx");
		workbook.write(fos);

        // Step 5: Close resources
		workbook.close();
		fos.close();
		
		System.out.println("Excell is read and opened and updated");
	}

}
