package Steps;
import Utils.ComonTestSetup;

import org.openqa.selenium.By;

import POM_Classes.Checkout_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Checkout {

	
	public ComonTestSetup ComonTestSetup;
	public Checkout_Page cp;
	
	
	
	public Checkout(ComonTestSetup ComonTestSetup)
	{
		this.ComonTestSetup = ComonTestSetup;
		this.cp = ComonTestSetup.pageObjectManager.checkoutPageObject();
	}
	
	

	@Then("user proceeds with checkout and validate tom in the cart.")
	public void user_proceeds_with_checkout_and_validate_tom_in_the_cart() {
	   cp.verify_the_product_in_the_checkout_Page();
	   cp.verifies_the_prompt_Button();
	}
	@Then("verify the user is able to place the order sucessfully")
	public void verify_the_user_is_able_to_place_the_order_sucessfully() throws InterruptedException {
		
	 cp.place_the_order();
	}
	
	
}
