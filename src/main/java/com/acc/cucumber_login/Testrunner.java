package com.acc.cucumber_login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:target/cucumber.json"}
		,features = "Feature199"
		,glue = {"step_definition112"}
		)
public class Testrunner {

}
