package com.cucumber.junit.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ="pretty",
        /*{"pretty", "html:target/cucumber-reports/report.html",
                "json:target/cucumber-reports/CucumberTests.json",
                "junit:target/cucumber-reports/CucumberTests.xml"},*/
        monochrome = true,
        tags = "@smoke",
        glue = "com.cucumber.junit",
        features = "src/test/resources/com.cucumber.junit.features"
)


public class CucumberTest {

}
