package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature",glue="com.stepdefinition",plugin= {"html:target","json:src\\test\\resources\\report.json","rerun:src\\test\\resources\\failed.txt"},dryRun=true,tags={"@tag1"})
public class TestRunner {

}


