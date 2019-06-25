package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature",glue="com.stepdefinition",plugin="html:target",dryRun=true,tags= {"@Addtarif"})
public class TestRunner {

}
