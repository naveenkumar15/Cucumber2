package cucumberbase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTariffSucess extends Basecucum {
	public AddTariffSucess() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Congratulation you add Tariff Plan']")
	private static WebElement Congratsmsg;

	public static WebElement getCongratsmsg() {
		return Congratsmsg;
	}

}
