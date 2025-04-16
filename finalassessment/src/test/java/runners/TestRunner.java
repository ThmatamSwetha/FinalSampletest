package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features=".//src//test//resources//features//",glue= {"stepDefinitions"},
//tags="not @SmokeTest"

plugin= {"pretty",
"html:targets/Reports/HtmlReports.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
