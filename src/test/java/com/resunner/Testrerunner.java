package com.resunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Testrerunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(features="@src\\test\\resources\\failed.txt",glue="com.stepdefinition",plugin= {"html:target"})
	public class TestRunner {
	}
}
