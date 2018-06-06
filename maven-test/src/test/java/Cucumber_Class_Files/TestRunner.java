package Cucumber_Class_Files;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith (Cucumber.class)
@CucumberOptions(features="Features" ,glue={"TestStepCode"})
public class TestRunner {
	
	

}
