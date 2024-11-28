package POM_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;

	private By search = By.cssSelector("[placeholder='Search for Vegetables and Fruits']");
	private By productname = By.cssSelector("[class='product-name']");
	//private By TopDeals = By.cssSelector("[href='#/offers']");
	By increment = By.cssSelector(".stepper-input .increment");
	By add_to_cart = By.xpath("//*[contains(text(),'ADD TO CART')]");

	public String URL = "https://rahulshettyacademy.com/seleniumPractise/#/";

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	  public void searchTheProduct(String name) {
	  driver.findElement(search).sendKeys(name); 
	  }
	 

	public void getSearchedText() {
		driver.findElement(search).getText();

	}

	public String getProductName() {
		return driver.findElement(productname).getText().split("-")[0].trim();
	}



	
	
	
	public void add_required_product_items_in_cart(int quantity)
	{
		int a = quantity;
		
		while(a-1>0)
		{
			driver.findElement(increment).click();
			a--;
		}
			
	}
	public void click_on_add_to_cart()
	{
		driver.findElement(add_to_cart).click();
	}

}