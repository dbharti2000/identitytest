package com;


import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
        tags = {"@dvla"},
        features = "src/test/resources",
        strict = true,
        plugin = {
                "html:target/reports",
                "usage: target/cucumber-usage.json",
                "json:target/reports/cucumber-report.json"}
)
public class CucumberRun {
}
