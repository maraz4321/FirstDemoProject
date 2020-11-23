package demo_Project.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import demo_Project.model.NewPriceRequestVendorModel;
import util.SelectItem;

public class NewPriceRequestVendorPage extends NewPriceRequestVendorModel{
	public NewPriceRequestVendorPage(WebDriver d) {
		super(d);
	}
	public void enterVendorRef(String vendor) {
		WebElement e = getVendorSelectBoxInfo();
		Select sel = new Select(e);
		sel.selectByVisibleText(vendor);
	}
	public void selectPaymentTerms(String payTerms) {
		WebElement e1 = getPaymentTermsInfo();
		Select sel = new Select(e1);
		sel.selectByVisibleText(payTerms);
	}
	
	public void selectPaymentType(String payType) {
		WebElement e = getPaymentTypeInfo();
		Select sel = new Select(e);
		sel.selectByVisibleText(payType);
	}
	public void selectShippingmethod(String ship) {
		WebElement e1 = getShippingMethodInfo();
		SelectItem.selectItem(e1, ship);
	}
	public void clkDateImgBox() {
		WebElement e = getDateImgInfo();
		e.click();
	}
	public void selectMonth(String month) {
		WebElement e1 = getMonthBoxInfo();
		Select sel = new Select(e1);
		sel.selectByVisibleText(month);
	}
	public void selectYear(String year) {
		WebElement e = getYearBoxInfo();
		Select sel = new Select(e);
		sel.selectByVisibleText(year);
	}
	public void selectDate(String xpath) {
		WebElement e = getDateTableInfo(xpath);
		e.click();
	}

	public void selectDefaultDocTemp(String doc) {
		WebElement e1 = getDefaultDocTempInfo();
		SelectItem.selectItem(e1, doc);
	}
	public void selectProject(String project) {
		WebElement e1 = getProjectInfo();
		SelectItem.selectItem(e1, project);
	}
	
	public void clkCurrencyBox() {
		WebElement e1 = getCurrencyBoxInfo();
		Actions act = new Actions(driver);
		act.moveToElement(e1);
		act.click();
		act.perform();
	}
	public void clkCurrencyitem(String currency) {
		WebElement e1 = getCurrencyInfo();
		Actions act = new Actions(driver);
		act.moveToElement(e1);
		act.sendKeys(currency);
		act.sendKeys(Keys.RETURN);
		act.perform();
	}
	public void clkCreateDraftBtn() {
		driver.switchTo().defaultContent();
		WebElement e = getCreateDraftBtn();
		Actions act = new Actions(driver);
		act.moveToElement(e);
		act.click();
		act.perform();
	}
	
	public void clkCancelBtn() {
		driver.switchTo().defaultContent();
		WebElement e = getCancelBtn();
		Actions act = new Actions(driver);
		act.moveToElement(e);
		act.click();
		act.perform();
	}
	

}
