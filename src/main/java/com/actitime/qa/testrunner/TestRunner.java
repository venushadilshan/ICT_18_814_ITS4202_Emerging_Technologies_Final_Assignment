package com.actitime.qa.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Venusha\\Documents\\ICT_18_814_Testing_Assignment\\src\\main\\java\\com\\actitime\\qa\\feature\\Loging.feature", "C:\\Users\\Venusha\\Documents\\ICT_18_814_Testing_Assignment\\src\\main\\java\\com\\actitime\\qa\\feature\\CreateUser.feature"}
		,glue={"com/actitime/qa/stepdefinitions"}
		,monochrome = true,
				strict=true,
				dryRun=false,
		tags="@TC_002"
		)




public class TestRunner {


	}
