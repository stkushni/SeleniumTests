package base;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/feature",
        glue = "steps",
        tags = "@mail",
        snippets = SnippetType.CAMELCASE
)

public class TestRunner {
}