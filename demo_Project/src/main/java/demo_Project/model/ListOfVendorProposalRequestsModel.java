package demo_Project.model;

import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Common;

public class ListOfVendorProposalRequestsModel extends ModelBase{
	public ListOfVendorProposalRequestsModel(WebDriver d) {
		super(d);
	}

	public WebElement getRefSearchBox() {
		WebElement ref = driver.findElement(By.xpath("//input[@name='search_ref']"));
		return ref;
	}
	public WebElement getRefItemBox() {
		WebElement ref = driver.findElement(By.xpath("//a[@class='classfortooltip']"));
		return ref;
	}
	public WebElement getRefIngo() {
		WebElement r = driver.findElement(By.xpath("(//*[@class='nowraponall'])[1]"));
		return r;
	}
	public Object getRefNoInfo() {
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		Object load= js.executeScript("var value = document.evaluate(\"//div[@class='inline-block floatleft']/following::text()[1]\",document, null, XPathResult.STRING_TYPE, null ); return value.stringValue;"); 
		return load;
	}
	public Object refCustomer() { // not use or thirdParty used
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		Object load= js.executeScript("var value = document.evaluate(\"//div[@class='refidno']/a[1]/span/following::text()[1]\",document, null, XPathResult.STRING_TYPE, null ); return value.stringValue;"); 
		return load;
	}
	public WebElement getThirdPartyInfo() {
		WebElement e = driver.findElement(By.xpath("(//div[@class='refidno']//*[text()])[1]")); //(//div[@class='refidno']/text())[2]"));
		return e;
	}
	public WebElement getProjectNoInfo() {
		WebElement e = driver.findElement(By.xpath("//a[contains(text(),'PJ2010-7634')]"));
		return e;
	}
	public Object getProjectInfo() {
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		Object proj= js.executeScript("var value = document.evaluate(\"//a[contains(text(),'PJ2010-7634')]/following::text()[1]\",document, null, XPathResult.STRING_TYPE, null ); return value.stringValue;"); 
		return proj;
	}
	public WebElement getPaymentTermsInfo(String payTerms) {
		payTerms ="//td[text()='"+payTerms+"']";
		WebElement d = driver.findElement(By.xpath(payTerms));
		return d;
	}


	public WebElement getDeliveryDateInfo(String month,String day,String year) throws ParseException {
		month = Common.shotMonthToLongMonth(month);
		String	months= "//td[text()='"+month+" "+day+", "+year+"']";
		WebElement d = driver.findElement(By.xpath(months));
		return d;
	}

	public WebElement getPaymentTypeInfo(String payType) {
		payType ="//td[text()='"+payType+"']";
		WebElement d = driver.findElement(By.xpath(payType));
		return d;
	}
	public WebElement getCurrencyInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='EUR - Euros']"));
		return d;
	}






	public WebElement getShippingMethodInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='Catch']"));
		return d;
	}



	public WebElement getAvalidityDely() {
		WebElement rn= driver.findElement(By.xpath("//td[text()='Immediate']"));
		return rn;
	}


	public WebElement getNotesTabInfo() {
		WebElement note = driver.findElement(By.xpath("//a[@id='note']"));
		return note;
	}

}
