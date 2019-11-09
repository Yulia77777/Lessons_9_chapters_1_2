package framework.base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/resources/features/create-account.feature",
                 monochrome = true,
                 tags = "@MyTag",
                 glue={"tests", "framework.base"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests { }