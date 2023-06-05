package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features",
    glue = "stepDefinition",tags = "@SmokeTest or @RegTest")
public class TestRunner {
    
}
//Junit Test Runner/ TestNG Test Runner/Java