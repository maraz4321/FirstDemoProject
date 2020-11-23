package demo_Project.page;

import java.text.ParseException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo_Project.model.ListOfVendorProposalRequestsModel;

public class ListOfVendorProposalRequestsPage extends ListOfVendorProposalRequestsModel{
	public ListOfVendorProposalRequestsPage(WebDriver d) {
		super(d);
	}

	public void enterRefNoInSearchBox(String ref) {
		WebElement e = getRefSearchBox();
		e.sendKeys(ref);
		e.sendKeys(Keys.RETURN);
	}
	public void clkRefItem() {
		WebElement r = getRefItemBox();
		r.click();
	}
	public void clkRef() {
		WebElement r = getRefIngo();
		r.click();
	}
	public String getRefNewNo() {
		Object e = getRefNoInfo();
		String refNo =e.toString();
		refNo=refNo.replace("(", "");
		refNo=refNo.replace(")", "");
		//System.out.println(refNo);
		return refNo;	
	}
	public String getRefCustomer() { //not used
		Object e = refCustomer();
		String i =e.toString();
		System.out.println(i);
		return i;
	}
	
	public String thirdParty() {
		WebElement e = getThirdPartyInfo();
		String s = e.getText();
		return s;
	}
	public String projectNo() {
		WebElement e = getProjectNoInfo();
		String s = e.getText();
		return s;
	}
	public String getProject() {
		Object e = getProjectInfo();
		String i =e.toString();
		return i;
	}
	public String paymentTerms(String payTerms) {
		WebElement d = getPaymentTermsInfo(payTerms);
		String payt=d.getText();
		return payt;
	}

	public String deliveryDateText(String month,String day,String year) throws ParseException {
		WebElement d = getDeliveryDateInfo(month, day, year);
		String date=d.getText();
		return date;
	}


	public String paymentType(String payType) {
		WebElement d = getPaymentTypeInfo(payType);
		String pay=d.getText();
		return pay;
	}
	public String currency() {
		WebElement d = getCurrencyInfo();
		String payt=d.getText();
		return payt;
	}


	public void clkNotesTab() {
		WebElement notes = getNotesTabInfo();
		notes.click();
	}

}
