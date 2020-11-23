package demo_Project.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserModel extends ModelBase{
	
	public UserModel(WebDriver d) {
		super(d);
	}
	public WebElement getUserInfo() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		By locator = By.xpath("(//*[@class='dropdown-toggle login-dropdown-a'])[2]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement pass = driver.findElement(locator);
		return pass;
	}
	
	public WebElement getUserInfoFromDropdownToggleLogin() {
	By locator = By.xpath("//div[@class='user-header']/p");
	WebElement pass = driver.findElement(locator);
	return pass;
}
	public WebElement getComerceMenuInfo() {
		By locator = By.xpath("//*[@id='mainmenutd_commercial']/div");
		WebElement pass = driver.findElement(locator);
		return pass;
	}
	public Object getUserInfoDemo() {
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		Object demo= js.executeScript("var value = document.evaluate(\"//*[@id='topmenu-login-dropdown']/div/div[1]/p/text()[1]\",document, null, XPathResult.STRING_TYPE, null ); return value.stringValue;"); 
		return demo;
	}

}
