package TeesstRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
		"json:target/cucumber.json" }, glue = "stepdefn")

//tags= {""})

public class TestttRunnerr extends AbstractTestNGCucumberTests {

}
