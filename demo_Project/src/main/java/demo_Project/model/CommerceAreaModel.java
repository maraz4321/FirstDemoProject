package demo_Project.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommerceAreaModel extends ModelBase{
	
	public CommerceAreaModel(WebDriver d) {
		super(d);
	}
	
	public WebElement getCommerceAreaTitleInfo() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		By locator = By.xpath("//div[@class='titre inline-block']");  
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement pass = driver.findElement(locator);
		return pass;
	}
	//new proposal element
	
	public WebElement getNewProposalInfo() {
		WebElement e = driver.findElement(By.xpath("//a[@title='New proposal']"));
		return e;
	}
	
	public WebElement getComPropListInfo() {
		WebElement list = driver.findElement(By.xpath("(//*[@title='List'])[1]"));
		return list;
	}
	
	public WebElement getNewSalesOrderInfo() {
		WebElement nSO = driver.findElement(By.xpath("(//a[@title='New order'])[1]"));
		return nSO;
	}
	
	public WebElement getSalesOrderListInfo() {
		WebElement sLO = driver.findElement(By.xpath("(//*[@title='List'])[2]"));
		return sLO;
	}
	public WebElement getNewPriceRequestInfo () {
		WebElement er = driver.findElement(By.xpath("//a[@title='New price request']"));
		return er;
	}
	public WebElement getVendorPriceReuestListInfo() {
		WebElement sLO = driver.findElement(By.xpath("(//a[@title='List'])[3]"));
		return sLO;
	}
}
