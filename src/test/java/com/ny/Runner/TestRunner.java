package com.ny.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
			features = {"C:/nytimes-sample/src/test/java/Features"}
			,glue={"com.ny.StepDefinitions", "AppHooks"},
			tags = "@OtherSectionfunctionality",
			monochrome = true,
			dryRun=false
			)



public class TestRunner extends AbstractTestNGCucumberTests{
	
}