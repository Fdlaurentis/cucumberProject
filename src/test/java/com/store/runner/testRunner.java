package com.store.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.store",
        plugin = {
                "pretty","summary",
                "html:target/test-results/cucumber.html",
                "json:target/test-results/cucumber.json",
                "junit:target/test-results/cucumber.xml"
        },
        tags = "@addAddress",
        monochrome = false,
        publish = true,
        dryRun = false

)

public class testRunner extends AbstractTestNGCucumberTests{
}
