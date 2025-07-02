package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataDrivenTesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\miraj\\OneDrive\\Desktop\\Data\\ExcelDataDrivenTestingE.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		Row row = sh.getRow(1);
		
		String data = row.getCell(3).getStringCellValue();
		
		System.out.println(data);
		
		wb.close();
	}

}
