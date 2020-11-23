package demo_Project.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import demo_Project.page.UserPage;
import demo_Project.page.CommerceAreaPage;
import demo_Project.page.ListOfCommercialProposalPage;
import demo_Project.page.ListOfSalesOrdersPage;
import demo_Project.page.ListOfVendorProposalRequestsPage;
import demo_Project.page.NewCommercialProposalPage;
import demo_Project.page.NewPriceRequestVendorPage;
import demo_Project.page.NewSalesOrdersPage;
import demo_Project.page.NotesForCProposalPage;
import demo_Project.page.NotesOfSalesOrderPage;
import demo_Project.page.ProspectionAreaPage;
import demo_Project.page.SignInPage;

public class TestBase {
	
	protected static WebDriver driver;
	static SignInPage signInPage;
	static UserPage userPage;
	static CommerceAreaPage commerceAreaPage;
	static ProspectionAreaPage prospectionAreaPage;
	static NewCommercialProposalPage newCommercialProposalPage;
	static ListOfCommercialProposalPage listOfCommercialProposalPage;
	static NewSalesOrdersPage newSalesOrdersPage;
	static NotesForCProposalPage notesForCProposalPage;
	static ListOfSalesOrdersPage listOfSalesOrdersPage;
	static NotesOfSalesOrderPage notesOfSalesOrderPage;
	static NewPriceRequestVendorPage newPriceRequestVendorPage; 
	static ListOfVendorProposalRequestsPage listOfVendorProposalRequestsPage;
	protected static String counter;
	
	
	@BeforeSuite
	public static void setURL() {
		System.setProperty("webdriver.chrome.driver", "driver/ChromeDriver.exe");
		driver = new ChromeDriver();
//		driver.get("https://demo.dolibarr.org/societe/list.php?leftmenu=thirdparties"); //start from Third party page 
		driver.get("https://demo.dolibarr.org/comm/index.php?mainmenu=commercial&leftmenu="); // Start from Commerce page
//		driver.get("https://demo.dolibarr.org/public/demo/index.php"); // Start from home page before sign in
		//driver.manage().window().maximize();
		//driver.get("https://demo.dolibarr.org/supplier_proposal/card.php?id=142&save_lastsearch_values=1"); // start from list
		//driver.get("https://demo.dolibarr.org/commande/note.php?id=1084");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
//	@AfterSuite
//	public static void closeWindow() {	
//		driver.close();
//	}

	public static SignInPage getSignInPage() {
		signInPage = new SignInPage(driver);
		return signInPage;
	} 

	public static UserPage getUserPage() {
		userPage = new UserPage(driver);
		return userPage;
	}
	public static CommerceAreaPage getCommerceAreaPage() {
		commerceAreaPage = new CommerceAreaPage(driver);
		return commerceAreaPage;
	}
	public static ProspectionAreaPage getProspectionAreaPage() {
		prospectionAreaPage = new ProspectionAreaPage(driver);
		return prospectionAreaPage;
	}

	public static NewCommercialProposalPage getNewCommercialProposalPage() {
		newCommercialProposalPage = new NewCommercialProposalPage(driver);
		return newCommercialProposalPage;
	}
	public static ListOfCommercialProposalPage getListOfCommercialProposalPage() {
		listOfCommercialProposalPage = new ListOfCommercialProposalPage(driver);
		return listOfCommercialProposalPage;
	}
	public static NewSalesOrdersPage getNewSalesOrdersPage() {
		newSalesOrdersPage = new NewSalesOrdersPage(driver);
		return newSalesOrdersPage;
	}
	
	public static NotesForCProposalPage getNotesForCProposalPage() {
		notesForCProposalPage = new NotesForCProposalPage(driver);
		return notesForCProposalPage;
	}
	
	public static ListOfSalesOrdersPage getListOfSalesOrdersPage() {
		listOfSalesOrdersPage = new ListOfSalesOrdersPage(driver);
		return listOfSalesOrdersPage;
	}
	public static NotesOfSalesOrderPage getNotesOfSalesOrderPage() {
		notesOfSalesOrderPage = new NotesOfSalesOrderPage(driver);
		return notesOfSalesOrderPage;
	}
	public static NewPriceRequestVendorPage getNewPriceRequestVendorPage() {
		newPriceRequestVendorPage = new NewPriceRequestVendorPage(driver);
		return newPriceRequestVendorPage;
	}
	public static ListOfVendorProposalRequestsPage getListOfVendorProposalRequestsPage() {
		listOfVendorProposalRequestsPage = new ListOfVendorProposalRequestsPage(driver);
		return listOfVendorProposalRequestsPage;
	}
}
