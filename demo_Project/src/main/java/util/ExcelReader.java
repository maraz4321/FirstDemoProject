package util;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
static Sheet excelSheet;
	
	
	public static Object[][] excelToObject(String filepath, String sheetname) throws IOException{
		
		Object[][] tabarray;
	
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = new XSSFWorkbook(fis);
		excelSheet = wb.getSheet(sheetname);
		
		int totalRows = excelSheet.getPhysicalNumberOfRows();
		int totalCols = excelSheet.getRow(0).getPhysicalNumberOfCells();
		
		tabarray = new Object [totalRows-1][totalCols]; 
		for(int row = 1; row<totalRows; row++) {
		 for (int col =0; col<totalCols; col++) {

			tabarray [row-1][col]=getCellData(row,col);
			}
		
		}	
		return tabarray;
	}
	
	public static String getCellData(int row, int col) {
		Cell cell = excelSheet.getRow(row).getCell(col);
		String cellValue ="";
		if(cell.getCellType()==cell.CELL_TYPE_STRING) {
			 cellValue =cell.getStringCellValue();
		}	
		else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
			if(cell.getNumericCellValue()%1==0) {
				int cellvalue1 = (int) cell.getNumericCellValue();
				cellValue = ""+cellvalue1;
			}
			else {
				double cellValue2 = cell.getNumericCellValue();
				cellValue =""+cellValue2;
			}
		
		}
		return cellValue;
	}

}
