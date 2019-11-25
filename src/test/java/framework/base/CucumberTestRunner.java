package framework.base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features/create-account.feature",
        monochrome = true,
        tags = "@MyTag",
        glue={"tests", "framework.base"})
public class CucumberTestRunner {
}