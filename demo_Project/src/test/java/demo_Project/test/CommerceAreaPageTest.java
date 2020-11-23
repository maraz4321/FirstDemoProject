package demo_Project.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommerceAreaPageTest extends TestBase{
	
	@Test
	public static void clkCommercialProposals() {
		getCommerceAreaPage();
		commerceAreaPage.clkNewProposal();
		getNewCommercialProposalPage();
		String expected = "New commercial proposal";
		String actual =newCommercialProposalPage.getNewCommercialProposalText();
		Assert.assertEquals(actual, expected);
		
	//	System.out.println("Validated Commerce area Page ...........");
	}
	


}
