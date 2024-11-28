package POM_Classes;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
		public WebDriver driver;
		public LandingPage landingPage;
		public OfferPage offerpage;
		public Checkout_Page Checkout_Page;
		
	  public PageObjectManager(WebDriver driver)
	  {
		  this.driver = driver;
	  }

		public LandingPage landingPageObject()
		{
			landingPage = new LandingPage(driver);
			return landingPage;
		}
		
		public OfferPage offerPageObject()
		{
			offerpage = new OfferPage(driver);
			return offerpage;
		}

	  public Checkout_Page checkoutPageObject()
	  {
		  Checkout_Page = new Checkout_Page(driver);
		  return Checkout_Page;
	  }



	}


