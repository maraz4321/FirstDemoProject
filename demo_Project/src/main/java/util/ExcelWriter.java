package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
	
	public static void excelWrite(String filePath,String sheetName,String data) throws IOException {

			FileInputStream fis = new FileInputStream(filePath);
		
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet(sheetName);
			int r = sh.getLastRowNum();
			int c = sh.getRow(0).getPhysicalNumberOfCells();
			
			Cell cell =sh.getRow(r).getCell(c-1);
			cell.setCellValue(data);
			
			fis.close();
			FileOutputStream fos = new FileOutputStream(filePath);
					
			wb.write(fos);
			wb.close();
			fos.close();
	}

}


