package demo_Project.model;

import org.openqa.selenium.WebDriver;

public class ModelBase {
	protected WebDriver driver;
	
	public ModelBase(WebDriver d) {
		driver=d;
	}

}
