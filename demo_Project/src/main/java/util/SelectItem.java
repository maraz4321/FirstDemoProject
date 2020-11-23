package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectItem {
	
	public static void selectItem(WebElement e,String value) {
			Select sel = new Select(e);
			sel.selectByVisibleText(value);
	}

}
