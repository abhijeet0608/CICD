package POM_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OfferPage   {
	// new comments added to system
public WebDriver driver;
public String ProductOnOfferPage;
	public OfferPage(WebDriver driver) {
		this.driver= driver;
	}
	private By SearchBox = By.cssSelector(".row #search-field");
	private By ProdText = By.cssSelector(".table tr td:first-of-type");
	private By TopDeals = By.cssSelector("[href='#/offers']");
	
	public void userSearchedTheProductInOfferPage(String name)
	{
		driver.findElement(SearchBox).sendKeys(name);
	}
	
	public String verifytheProductString ()
	{
	  ProductOnOfferPage = driver.findElement(ProdText).getText();
	  System.out.println(ProductOnOfferPage);
	  return ProductOnOfferPage;
	  
	  
	}

	
	public void click_on_top_deals()
	{
		driver.findElement(TopDeals).click();
	}
	
	
	/*
	 * public void verify_the_product() { Assert.assertEquals(ProductOnOfferPage,
	 * ComonTestSetup.); }
	 */
}
