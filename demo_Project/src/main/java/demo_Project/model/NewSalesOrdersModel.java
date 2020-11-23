package demo_Project.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewSalesOrdersModel extends ModelBase{
	public NewSalesOrdersModel(WebDriver d) {
		super(d);
	}
	
	public WebElement getRefCustomerTextBox() {
		WebElement refBox = driver.findElement(By.xpath("//*[@name='ref_client']"));
		return refBox;
	}
	
	public WebElement getCustomerSelectBoxInfo() {
		WebElement cBoxInfo	= driver.findElement(By.xpath("//*[@id='socid']"));
		return cBoxInfo;
	}
	public WebElement getDateImgInfo() {
		WebElement dateImgInfo	= driver.findElement(By.xpath("(//*[@class='ui-datepicker-trigger'])[1]")); 
		return dateImgInfo;
	}
	public WebElement getMonthBoxInfo() {
		WebElement boxInfo = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		return boxInfo;
	}
	public WebElement getYearBoxInfo() {
		WebElement boxInfo = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		return boxInfo;
	}
	public WebElement getDateTableInfo(String xpath) {
		xpath = "//td/a[text()='"+xpath+"']";
		WebElement x = driver.findElement(By.xpath(xpath));
		return x;
	}
	public WebElement getDeliveryDateImgInfo() {
		WebElement dateImgInfo	= driver.findElement(By.xpath("(//*[@class='ui-datepicker-trigger'])[2]")); 
		return dateImgInfo;
	}
	public WebElement getDeliveryMonthBoxInfo() {
		WebElement boxInfo = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		return boxInfo;
	}
	public WebElement getDeliveryYearBoxInfo() {
		WebElement boxInfo = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		return boxInfo;
	}
	public WebElement getDeliveryDateTableInfo(String dlDate) {
		dlDate = "//td/a[text()='"+dlDate+"']";
		WebElement x = driver.findElement(By.xpath(dlDate));
		return x;
	}
	public WebElement getPaymentTermsInfo() {
		WebElement d = driver.findElement(By.xpath("//select[@id='cond_reglement_id']"));
		return d;
	}
	public WebElement getPaymentTypeInfo() {
		WebElement d = driver.findElement(By.xpath("//select[@id='selectmode_reglement_id']"));
		return d;
	}

	public WebElement getAvailabilityInfo() {
		WebElement d = driver.findElement(By.xpath("//select[@id='availability_id']"));
		return d;
	}
	public WebElement getShippingMethodInfo() {
		WebElement d = driver.findElement(By.xpath("//Select[@id='selectshipping_method_id']"));
		return d;
	}
	public WebElement getChannelInfo() { 
		WebElement d = driver.findElement(By.xpath("//select[@id='select_demand_reason_id']"));
		return d;
	}
	public WebElement getProjectInfo() {
		WebElement d = driver.findElement(By.xpath("//select[@id='projectid']"));
		return d;
	}
	
	public WebElement getCustomField1() {
		WebElement e = driver.findElement(By.xpath("//*[@id='options_custom1']"));
		return e;	
	}
	public WebElement getCurrencyBoxInfo() {
		WebElement e = driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[4]"));
		return e;
	}
	
	public WebElement getCurrencyInfo() {
		WebElement e =driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return e;
	}
	public WebElement getNoteInfo() {
	WebElement e =driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']"));
	return e;
	}
	public WebElement getCreateDraftBtn() {
		WebElement e = driver.findElement(By.xpath("//input[@class='button']"));
		return e;
	}
	
	public WebElement getCancelBtn() {
		WebElement e = driver.findElement(By.xpath("//input[@value='Cancel']"));
		return e;
	}


}
