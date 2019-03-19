package cucumberbase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddcustSuccess extends Basecucum {
	public AddcustSuccess() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//b[text()='Customer ID']")
	private static WebElement Customerid;
	@FindBy(xpath = "//b[text()='Please Note Down Your CustomerID']")
	private static WebElement CustSucessmsg;

	public static WebElement getCustomerid() {
		return Customerid;
	}

	public static WebElement getCustSucessmsg() {
		return CustSucessmsg;
	}

}
