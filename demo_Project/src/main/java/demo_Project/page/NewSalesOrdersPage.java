package demo_Project.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import demo_Project.model.NewSalesOrdersModel;
import util.SelectItem;

public class NewSalesOrdersPage extends NewSalesOrdersModel{
	public NewSalesOrdersPage(WebDriver d) {
		super(d);
	}
	public void enterCustomerRef(String ref) {
		WebElement e = getRefCustomerTextBox();
		e.sendKeys(ref);
	}
	
	public void selectcustomerItem(String value) {
		WebElement e = getCustomerSelectBoxInfo();
		Select sel = new Select(e);
		sel.selectByVisibleText(value);
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
	public void clkDeliveryDateImgBox() {
		WebElement e = getDeliveryDateImgInfo();
		e.click();
	}
	public void selectDeliveryMonth(String dlmonth) {
		WebElement e1 = getMonthBoxInfo();
		Select sel = new Select(e1);
		sel.selectByVisibleText(dlmonth);
	}
	public void selectDeliveryYear(String dlyear) {
		WebElement e = getYearBoxInfo();
		Select sel = new Select(e);
		sel.selectByVisibleText(dlyear);
	}
	
	public void selectDeliveryDate(String dlDate) {
		WebElement e = getDeliveryDateTableInfo(dlDate);
		e.click();
	}
	public void selectPaymentTerms(String payTerms) {
		WebElement e1 = getPaymentTermsInfo();
		Select sel = new Select(e1);
		sel.selectByVisibleText(payTerms);
	}
	public void selectPaymentType(String payType) {
		WebElement e1 = getPaymentTypeInfo();
		SelectItem.selectItem(e1, payType);
	}

	public void selectAvailitityDely(String avai) {
		WebElement e1 = getAvailabilityInfo();
		SelectItem.selectItem(e1, avai);
	}
	public void selectShippingmethod(String ship) {
		WebElement e1 = getShippingMethodInfo();
		SelectItem.selectItem(e1, ship);
	}
	public void selectChannel(String channel) {
		WebElement e1 = getChannelInfo();
		SelectItem.selectItem(e1, channel);
	}

	public void selectProject(String project) {
		WebElement e1 = getProjectInfo();
		SelectItem.selectItem(e1, project);
	}
	
	public void enterCustomFieldInfo(String customField) {
		WebElement e = getCustomField1();
		e.sendKeys(customField);
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
	
	public void writeNotePublic(String n1) {
	driver.switchTo().frame(0);
	WebElement e =getNoteInfo();
	e.sendKeys(n1);
	}
	public void writeNotePrivate(String n2) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
	WebElement e =getNoteInfo();
	e.sendKeys(n2);
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
