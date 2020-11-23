package demo_Project.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ExcelReader;
import util.ExcelWriter;

public class NewPriceRequestVendorPageTest extends TestBase{
	
	@Test(dataProvider = "dp")
	public static void testNewPriceRequest(String vendor,String payTerms,String payType,
			String ship,String month, String year,String day,String doc,
			String project,String currency,String ref) throws IOException {
		
		getUserPage().clkcompany();
		getCommerceAreaPage().clkNewPriceRequestInfo();
		getNewPriceRequestVendorPage();
		newPriceRequestVendorPage.enterVendorRef(vendor);
		newPriceRequestVendorPage.selectPaymentTerms(payTerms);
		newPriceRequestVendorPage.selectPaymentType(payType);
		newPriceRequestVendorPage.selectShippingmethod(ship);
		newPriceRequestVendorPage.clkDateImgBox();
		newPriceRequestVendorPage.selectMonth(month);
		newPriceRequestVendorPage.selectYear(year);
		newPriceRequestVendorPage.selectDate(day);
		newPriceRequestVendorPage.selectDefaultDocTemp(doc);
		newPriceRequestVendorPage.selectProject(project);
		newPriceRequestVendorPage.clkCurrencyBox();
		newPriceRequestVendorPage.clkCurrencyitem(currency);
		//newPriceRequestVendorPage.clkCreateDraftBtn();
		newPriceRequestVendorPage.clkCancelBtn();
		
//		getListOfVendorProposalRequestsPage();
//		String text =listOfVendorProposalRequestsPage.getRefNewNo();
//		ExcelWriter.excelWrite("data/NewVendorPriceRequest.xlsx", "Sheet1", text); //need to import class
//		
	//System.out.println("New Price Request Test page done ............");	
	}
	
	@DataProvider(name="dp")
	public static Object[] [] dataFeeder() throws IOException{
		String filepath = "data/NewVendorPriceRequest.xlsx";
		String sheetname = "Sheet1";
		Object[] [] t = ExcelReader.excelToObject(filepath, sheetname);
		return t;
	}

}
