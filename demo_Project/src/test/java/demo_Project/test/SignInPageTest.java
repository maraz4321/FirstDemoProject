package demo_Project.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ExcelReader;

public class SignInPageTest extends TestBase{
	
	@Test(dataProvider="signIn")
	public static void signInPageTest(String u, String p,String e) throws IOException {
		getSignInPage();
		signInPage.enterLogInInfo(u, p);
		getUserPage();
		userPage.clkUserInfo();
		
		String expected = e;
		String actual= userPage.getDemo();

		boolean result = actual.contains(expected);
		Assert.assertTrue(result);
		
//		System.out.println("Validated SignIN Page ...............");
	}
		
	@DataProvider(name="signIn")
	public Object[][] datafeader() throws IOException{
		String filepath = "data/SignIn.xlsx";
		String sheetname = "Sheet1";
	
		Object[][] info=ExcelReader.excelToObject(filepath, sheetname);
	
		return info;
	}


}
