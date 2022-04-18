package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        glue = "stepDefinitions", stepNotifications = true,
        tags = "@WebTest or @MobileTest or @PortalTest")
public class TestRunner {
}
