package Day_40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DD_Excel_write_dynamically {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos=new FileOutputStream("C:\\Automation25\\myfile_dynamic1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("DynamicData1");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many rows");
		int row_count=sc.nextInt();
		
		System.out.println("Enter how many cells");
		int cell_count=sc.nextInt();
		
		for(int r=0;r<=row_count;r++) {
			
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<cell_count;c++) {
				XSSFCell cell=row.createCell(c);
				cell.setCellValue(sc.next());  // added only sc.next coz we might add any 
				//datatype like int,string,date so default we use next() , instead nextInt().
				
				
			}
		}
		
		workbook.write(fos);
		workbook.close();
		fos.close();
		//sc.close();
		System.out.println("File is created ......");
	}

}
