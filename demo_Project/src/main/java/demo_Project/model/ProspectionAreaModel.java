package demo_Project.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProspectionAreaModel extends ModelBase{
	//Extra it will not use in TestNG Suite
	
	public ProspectionAreaModel(WebDriver d) {
		super(d);
	}
	public WebElement getProspectionAreaInfo() {
		WebElement e = driver.findElement(By.xpath("//div[@class='titre inline-block']"));
		return e;
	}
	public WebElement getCommercialProposals() {
		WebElement e = driver.findElement(By.xpath("//a[@title='Commercial proposals']"));
		return e;
	}

	
}
