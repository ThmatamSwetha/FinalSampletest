package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features=".//src//test//resources//features//",glue= {"stepDefinitions"},

plugin= {"pretty",
"html:targets/Reports/HtmlReports.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags="not @SmokeTest"
)
public class TestRunnertest extends AbstractTestNGCucumberTests{

}
