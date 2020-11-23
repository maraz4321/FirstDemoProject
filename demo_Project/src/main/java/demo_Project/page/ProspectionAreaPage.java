package demo_Project.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo_Project.model.ProspectionAreaModel;

public class ProspectionAreaPage extends ProspectionAreaModel{
	//Extra it will not use in TestNG Suite
	
	public ProspectionAreaPage(WebDriver d) {
		super(d);
	}
	public String getProspectionAreaPageText() {
		WebElement e = getProspectionAreaInfo();
		String text = e.getText();
		System.out.println(text);
		return text;
	}
	public void clkCommercialProposals() {
		WebElement e = getCommercialProposals();
		e.click();
	}


}
