package runners;

import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features", glue = "steps", plugin = { "pretty", "html:target",
		"json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class TestNGRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}