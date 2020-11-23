package demo_Project.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo_Project.model.SignInModel;

public class SignInPage extends SignInModel{
	
	public SignInPage(WebDriver d) {
		super(d);
	}

	public void enterLogInInfo(String u,String p) {
		WebElement id = getUserTextBox();
		id.clear();
		id.sendKeys(u);
		WebElement pass = getPasswordTextBox();
		pass.clear();
		pass.sendKeys(p);
		WebElement btn = getLogInBtn();
		btn.click();
	}

}
