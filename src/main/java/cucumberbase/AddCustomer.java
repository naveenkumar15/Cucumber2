package cucumberbase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer extends Basecucum {
	public AddCustomer() {
		PageFactory.initElements(driver, this);
	}

	// @FindBy(id = "done")
	// private WebElement Background;
	@FindBy(id = "fname")
	private WebElement firstname;
	@FindBy(id = "lname")
	private WebElement lastName;
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(name = "addr")
	private WebElement address;
	@FindBy(id = "telephoneno")
	private WebElement mobile;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	// public WebElement getBackground() {
	// return Background;
	// }

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
