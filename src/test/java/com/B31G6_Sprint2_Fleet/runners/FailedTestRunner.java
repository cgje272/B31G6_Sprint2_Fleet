package com.B31G6_Sprint2_Fleet.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/B31G6_Sprint2_Fleet/step_definitions"

)



public class FailedTestRunner {
}
