package com.StepDefinition;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
 
import com.utility.Helper_Class;
 
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
 
public class HookClass {
	@Before
	public static void setUp() {
		Helper_Class.setUpDriver();
	}
	@After
	public static void tearDown(Scenario scenario) {
//		if(scenario.isFailed()) {
//			final byte[]screenshot = ((TakesScreenshot) Helper_Class.getDriver()).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshot,"image/png",scenario.getName());
//		}
//		Helper_Class.tearDown();
	}
}
