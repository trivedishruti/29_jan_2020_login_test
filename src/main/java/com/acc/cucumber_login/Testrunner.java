package com.acc.cucumber_login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature199"
		,glue = {"step_definition112"}
		)
public class Testrunner {

}
