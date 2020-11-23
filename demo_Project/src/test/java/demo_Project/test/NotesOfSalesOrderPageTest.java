package demo_Project.test;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ExcelReader;

public class NotesOfSalesOrderPageTest extends TestBase{
	
	@Test(dataProvider="dp")
	public void testNotesOfSalesOrdersPage(String cusRef,String value,String month,String year,String date,
			String dlMonth,String dlYear,String dlDate,String terms,String type,String avai,
			String ship,String channel,String project,String customField,String currency,
			String n1,String n2,String ref) throws IOException, ParseException {
	

		getListOfSalesOrdersPage();
		listOfSalesOrdersPage.clkNotesTab();
		
		getNotesOfSalesOrderPage();
		String expectedPublicNote = n1;
		String actualPublicNote = notesOfSalesOrderPage.notePublicText();
		boolean resultPublicNote = actualPublicNote.contains(expectedPublicNote);
		Assert.assertTrue(resultPublicNote);
		
		String expectedNotePrivate = n2;
		String actualNotePrivate = notesOfSalesOrderPage.notePrivateText();
		boolean resultPrivateNote = actualNotePrivate.contains(expectedNotePrivate);
		Assert.assertTrue(resultPrivateNote);
		
		
		//System.out.println("Velidated Sale Notes ........");
	}
	
	@DataProvider(name="dp")
	public Object[][] dataFeeder() throws IOException{
		String filepath = "data/NewSalesOrders.xlsx";
		String sheetname="Sheet1";
		Object[][] t= ExcelReader.excelToObject(filepath, sheetname);
		return t;
	}

}
