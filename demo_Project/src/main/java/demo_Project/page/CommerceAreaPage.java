package demo_Project.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo_Project.model.CommerceAreaModel;

public class CommerceAreaPage extends CommerceAreaModel {
	
	public CommerceAreaPage(WebDriver d) {
		super(d);
	}
	
	public String getCommerceAreaText() {
		
		WebElement e = getCommerceAreaTitleInfo();
		String context = e.getText();
		return context;
	}
	public void clkNewProposal() {
		WebElement e = getNewProposalInfo();
		e.click();
	}
	public void clkComPropList() {
		WebElement e = getComPropListInfo();
		e.click();
	}
	public void clkNewSalesOrders() {
		WebElement e = getNewSalesOrderInfo();
		e.click();
	}
	public void clkSalesOrdersList() {
		WebElement e = getSalesOrderListInfo();
		e.click();
	}
	public void clkNewPriceRequestInfo () {
		WebElement e = getNewPriceRequestInfo();
		e.click();
	}
	public void clkListOfVendorProposalsRequest () {
		WebElement e =getVendorPriceReuestListInfo();
		e.click();
	}
}
