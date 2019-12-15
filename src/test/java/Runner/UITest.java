package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
//give feature file and read the steps.

@CucumberOptions(
        plugin = {"html:target/cucumberHTML-report", "pretty", "json:target/cucumber.json"},
        features = "src/test/resources/uiFeatures",
        //now it needs the code for the step.
        glue = "stepDefs",
        dryRun = true,
        tags = "@TECTC-1015"
)


public class UITest {

}
