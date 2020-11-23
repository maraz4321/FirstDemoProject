package demo_Project.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListOfCommercialProposalModel extends ModelBase{
	public ListOfCommercialProposalModel(WebDriver d) {
		super(d);
	}
	
	public WebElement getRefSearchBox() {
		WebElement ref = driver.findElement(By.xpath("(//input[@class='flat maxwidth50'])[1]"));
		return ref;
	}
	public WebElement getRefCustomerSearchBoxInfo() { //not use now -  second search box
		WebElement ref = driver.findElement(By.xpath("(//input[@class='flat maxwidth50'])[2]"));
		return ref;
	}
	
	public WebElement getRefCustomerInfo() { //not use now -  second cell from result 
		WebElement ref = driver.findElement(By.xpath("(//td[@class='nowrap tdoverflowmax200'])[1]"));
		return ref;	
	}
	public WebElement getRefIngo() {
		WebElement r = driver.findElement(By.xpath("(//*[@class='nobordernopadding nowraponall'])[1]"));
		return r;
	}
	public WebElement getRefNumber() {
		WebElement rn= driver.findElement(By.xpath("//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']"));
		return rn;
	}
	public WebElement getDateInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='10/15/2018']"));
		return d;
	}
	public WebElement getValidityEndingDateInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='10/25/2018']"));
		return d;
	}
	public WebElement getPaymentTermsInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='60 days']"));
		return d;
	}
	public WebElement getDeliveryDateInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='10/20/2020']"));
		return d;
	}
	public WebElement getValidityDely() {
		WebElement rn= driver.findElement(By.xpath("//td[text()='1 week']"));
		return rn;
	}
	public WebElement getShippingMethodInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='Transporter']"));
		return d;
	}
	public WebElement getSourceInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='Commercial contact']"));
		return d;
	}
	public WebElement getPaymentTypeInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='Credit card']"));
		return d;
	}
	public WebElement getCurrencyInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='USD - US Dollars']"));
		return d;
	}
	public WebElement getNotesInfo() {
		WebElement note = driver.findElement(By.xpath("//a[@id='note']"));
		return note;
	}
}
