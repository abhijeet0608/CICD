package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features = "C:\\Users\\abhij\\eclipse-workspace\\BDD_Cucumber\\src\\test\\resources\\ApplicationTest_FeatureFiles\\Parameterization_Scenario_Outline.feature",
glue = "Steps",
plugin = "pretty"	)
public class Sceanrio_Outline_Runner extends AbstractTestNGCucumberTests {

}
