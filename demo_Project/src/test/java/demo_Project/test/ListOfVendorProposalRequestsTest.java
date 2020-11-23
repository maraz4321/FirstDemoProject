package demo_Project.test;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Common;
import util.ExcelReader;

public class ListOfVendorProposalRequestsTest extends TestBase{
	
	
	@Test(dataProvider = "dp")
	public static void testListOfVendorProposalRequestPage(String vendor,String payTerms,String payType,
			String ship,String month, String year,String day,String doc,
			String project,String currency,String ref) throws IOException, ParseException {

		getCommerceAreaPage().clkListOfVendorProposalsRequest();

		getListOfVendorProposalRequestsPage();
		listOfVendorProposalRequestsPage.enterRefNoInSearchBox(ref);
		listOfVendorProposalRequestsPage.clkRefItem();
		
		String expectedRef = ref;
		String actualRef = listOfVendorProposalRequestsPage.getRefNewNo();
		boolean resultRef = actualRef.contains(expectedRef);
		Assert.assertTrue(resultRef);
		
		String expectedThirdParty = vendor;
		String actualThirdParty = listOfVendorProposalRequestsPage.thirdParty();
		boolean resultThirdParty = actualThirdParty.contains(expectedThirdParty);
		Assert.assertTrue(resultThirdParty);
		
		String expectedProject ="PJ2010-7634 - BILLY"; //project =PJ2010-7634, BILLY
		String actualProjectNo = listOfVendorProposalRequestsPage.projectNo();
		String actualProject =listOfVendorProposalRequestsPage.getProject();
		String actualProjectNoAndProject = (actualProjectNo+actualProject);
		boolean resultProject1 = actualProjectNoAndProject.contains(expectedProject);
		Assert.assertTrue(resultProject1);
		
		String expectedPayTerms =payTerms;
		String actualPayTerms = listOfVendorProposalRequestsPage.paymentTerms(payTerms);
		boolean resultPayTerms = actualPayTerms.contains(expectedPayTerms);
		Assert.assertTrue(resultPayTerms);
		
		String expectedDeliveryDate = Common.shotMonthToLongMonth(month)+" "+day+", "+year;
		String actualDeliveryDate = listOfVendorProposalRequestsPage.deliveryDateText(month, day, year);
		boolean resultDeliveryDate = actualDeliveryDate.contains(expectedDeliveryDate);
		Assert.assertTrue(resultDeliveryDate);

		
		String expectedPayType =payType;
		String actualPayType = listOfVendorProposalRequestsPage.paymentType(payType);
		boolean resultPayType = actualPayType.contains(expectedPayType);
		Assert.assertTrue(resultPayType);
				



		String expectedCurrency ="EUR - Euros";  
		String actualCurrency = listOfVendorProposalRequestsPage.currency();
		boolean resultCurrency = actualCurrency.contains(expectedCurrency);
		Assert.assertTrue(resultCurrency);
		

		
	//System.out.println("Validated List Of Vendor  Proposal Request Test  ............");	
	}
	
	@DataProvider(name="dp")
	public static Object[] [] dataFeeder() throws IOException{
		String filepath = "data/NewVendorPriceRequest.xlsx";
		String sheetname = "Sheet1";
		Object[] [] t = ExcelReader.excelToObject(filepath, sheetname);
		return t;
	}

}
