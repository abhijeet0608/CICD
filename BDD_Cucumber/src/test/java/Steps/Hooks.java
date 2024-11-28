package Steps;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.devtools.v128.filesystem.model.File;

import Utils.ComonTestSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public ComonTestSetup testcontextsetup;
	public  Hooks(ComonTestSetup testcontextsetup)
	{
		this.testcontextsetup = testcontextsetup;
	}
	
	@After  //Post Condition
	public void close_Browser()
	{
		System.out.println("Closing code");
	}
	
@AfterStep  //execute after each step
public void add_screenshot(Scenario scenario) throws IOException   //scenario will provide info about every scenario 
{
	
    if(scenario.isFailed())
    {
    	java.io.File srcPath = ((TakesScreenshot)testcontextsetup.TestBase.WebDriverManager()).getScreenshotAs(OutputType.FILE);
    	byte [] content = FileUtils.readFileToByteArray(srcPath);
    	scenario.attach(content, ".png", "FailedTestCase"+scenario.getName());
    }
}


}


