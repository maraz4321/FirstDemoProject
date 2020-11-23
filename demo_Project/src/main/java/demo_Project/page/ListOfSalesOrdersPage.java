package demo_Project.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo_Project.model.ListOfSalesOrdersModel;

public class ListOfSalesOrdersPage extends ListOfSalesOrdersModel{
	
	public ListOfSalesOrdersPage(WebDriver d) {
		super(d);
	}

	public void enterRefNoInSearchBox(String ref) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		WebElement e = getRefSearchBox();
		e.sendKeys(ref);
		e.sendKeys(Keys.RETURN);
	}
	public void clkRef() {
		WebElement r = getRefIngo();
		r.click();
	}
	public String getAllTextRefSalesOrdersBox() {
		WebElement e = getSalesRefBoxInfo();
		String t=e.getText();
		return t;
	}
	public String RefNoText() {
		WebElement e = getSalesRefBoxInfo();
		String s = e.getText();
		String[] line = s.split("\n");
		String refNo =line[0];
		refNo=refNo.replace("(", "");
		refNo=refNo.replace(")", "");
		return refNo;	
	}
	public String getRefCustomer() {
		Object e = refCustomer();
		String i =e.toString();
		i=i.replaceFirst(":", "");
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
	public String dateText() {
		WebElement d = getDateInfo();
		String date=d.getText();
		return date;
	}
	public String deliveryDateText() {
		WebElement d = getDeliveryDateInfo();
		String date=d.getText();
		return date;
	}
	public String shippingMethod() {
		WebElement d = getShippingMethodInfo();
		String m=d.getText();
		return m;
	}
	public String paymentTerms() {
		WebElement d = getPaymentTermsInfo();
		String payt=d.getText();
		return payt;
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
	public String avalidityDely() {
		WebElement d = getAvalidityDely();
		String payt=d.getText();
		return payt;
	}
	public String channel() {
		WebElement d = getChannelInfo();
		String sr=d.getText();
		return sr;
	}
	public void clkNotesTab() {
		WebElement notes = getNotesTabInfo();
		notes.click();
	}
}
