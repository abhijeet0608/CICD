package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "C:\\Users\\abhij\\eclipse-workspace\\BDD_Cucumber\\src\\test\\resources\\ApplicationTest_FeatureFiles\\Scenario_Outline.feature", // Use forward slashes for compatibility
	    glue = "Steps",
	    plugin = {
	        "pretty",
	        "html:target/cucumber.html",
	        "json:target/cucumber.json",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	        "rerun:target/failedSceanrio.txt"},
	    tags = "@placeOrder" // Ensure the tag matches your feature files
	)
	public class Loginrunner extends AbstractTestNGCucumberTests {

	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	}

