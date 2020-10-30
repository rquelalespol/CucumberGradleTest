package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/test.feature",
glue= {"steps"},
plugin = {"pretty", "html:target/report"})
public class Runner extends AbstractTestNGCucumberTests{
	
}
