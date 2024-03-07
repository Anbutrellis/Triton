package org.Runner;

import org.Uttility.JVMReports;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features", dryRun = false, glue = "org.Stepdefnitions", monochrome = true,tags ="@1", plugin = {
		"pretty", "json:src\\test\\resources\\reports\\jsonReport\\jsonReport.json",
		"rerun:src\\test\\resources\\reports\\FailedReport\\failedscenario.txt" })
public class TestRunner {
	@AfterClass
	public static void reports() {
		JVMReports.generateJVMReports("src\\test\\resources\\reports\\jsonReport\\jsonReport.json");

	}
}
