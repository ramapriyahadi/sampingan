package cucumber;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //format = {"preety", "json:target/"},
        format = {"json:target/cucumber.json","html:target/site/cucumber-preety"},
        features = {"src/test/java/Features"},
        glue = "method"

)


public class runCucumberTest {

}
