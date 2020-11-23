package demo_Project.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInModel extends ModelBase{
	
	public SignInModel(WebDriver d) {
		super(d);
	}
	
	public WebElement getUserTextBox() {
		WebElement id = driver.findElement(By.xpath("//*[@id='username']"));
		return id;
	}
	
	public WebElement getPasswordTextBox() {
		WebElement pass = driver.findElement(By.xpath("//*[@id='password']"));
		return pass;
	}

	public WebElement getLogInBtn() {
		WebElement pass = driver.findElement(By.xpath("//*[@class='button']"));
		return pass;
	}
	
}
