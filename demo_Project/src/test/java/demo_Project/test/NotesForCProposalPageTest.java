package demo_Project.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ExcelReader;

public class NotesForCProposalPageTest extends TestBase{
	
	@Test(dataProvider = "dp")
	public void testForNotesOfCProposalpage(String ref, String cus, String month, String year, String date, String vd,
			String terms, String payType, String source, String avai, String ship, String dlmonth, String dlyear,
			String dlDate,String project,String currency,String n1,String n2,String data) {
		
		getListOfCommercialProposalPage();
		listOfCommercialProposalPage.clkNotesTab();
		
		getNotesForCProposalPage();
		String expectedPublicNote = n1;
		String actualPublicNote = notesForCProposalPage.notePublicText();
		boolean resultPublicNote = actualPublicNote.contains(expectedPublicNote);
		Assert.assertTrue(resultPublicNote);
		
		String expectedNotePrivate = n2;
		String actualNotePrivate = notesForCProposalPage.notePrivateText();
		boolean resultPrivateNote = actualNotePrivate.contains(expectedNotePrivate);
		Assert.assertTrue(resultPrivateNote);
		
	//	System.out.println("Validated of notes of Commercial Proposal ..........");
}
	
	@DataProvider(name = "dp")
	
	public Object[][] dataFeeder () throws IOException{
		
		String filePath = "data/NewProposal.xlsx";
		String sheetName = "Sheet3";
		
		Object[][] t = ExcelReader.excelToObject(filePath, sheetName);
		return t;
	}
}
