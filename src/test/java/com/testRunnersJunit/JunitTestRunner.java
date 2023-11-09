package com.testRunnersJunit;

                     //import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
                      //import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features/customer",
		
//		tags="@Smoke or @Regression",
		
//		tags="@Landing_page",

//				tags="@Admin_log_in_page or @Super_admin_log_in_page or @Executive_log_in_page",
		
		glue = {"stepDefinitions","com/applicationHooks"},
		monochrome=true,
		dryRun = false,
		plugin = {"pretty",
			"html:target/html_report/cucumber_reports.html",
			"junit:target/junit_report/junit_reports.xml",
			"json:target/json_report/json_reports.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}
                //		format = {"pretty","html:report"} //for older application
		)
public class JunitTestRunner { //extends AbstractTestNGCucumberTests {
	
}
                    //Extent 1: new html create-> htmlreport_date.html
