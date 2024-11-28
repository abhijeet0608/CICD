package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class General_Utilis {
	public WebDriver driver;
	
	public General_Utilis(WebDriver driver)
	{
	this.driver = driver;
	}
	

public void switchToWindows()	
	{
	Set <String> st = driver.getWindowHandles();
	Iterator <String> itr=st.iterator();
	String main_window =itr.next();
	String child_window = itr.next();
	driver.switchTo().window(child_window);
	}
}
