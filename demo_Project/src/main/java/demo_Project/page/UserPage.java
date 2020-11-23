package demo_Project.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo_Project.model.UserModel;

public class UserPage extends UserModel{
	public UserPage(WebDriver d) {
		super(d);
	}
	public void clkUserInfo() {
		WebElement e = getUserInfo();
		e.click();
	}
	public String getUsernameText() {
		
		WebElement e = getUserInfoFromDropdownToggleLogin();
		String username = e.getText();
		return username;
	}
	public void clkcompany() {
		
		WebElement btn = getComerceMenuInfo();
		btn.click();
	}
	public String getDemo() {
		Object e = getUserInfoDemo();
		String i =e.toString();
		return i;
	}

}
