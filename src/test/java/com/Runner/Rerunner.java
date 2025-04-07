package com.Runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		plugin = {"pretty" , "html:target/HTMLReportRerun/report.html" , "rerun:target/failedRerun.txt"},
		features = {"@target/failedRerun.txt"},
		glue = "com.Definitions",
		monochrome=true
		)

public class Rerunner extends AbstractTestNGCucumberTests{

}