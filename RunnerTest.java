package project;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "feature.feature",
        plugin = {"pretty",
                "junit:target/cucumber-reports/Cucumber.xml",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber/report.html"},
        glue = {"stepDefinitions"}
)
public class RunnerTest {

}