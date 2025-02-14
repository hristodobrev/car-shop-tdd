package com.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:com.example",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber.html"}
)
public class RunCucumberTest {

}
