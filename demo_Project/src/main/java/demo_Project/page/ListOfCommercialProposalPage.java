package demo_Project.page;

import java.text.ParseException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo_Project.model.ListOfCommercialProposalModel;
import util.Common;

public class ListOfCommercialProposalPage extends ListOfCommercialProposalModel {
	public ListOfCommercialProposalPage(WebDriver d) {
		super(d);
	}
	public void enterRefNoInSearchBox(String data) {
		WebElement e = getRefSearchBox();
		e.sendKeys(data);
		e.sendKeys(Keys.RETURN);
	}
	public void enterCustomerRefSearch(String ref) {
		WebElement e = getRefCustomerSearchBoxInfo();
		e.sendKeys(ref);
		e.sendKeys(Keys.RETURN);
	}
	public String RefCustomerTextInfo() {
		WebElement e = getRefCustomerInfo();
		String refNo = e.getText();
		return refNo;
	}
	public void clkRef() {
		WebElement r = getRefIngo();
		r.click();
	}
	public String RefBoxText() {
		WebElement e = getRefNumber();
		String t=e.getText();
		return t;
	}
	
	public String RefNoText() {
		WebElement e = getRefNumber();
		String s = e.getText();
		String[] line = s.split("\n");
		String refNo =line[0];
		refNo=refNo.replace("(", "");
		refNo=refNo.replace(")", "");
		System.out.println(refNo);
		return refNo;	
	}
	
	public String dateText() {
		WebElement d = getDateInfo();
		String date=d.getText();
		return date;
	}
	public String validityEndingDateText() {
		WebElement d = getValidityEndingDateInfo();
		String date=d.getText();
		return date;
		
	}
	public String expectedValidityEndingDate(String vd) throws ParseException {
		String currentDate = dateText();
		int addDate = Integer.parseInt(vd); 
		String newDate = Common.addDateTocurrentDate(currentDate, addDate);
		return newDate;
	}
	public String paymentTerms() {
		WebElement d = getPaymentTermsInfo();
		String payt=d.getText();
		return payt;
	}
	public String deliveryDateText() {
		WebElement d = getDeliveryDateInfo();
		String date=d.getText();
		return date;
	}
	public String validityDely() {
		WebElement d = getValidityDely();
		String payt=d.getText();
		return payt;
	}
	public String shippingMethod() {
		WebElement d = getShippingMethodInfo();
		String m=d.getText();
		return m;
	}
	public String source() {
		WebElement d = getSourceInfo();
		String sr=d.getText();
		return sr;
	}
	public String paymentType() {
		WebElement d = getPaymentTypeInfo();
		String pay=d.getText();
		return pay;
	}
	public String currency() {
		WebElement d = getCurrencyInfo();
		String payt=d.getText();
		return payt;
	}
	public void clkNotesTab() {
		WebElement notes = getNotesInfo();
		notes.click();
	}

}
