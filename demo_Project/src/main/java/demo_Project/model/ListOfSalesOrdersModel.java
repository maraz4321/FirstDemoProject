package demo_Project.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListOfSalesOrdersModel extends ModelBase{
	
	public ListOfSalesOrdersModel(WebDriver d) {
		super(d);
	}
	
	public WebElement getRefSearchBox() {
		WebElement ref = driver.findElement(By.xpath("(//input[@class='flat'])[1]"));
		return ref;
	}
	public WebElement getRefIngo() {
		WebElement r = driver.findElement(By.xpath("(//*[@class='nowraponall'])[1]"));
		return r;
	}
	public WebElement getSalesRefBoxInfo() {
		WebElement r = driver.findElement(By.xpath("//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']"));
		return r;
	}
	public Object refCustomer() {
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		Object load= js.executeScript("var value = document.evaluate(\"//div[@class='refidno']/a[1]/span/following::text()[1]\",document, null, XPathResult.STRING_TYPE, null ); return value.stringValue;"); 
		return load;
	}
	public WebElement getThirdPartyInfo() {
		WebElement e = driver.findElement(By.xpath("(//div[@class='refidno']//*[text()])[1]")); //(//div[@class='refidno']/text())[2]"));
		return e;
	}
	public WebElement getProjectNoInfo() {
		WebElement e = driver.findElement(By.xpath("//a[contains(text(),'8455748')]"));
		return e;
	}
	public Object getProjectInfo() {
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		Object proj= js.executeScript("var value = document.evaluate(\"//a[contains(text(),'8455748')]/following::text()[1]\",document, null, XPathResult.STRING_TYPE, null ); return value.stringValue;"); 
		return proj;
	}
	public WebElement getDateInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='02/28/2019']"));
		return d;
	}
	public WebElement getDeliveryDateInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='November 30, 2020']"));
		return d;
	}
	public WebElement getShippingMethodInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='Catch']"));
		return d;
	}
	public WebElement getPaymentTermsInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='Due Upon Receipt']"));
		return d;
	}
	public WebElement getPaymentTypeInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='Bank transfer']"));
		return d;
	}
	public WebElement getCurrencyInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='USD - US Dollars']"));
		return d;
	}
	public WebElement getAvalidityDely() {
		WebElement rn= driver.findElement(By.xpath("//td[text()='Immediate']"));
		return rn;
	}

	public WebElement getChannelInfo() {
		WebElement d = driver.findElement(By.xpath("//td[text()='Internet']"));
		return d;
	}
	public WebElement getNotesTabInfo() {
		WebElement note = driver.findElement(By.xpath("//a[@id='note']"));
		return note;
	}


}
