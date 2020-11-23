package demo_Project.test;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Common;
import util.ExcelReader;

public class ListOfSalesOrderTest extends TestBase{

	@Test(dataProvider="dp")
	public void testListOfSalesOrdersPage(String cusRef,String value,String month,String year,String date,
			String dlMonth,String dlYear,String dlDate,String terms,String type,String avai,
			String ship,String channel,String project,String customField,String currency,
			String n1,String n2,String ref) throws IOException, ParseException {
	
		getCommerceAreaPage().clkSalesOrdersList();;
		
		getListOfSalesOrdersPage();
		listOfSalesOrdersPage.enterRefNoInSearchBox(ref);
		listOfSalesOrdersPage.clkRef();
		
		
		String expectedSalesRef = ref;
		String actualSalesRef=listOfSalesOrdersPage.RefNoText();
		boolean resultSalesRef = actualSalesRef.contains(expectedSalesRef);
		Assert.assertTrue(resultSalesRef);
	
		String expectedCustomer = cusRef;
		String actualCustomer = listOfSalesOrdersPage.getRefCustomer();
		boolean resultCustomer = actualCustomer.contains(expectedCustomer);
		Assert.assertTrue(resultCustomer);
	
		String expectedThirdParty = value;
		String actualThirdParty = listOfSalesOrdersPage.getAllTextRefSalesOrdersBox();
		boolean resultThirdParty = actualThirdParty.contains(expectedThirdParty);
		Assert.assertTrue(resultThirdParty);
		
		String expectedProject = "8455748 - Project 4"; //expected is different then excel/createDraft
		String actualProjectNo = listOfSalesOrdersPage.projectNo();
		String actualProject1 = listOfSalesOrdersPage.getProject();
		String actualProject =actualProjectNo+actualProject1;
		boolean resultProject = actualProject.contains(expectedProject);
		Assert.assertTrue(resultProject, "RefBox test in fail....");
	
		String expectedDate = Common.monthToInteger(month)+"/"+date+"/"+year;
		String actualDate = listOfSalesOrdersPage.dateText();
		boolean resultDate = actualDate.contains(expectedDate);
		Assert.assertTrue(resultDate);
		
		String expectedDeliveryDate = Common.shotMonthToLongMonth(dlMonth)+" "+dlDate+", "+dlYear;
		String actualDeliveryDate = listOfSalesOrdersPage.deliveryDateText();
		boolean resultDeliveryDate = actualDeliveryDate.contains(expectedDeliveryDate);
		Assert.assertTrue(resultDeliveryDate);
		
		String expectedShipping = ship;
		String actualShipping = listOfSalesOrdersPage.shippingMethod();
		boolean resultShipping = actualShipping.contains(expectedShipping);
		Assert.assertTrue(resultShipping);
		
		String expectedPaymentTerms = terms;
		String actualPaymentTerms = listOfSalesOrdersPage.paymentTerms();
		boolean resultPaymentTerms = actualPaymentTerms.contains(expectedPaymentTerms);
		Assert.assertTrue(resultPaymentTerms);
	
		String expectedPaymentType = type;
		String actualPaymentType = listOfSalesOrdersPage.paymentType();
		boolean resultPaymentType = actualPaymentType.contains(expectedPaymentType);
		Assert.assertTrue(resultPaymentType);
		
		String expectedCurrency = "USD - US Dollars";
		String actualCurrency = listOfSalesOrdersPage.currency();
		boolean resultCurrency = actualCurrency.contains(expectedCurrency);
		Assert.assertTrue(resultCurrency);
		
		String expectedAvalidityDely = avai;
		String actualAvalidityDely = listOfSalesOrdersPage.avalidityDely();
		boolean resultAvalidityDely = actualAvalidityDely.contains(expectedAvalidityDely);
		Assert.assertTrue(resultAvalidityDely);
		
	
		
		String expectedChannel = channel;
		String actualChannel = listOfSalesOrdersPage.channel();
		boolean resultChannel = actualChannel.contains(expectedChannel);
		Assert.assertTrue(resultChannel);
		
	//System.out.println("Valideted List of Sales Order ...........");
	}
	
	@DataProvider(name="dp")
	public Object[][] dataFeeder() throws IOException{
		String filepath = "data/NewSalesOrders.xlsx";
		String sheetname="Sheet1";
		Object[][] t= ExcelReader.excelToObject(filepath, sheetname);
		return t;
	}
}
