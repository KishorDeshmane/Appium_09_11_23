package com.testRunnersTestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/features/customer",
//		features = "src/test/resources/A_features/B_Super_admin",
//		features = "src/test/resources/A_features/B_Administrator/C_Super_admin",
//		features = "src/test/resources/A_features/B_Administrator/D_Admin",
//		features = "src/test/resources/A_features/G_Partner",
		
		tags="@verify_otp_buttonh",
		
		
		glue = {"stepDefinitions","com/applicationHooks"},
		monochrome=true,
		dryRun = false,
		plugin = {"pretty",
			"html:target/html_report/cucumber_reports.html",
			"junit:target/junit_report/junit_reports.xml",
			"json:target/json_report/json_reports.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}
		)
	
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	
}
