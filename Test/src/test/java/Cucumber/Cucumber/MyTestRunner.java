package Cucumber.Cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/java/Cucumber/Cucumber/PageLaunch.feature",	
		plugin = { "pretty",
				"junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports"}
		)

public class MyTestRunner {	


}

