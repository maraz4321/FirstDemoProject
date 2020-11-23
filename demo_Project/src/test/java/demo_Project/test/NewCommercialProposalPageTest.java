package demo_Project.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.ExcelReader;

public class NewCommercialProposalPageTest extends TestBase {

	@Test(dataProvider = "dp")
	public void testNewProposalPage(String ref, String cus, String month, String year, String date, String vd,
			String terms, String payType, String source, String avai, String ship, String dlmonth, String dlyear,
			String dlDate,String project,String currency,String n1,String n2,String data) {

		getNewCommercialProposalPage();
		newCommercialProposalPage.enterCustomerRef(ref);
		newCommercialProposalPage.selectcustomerItem(cus);
		newCommercialProposalPage.clkDateImgBox();
		newCommercialProposalPage.selectMonth(month);
		newCommercialProposalPage.selectYear(year);
		newCommercialProposalPage.selectDate(date);
		newCommercialProposalPage.enterValidatyDuration(vd);
		newCommercialProposalPage.selectPaymentTerms(terms);
		newCommercialProposalPage.selectPaymentType(payType);
		newCommercialProposalPage.selectSource(source);
		newCommercialProposalPage.selectAvailitityDely(avai);
		newCommercialProposalPage.selectShippingmethod(ship);

		newCommercialProposalPage.clkDeliveryDateImgBox();
		newCommercialProposalPage.selectDeliveryMonth(dlmonth); 
		newCommercialProposalPage.selectDeliveryYear(dlyear);
		
		newCommercialProposalPage.selectDeliveryDate(dlDate);
		newCommercialProposalPage.selectProject(project);
		newCommercialProposalPage.clkCurrencyBox();
		newCommercialProposalPage.clkCurrencyitem(currency);
		newCommercialProposalPage.writeNotePublic(n1);
		newCommercialProposalPage.writeNotePrivate(n2);
		//newCommercialProposalPage.clkCreateDraftBtn();
		
		newCommercialProposalPage.clkCancelBtn();
		
		// ... Write/update into excelfile - Ref after createDraft proposal
		
//		String text =listOfCommercialProposalPage.RefNoText();
//		ExcelWriter.excelWrite("data/NewProposal.xlsx", "Sheet3", text);
		
		//refresh the page
		driver.navigate().refresh();
		getCommerceAreaPage().clkComPropList();
		
		getListOfCommercialProposalPage();
		listOfCommercialProposalPage.enterRefNoInSearchBox(data);
		listOfCommercialProposalPage.clkRef();
		
		String expected = data;
		String actual=listOfCommercialProposalPage.RefBoxText();
		boolean result = actual.contains(expected);
		Assert.assertTrue(result);
	
	//	System.out.println("Validated New Commercial Proposal Page .........");
	}

	@DataProvider(name = "dp")
	public Object[][] datafeader() throws IOException {
		String filepath = "data/NewProposal1.xlsx";
		String sheetname = "Sheet1";

		Object[][] t = ExcelReader.excelToObject(filepath, sheetname);
		return t;
	}

}
