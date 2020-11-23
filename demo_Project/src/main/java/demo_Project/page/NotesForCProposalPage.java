package demo_Project.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo_Project.model.NotesForCProposalModel;

public class NotesForCProposalPage extends NotesForCProposalModel{
	
	public NotesForCProposalPage(WebDriver d) {
		super(d);
	}
	public String notePublicText () {
		WebElement n = getNotePublicInfo();
		String nPl = n.getText();
		return nPl;
	}
	public String notePrivateText () {
		WebElement n = getNotePrivateInfo();
		String nPr = n.getText();
		return nPr;
	}
}
