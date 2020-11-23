package demo_Project.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ExcelReader;

public class NewSalesOrdersPageTest extends TestBase{
	
	@Test(dataProvider="dp")
	public void testNewSalesOrdersPage(String cusRef,String value,String month,String year,String date,
			String dlMonth,String dlYear,String dlDate,String terms,String type,String avai,
			String ship,String channel,String project,String customField,String currency,
			String n1,String n2,String ref) throws IOException {
		
		getCommerceAreaPage().clkNewSalesOrders();
		
		getNewSalesOrdersPage();
		newSalesOrdersPage.enterCustomerRef(cusRef);
		newSalesOrdersPage.selectcustomerItem(value);
		newSalesOrdersPage.clkDateImgBox();
		newSalesOrdersPage.selectMonth(month);
		newSalesOrdersPage.selectYear(year);
		newSalesOrdersPage.selectDate(date);
		newSalesOrdersPage.clkDeliveryDateImgBox();
		newSalesOrdersPage.selectDeliveryMonth(dlMonth);
		newSalesOrdersPage.selectDeliveryYear(dlYear);
		newSalesOrdersPage.selectDeliveryDate(dlDate);
		newSalesOrdersPage.selectPaymentTerms(terms);
		newSalesOrdersPage.selectPaymentType(type);
		newSalesOrdersPage.selectAvailitityDely(avai);
		newSalesOrdersPage.selectShippingmethod(ship);
		newSalesOrdersPage.selectChannel(channel);
		newSalesOrdersPage.selectProject(project);
		newSalesOrdersPage.clkCurrencyBox();
		newSalesOrdersPage.clkCurrencyitem(currency);
		newSalesOrdersPage.writeNotePublic(n1);
		newSalesOrdersPage.writeNotePrivate(n2);
		//newSalesOrdersPage.clkCreateDraftBtn();
		newSalesOrdersPage.clkCancelBtn();
		
		// ... Write/update into excelfile - Ref after createDraft order
//		getListOfSalesOrdersPage();
//		String text =listOfSalesOrdersPage.RefNoText();
//		ExcelWriter.excelWrite("data/NewSalesOrders.xlsx", "Sheet1", text); //need to import class
	
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	System.out.println("New Sales Order.............");
		
	}
	
	@DataProvider(name="dp")
	public Object[][] dataFeeder() throws IOException{
		String filepath = "data/NewSalesOrders.xlsx";
		String sheetname="Sheet1";
		Object[][] t= ExcelReader.excelToObject(filepath, sheetname);
		return t;
	}
}
