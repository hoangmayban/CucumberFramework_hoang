package runners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests",
		glue= {"stepDefinitions"},
		//plugin = { "pretty", "html:target/cucumber-reports" },
		//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
		plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
		monochrome = true
		//all report
		/*plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports"}*/
		)
public class TestRunner {
	
}


