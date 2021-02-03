package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(features={"src//test//java//features"}
        ,glue={"StepDefs","utility"}
        ,plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json"}
        , tags ={"@appium"}
)

@Test
public class RunTests extends AbstractTestNGCucumberTests {
}
