package com.autotrader.runnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failed.txt"
        , glue = "src/test/java/com/autotrader/stepDefinitions"
        , dryRun = false
        , plugin = {
        "html:target/rerun-default-cucumber-reports",
        "json:target/cucumber_failure.json"})

public class FailedRunner {
}
