package POM_Classes;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Checkout_Page {
	
	public WebDriver driver;
	String product_names;
	
	public Checkout_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By purse = By.cssSelector("[alt=\"Cart\"]");
	By proceed_to_checkout = By.xpath("//*[contains(text(),'PROCEED TO CHECKOUT')]");
	By product_name = By.cssSelector(".cartTable tr td .product-name");
	By promo_button = By.cssSelector(".promoBtn");
	By place_order = By.xpath("//*[contains(text(),'Place Order')]");
	By dropdown = By.tagName("Select");
	By check_box = By.cssSelector("[type=\"checkbox\"]");
	By Agree_Btn = By.xpath("//button[contains(text(),'Proceed')]");
	
	
	
	
	/*
	 * private By add_Items = By.cssSelector(".product .stepper-input .increment");
	 * private By addToCart = By.cssSelector("//*[contains(text(),'ADD TO CART')]");
	 * private By cart = By.cssSelector("[alt='Cart']"); private By
	 * Proceed_To_Checkout =
	 * By.cssSelector("//*[contains(text(),'PROCEED TO CHECKOUT')]"); private By
	 * product_Detail = By.cssSelector("[class='cartTable'] tr"); //private By
	 * place_order = By.cssSelector("//*[contains(text(),'Place Order')]");
	 */	
	
	
	public void verify_the_product_in_the_checkout_Page()
	{
		driver.close()
		driver.findElement(purse).click();
		driver.findElement(proceed_to_checkout).click();
		 product_names=driver.findElement(product_name).getText();
		 System.out.println( product_names.split("-")[0].trim());
		 
	}
	
	public   boolean verifies_the_prompt_Button()
	{
		return driver.findElement(promo_button).isDisplayed();
	}
	
	public void place_the_order() throws InterruptedException
	{
		driver.findElement(place_order).click();
		Thread.sleep(4000);
		Select select = new Select(driver.findElement(dropdown));
		select.selectByValue("India");
		driver.findElement(check_box).click();
		driver.findElement(Agree_Btn).click();
		
	}

	
	
}
