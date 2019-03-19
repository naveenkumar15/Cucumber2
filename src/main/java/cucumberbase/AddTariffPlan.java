package cucumberbase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTariffPlan extends Basecucum {
	public AddTariffPlan() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "rental1")
	private WebElement MonRent;
	@FindBy(id = "local_minutes")
	private WebElement Freelocal;
	@FindBy(id = "inter_minutes")
	private WebElement FreeInt;
	@FindBy(id = "sms_pack")
	private WebElement Freesms;
	@FindBy(id = "minutes_charges")
	private WebElement Localpermin;
	@FindBy(id = "inter_charges")
	private WebElement Intpermin;
	@FindBy(id = "sms_charges")
	private WebElement Smsper;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement Tariffsubmit;

	public WebElement getMonRent() {
		return MonRent;
	}

	public WebElement getFreelocal() {
		return Freelocal;
	}

	public WebElement getFreeInt() {
		return FreeInt;
	}

	public WebElement getFreesms() {
		return Freesms;
	}

	public WebElement getLocalpermin() {
		return Localpermin;
	}

	public WebElement getIntpermin() {
		return Intpermin;
	}

	public WebElement getSmsper() {
		return Smsper;
	}

	public WebElement getSubmit() {
		return Tariffsubmit;
	}

}
