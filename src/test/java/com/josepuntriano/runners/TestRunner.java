package com.josepuntriano.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.josepuntriano.stepdefinitions",
        tags = "@regression",
        plugin = {
                "pretty",
                "json:target/cucumber-reports/cucumber.json"
        }
)
public class TestRunner {
}