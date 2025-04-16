package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {
	@BeforeAll
	public static void setUpDriver() {
		TestBase.initDriver();
		
	}
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot screen=(TakesScreenshot)TestBase.getDriver();
			byte[] img=screen.getScreenshotAs(OutputType.BYTES);
			scenario.attach(img, "image/png", "ScreenImage");
			
		}}
		
		
	


}
