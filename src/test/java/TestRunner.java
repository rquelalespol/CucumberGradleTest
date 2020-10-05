import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue= {"steps"},
tags = {"@Test"},
plugin = {"pretty", "html:build/report"})
public class TestRunner{
}
