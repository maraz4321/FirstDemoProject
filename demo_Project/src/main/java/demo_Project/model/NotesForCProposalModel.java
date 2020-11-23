package demo_Project.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotesForCProposalModel extends ModelBase{
	
	public NotesForCProposalModel(WebDriver d) {
		super(d);
	}
	
	public WebElement getNotePublicInfo() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		By locator = By.xpath("(//div[@class='tagtd table-val-border-col sensiblehtmlcontent'])[1]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement n = driver.findElement(locator);
		return n;
	}

	public WebElement getNotePrivateInfo() {
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		By locator = By.xpath("(//div[@class='tagtd table-val-border-col sensiblehtmlcontent'])[2]");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement n = driver.findElement(locator);
		return n;
	}

}
