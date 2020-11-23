package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, ParseException {
//		String s = new String("(Welcome) -to new -class of -javaselenium");
//		String[] line = s.split("-");
//		String r1 =line[0];
//		r1=r1.replace("(", "");
//		r1=r1.replace(")", "");
//		System.out.println(r1);
//		
//		String filePath="data/Practice.xlsx";
//		String sheetName="Sheet1";
//		FileInputStream fis = new FileInputStream(filePath);
//	
//		Workbook wb = new XSSFWorkbook(fis);
//		Sheet sh = wb.getSheet(sheetName);
//		int r = sh.getLastRowNum();
//		int c = sh.getRow(0).getLastCellNum();
//		
//		
//		Cell cell =sh.getRow(r).getCell(c-1);
//		cell.setCellValue(r1);
//		
//		fis.close();
//		FileOutputStream fos = new FileOutputStream(filePath);
//				
//		wb.write(fos);
//		wb.close();
//		fos.close();
//		
//		// Given Date in String format
//		String oldDate = "01/29/2019";
//		System.out.println("Date before Addition: " + oldDate);
//		// Specifying date format that matches the given date
//		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//		Calendar c = Calendar.getInstance();
//		// Setting the date to the given date
//		c.setTime(sdf.parse(oldDate));
//
//		// Number of Days to add
//		c.add(Calendar.DAY_OF_MONTH, 10);
//		// Date after adding the days to the given date
//		String newDate = sdf.format(c.getTime());
//		// Displaying the new Date after addition of Days
//		System.out.println("Date after Addition: " + newDate);
//		
//		Common.addDateTocurrentDate("10/30/2009", 5);
//
//		System.setProperty("webdriver.chrome.driver", "driver/ChromeDriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://demo.dolibarr.org/comm/propal/card.php?id=789&save_lastsearch_values=1");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//			WebElement note = driver.findElement(By.xpath("//a[@id='note']"));
//			note.click();
//			By locator = By.xpath("(//div[@class='tagtd table-val-border-col sensiblehtmlcontent'])[1]");
//			//WebDriverWait wait = new WebDriverWait(driver, 5);
//			By locator1 = By.xpath("(//div[@class='tagtd table-val-border-col sensiblehtmlcontent'])[2]");
//			//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//			WebElement n = driver.findElement(locator);
//			String nPl = n.getText();
//			System.out.println(nPl);
//			WebElement n1 = driver.findElement(locator1);
//			String nPr = n1.getText();
//			System.out.println(nPr);
	
		shotMonthToLongMonth("Nov");
	  
		}
	public static String shotMonthToLongMonth(String oldMonth) throws ParseException {
		
		String newMonth;
		SimpleDateFormat sd = new SimpleDateFormat("MMM");
		Date d =sd.parse(oldMonth);
		sd.applyPattern("MMMM");
		newMonth = sd.format(d);
		
		System.out.println(newMonth);
		
		return newMonth;
	}
}
	