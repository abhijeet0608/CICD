package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POM_Classes.LandingPage;
import POM_Classes.PageObjectManager;
import Utils.ComonTestSetup;

public class LandingPageSteps 

{
	public ComonTestSetup comontestsetup;
	public PageObjectManager pageObjectManager;
	public LandingPage lp;
	;
	public Utils.TestBase TestBase;
	
	public LandingPageSteps(ComonTestSetup comontestsetup)
	{
		this.comontestsetup = comontestsetup;
		lp =comontestsetup.pageObjectManager.landingPageObject();
	}
	
	
	public String cart_productname;

	@Given("User is on Cart Landing page.")
	public void user_is_on_cart_landing_page() {
		
		comontestsetup.TestBase.WebDriverManager();
	 
	}
	@When("^user searched with shortname (.+) and extracted same name of product.$")
	public void user_searched_with_shortname_and_extracted_same_name_of_product(String shortname) throws InterruptedException {
		
			
		lp.searchTheProduct(shortname);
		
	   Thread.sleep(2000);
	   comontestsetup.ProductName =lp.getProductName();
	    System.out.println(comontestsetup.ProductName);
	}
		@When("user added no {string} items of the respective product in the cart.")
		public void user_added_no_items_of_the_respective_product_in_the_cart(String quanitity) {
			
			lp.add_required_product_items_in_cart(Integer.parseInt(quanitity));
			lp.click_on_add_to_cart();
		   
		}   
	    
	    
	    
	    
	    
	    //lp.clickOnTopDeals();
	
	

	
	
	
	
	
	
	
	
}


