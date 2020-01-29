package casestudy.casestudy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "casestudy.casestudy" }, tags = "@login", plugin = {"pretty","json:target/cucumber.json"})
public class RunnnerClass {
}