package Utils;

import org.openqa.selenium.WebDriver;

import POM_Classes.PageObjectManager;



public class ComonTestSetup {

	
	public WebDriver driver;
	public String ProductName;
	
	//public General_Utilis General_Utilis ;
	public PageObjectManager pageObjectManager;
	public General_Utilis general_utilities;
	public TestBase TestBase;
	
	
	
	public ComonTestSetup()
	{
		TestBase = new TestBase();
		pageObjectManager = new PageObjectManager(TestBase.WebDriverManager());
		general_utilities = new General_Utilis(TestBase.WebDriverManager());
				
	
	
	/*
	 * public void TestContextSetup() {
	 * 
	// * pOM = new PageObjectManager (driver); General_Utilis = new
	 * General_Utilis(driver); }
	 */
	
}

}