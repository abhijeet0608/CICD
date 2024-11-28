package Utils;



import java.io.FileInputStream;
import java.time.Duration;

import org.bouncycastle.jcajce.provider.symmetric.Blowfish;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Classes.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;


	public WebDriver WebDriverManager()
	{
		if(driver == null)
			
		{
		 WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		    
		    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}
		    return driver;
	}

}


