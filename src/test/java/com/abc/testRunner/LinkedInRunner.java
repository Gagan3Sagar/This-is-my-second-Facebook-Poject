package com.abc.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\DELL\\SELENIUM\\MyfacebookProject\\src\\test\\java\\com\\abc\\features\\Login.feature",
		glue ="com.abc.stepdefinitions",
		dryRun= false
		)

public class LinkedInRunner {

}
