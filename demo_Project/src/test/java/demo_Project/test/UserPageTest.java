package demo_Project.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserPageTest extends TestBase{
	
	@Test
	public static void userPage() throws IOException {
		getUserPage();
		userPage.clkUserInfo();
		//userPage.clkcompany(); // now I logIn at commerce area directly
		getCommerceAreaPage();
		
		String expected = "Commerce area";
		String actual = commerceAreaPage.getCommerceAreaText();
		
		Assert.assertEquals(actual, expected);
		
	//	System.out.println("Validated User Page ......................");
		
	}
}
