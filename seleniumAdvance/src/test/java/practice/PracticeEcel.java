package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class PracticeEcel {

	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\miraj\\OneDrive\\Desktop\\New.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheet1");
		Row row = sheet.getRow(1);
		Cell cel = row.getCell(1);
		
		
		//System.out.println(createdBy);
		//System.out.println(projectName);
		wb.close();

	}

}
