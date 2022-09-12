package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefile/Samplefeature.feature",glue="com.stepdefinations")
public class TestRunner_eg {

}
