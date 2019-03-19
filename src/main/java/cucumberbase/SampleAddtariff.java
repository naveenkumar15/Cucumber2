package cucumberbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SampleAddtariff extends Basecucum {

	@Given("The user is in AddTariffPlan page")
	public void the_user_is_in_AddTariffPlan_page() {
		WebDriver driver = getDriver();
		driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
	}

	@When("The user Fill in the Tariff details")
	public void the_user_Fill_in_the_Tariff_details() {
		AddTariffPlan t = new AddTariffPlan();
		t.getMonRent().sendKeys("999");
		t.getFreelocal().sendKeys("100");
		t.getFreeInt().sendKeys("200");
		t.getFreesms().sendKeys("300");
		t.getLocalpermin().sendKeys("400");
		t.getIntpermin().sendKeys("500");
		t.getSmsper().sendKeys("600");
	}

	@When("The user clicks the Tariffsubmit button")
	public void the_user_clicks_the_Tariffsubmit_button() {
		AddTariffPlan t = new AddTariffPlan();
		t.getSubmit().click();
	}

	@Then("The user should see the Tariffsuccess message")
	public void the_user_should_see_the_message() {
		AddTariffSucess ts = new AddTariffSucess();
		Assert.assertEquals("Congratulation you add Tariff Plan", ts.getCongratsmsg().getText());
	}
}
