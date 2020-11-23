package demo_Project.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewPriceRequestVendorModel extends ModelBase{
	public NewPriceRequestVendorModel(WebDriver d) {
		super(d);
	}
	
	public WebElement getVendorSelectBoxInfo() {
		WebElement cBoxInfo	= driver.findElement(By.xpath("//*[@id='socid']"));
		return cBoxInfo;
	}
	public WebElement getPaymentTermsInfo() {
		WebElement d = driver.findElement(By.xpath("//select[@id='cond_reglement_id']"));
		return d;
	}
	public WebElement getPaymentTypeInfo() {
		WebElement d = driver.findElement(By.xpath("//select[@id='selectmode_reglement_id']"));
		return d;
	}
	public WebElement getShippingMethodInfo() {
		WebElement d = driver.findElement(By.xpath("//Select[@id='selectshipping_method_id']"));
		return d;
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

	public WebElement getDefaultDocTempInfo() { 
		WebElement d = driver.findElement(By.xpath("//select[@id='model']"));
		return d;
	}
	public WebElement getProjectInfo() {
		WebElement d = driver.findElement(By.xpath("//select[@id='projectid']"));
		return d;
	}
	public WebElement getCurrencyBoxInfo() {
		WebElement e = driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[4]"));
		return e;
	}
	public WebElement getCurrencyInfo() {
		WebElement e =driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return e;
	}
	public WebElement getCreateDraftBtn() {
		WebElement e = driver.findElement(By.xpath("//input[@value='Create draft']"));
		return e;
	}
	
	public WebElement getCancelBtn() {
		WebElement e = driver.findElement(By.xpath("//input[@value='Cancel']"));
		return e;
	}



}
