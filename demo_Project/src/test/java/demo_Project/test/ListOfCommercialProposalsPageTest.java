package demo_Project.test;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Common;
import util.ExcelReader;

public class ListOfCommercialProposalsPageTest extends TestBase{
	//Currently run as TestNG / Only this page

	@Test(dataProvider="dp")
	public void testListOfCommercialProposalpage(String ref, String cus, String month, String year, String date, String vd,
			String terms, String payType, String source, String avai, String ship, String dlmonth, String dlyear,
			String dlDate,String project,String currency,String n1,String n2,String data) throws IOException, ParseException {
		
		
		String expectedCustomerRef = ref;
		String actualCustomerRef=listOfCommercialProposalPage.RefBoxText();
		boolean resultCustomerRef = actualCustomerRef.contains(expectedCustomerRef);
		Assert.assertTrue(resultCustomerRef);
		
		String expectedCustomer = cus;
		String actualCustomer = listOfCommercialProposalPage.RefBoxText();
		boolean resultCustomer = actualCustomer.contains(expectedCustomer);
		Assert.assertTrue(resultCustomer);
		
		String expectedProject = project;
		String actualProject = listOfCommercialProposalPage.RefBoxText();
		boolean resultProject = actualProject.contains(expectedProject);
		Assert.assertTrue(resultProject, "RefBox test in fail....");
		
		String expectedDate = Common.monthToInteger(month)+"/"+date+"/"+year;
		String actualDate = listOfCommercialProposalPage.dateText();
		boolean resultDate = actualDate.contains(expectedDate);
		Assert.assertTrue(resultDate);
		
		String expectedValidityEndingDate = listOfCommercialProposalPage.expectedValidityEndingDate(vd);
		String actualValidityEndingDate = listOfCommercialProposalPage.validityEndingDateText();		
		boolean resultValidityEndingDate = actualValidityEndingDate.contains(expectedValidityEndingDate);
		Assert.assertTrue(resultValidityEndingDate);
		
		String expectedPaymentTerms = terms;
		String actualPaymentTerms = listOfCommercialProposalPage.paymentTerms();
		boolean resultPaymentTerms = actualPaymentTerms.contains(expectedPaymentTerms);
		Assert.assertTrue(resultPaymentTerms);
	
		String expectedDeliveryDate = Common.monthToInteger(dlmonth)+"/"+dlDate+"/"+dlyear;
		String actualDeliveryDate = listOfCommercialProposalPage.deliveryDateText();
		boolean resultDeliveryDate = actualDeliveryDate.contains(expectedDeliveryDate);
		Assert.assertTrue(resultDeliveryDate);
		
		String expectedValidityDely = avai;
		String actualValidityDely = listOfCommercialProposalPage.validityDely();
		boolean resultValidityDely = actualValidityDely.contains(expectedValidityDely);
		Assert.assertTrue(resultValidityDely);
		
		String expectedShipping = ship;
		String actualShipping = listOfCommercialProposalPage.shippingMethod();
		boolean resultShipping = actualShipping.contains(expectedShipping);
		Assert.assertTrue(resultShipping);
		
		String expectedSource = source;
		String actualSource = listOfCommercialProposalPage.source();
		boolean resultSource = actualSource.contains(expectedSource);
		Assert.assertTrue(resultSource);
		
		String expectedPaymentType = payType;
		String actualPaymentType = listOfCommercialProposalPage.paymentType();
		boolean resultPaymentType = actualPaymentType.contains(expectedPaymentType);
		Assert.assertTrue(resultPaymentType);
		
		String expectedCurrency = "USD - US Dollars";
		String actualCurrency = listOfCommercialProposalPage.currency();
		boolean resultCurrency = actualCurrency.contains(expectedCurrency);
		Assert.assertTrue(resultCurrency);

	//	System.out.println("Validated List of Commercial Propasal .............");
	}
	
	@DataProvider(name="dp")
	public Object[][] datafeeder() throws IOException{
		String filepath="data/NewProposal1.xlsx";
		String sheetname="Sheet3";
		
		Object[][] t = ExcelReader.excelToObject(filepath, sheetname);
		return t;
	}

}
