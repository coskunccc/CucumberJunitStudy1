package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.cli.Main;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-report.html",
                "json:target/cucumber-report.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber-reports"
        },
        features = "src/test/resources/features",
        glue="com/cydeo/stepDefinitions",
        dryRun=false,
        tags="@wip"
)

public class CukesRunner {
}
