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

import POM_Classes.OfferPage;
import POM_Classes.PageObjectManager;
import Utils.ComonTestSetup;

public class OfferPageSteps 

{
	public ComonTestSetup comontestsetup;
	public String cart_productname;
	public OfferPage offerpage;
	public PageObjectManager pageObjectManager;
	
	
	
	public OfferPageSteps(ComonTestSetup comontestsetup)
	
	{
		this.comontestsetup = comontestsetup;
		offerpage = comontestsetup.pageObjectManager.offerPageObject();
	}
	
	@Then("^user searched with shortname (.*)in offers page to check if product exists.$")
	public void user_searched_with_shortname_in_offers_page_to_check_if_product_exists(String shortname) {
		offerpage.click_on_top_deals();
		switchWindows();
		
		//comontestsetup.driver.findElement(By.cssSelector("[type=\"search\"]")).sendKeys(shortname);
		//pageObjectManager = new PageObjectManager(comontestsetup.driver);
				
		
		offerpage.userSearchedTheProductInOfferPage(shortname);
		cart_productname = offerpage.verifytheProductString();
		
		
	
	   
	    
	    Assert.assertEquals(comontestsetup.ProductName, cart_productname);
	    System.out.println(cart_productname);
	}	
	
	public void switchWindows() {
		
		
		comontestsetup.general_utilities.switchToWindows();
		 
		
	}	
}
	
	
	
	
	
	
	
	

