package flaskdemo.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features", glue= {"steps"},
		monochrome = true,
//		tags = "@validlogin",
		
				plugin = {
				        "pretty",
				        "json:target/cucumber-report/cucumberjunit.json",
				        "junit:target/cucumber-report/cucumberjunit.xml",
				        "html:target/cucumber-report/cucumber.html"},
				publish = true
//				dryRun = true
		)
public class JunitRunnerTest {

}
