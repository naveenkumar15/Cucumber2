package cucumberbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SampleAddcust extends Basecucum {

	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		WebDriver driver = getDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");

	}

	@When("The user fill in the Customer details")
	public void the_user_fill_in_the_Customer_details() {
		AddCustomer a = new AddCustomer();
		// a.getBackground().click();
		a.getFirstname().sendKeys("naveen");
		a.getLastName().sendKeys("kumar");
		a.getEmail().sendKeys("navinag91@gmail.com");
		a.getAddress().sendKeys("Vellore");
		a.getMobile().sendKeys("9876543210");

	}

	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		AddCustomer a = new AddCustomer();
		a.getSubmit().click();
	}

	@Then("The user should see the success message")
	public void the_user_should_see_the_success_message() {
		AddcustSuccess ac = new AddcustSuccess();
		Assert.assertEquals("Please Note Down Your CustomerID", ac.getCustSucessmsg().getText());
	}

	@Then("The user should see the customer ID")
	public void the_user_should_see_the_customer_ID() {
		AddcustSuccess ac = new AddcustSuccess();
		Assert.assertTrue("Customerid", ac.getCustomerid().isDisplayed());
	}
}
