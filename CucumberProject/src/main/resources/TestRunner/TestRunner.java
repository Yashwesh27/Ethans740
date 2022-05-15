package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		 features = "../CucumberProject/src/main/resources/Feature"
		 ,glue = {"StepDefination"}
		 ,plugin={"pretty","html:CucumberReport/Cucumberhtml/cucumber.html","json:CucumberReport/cucumberjson/cucumber.json"
				 ,"junit:CucumberReport/cucumberxml/cucumber.xml","pretty:CucumberReport/cucumbertxt/cucumber-pretty.txt"}
		 ,monochrome=true
		 ,dryRun=true
				 
		)

public class TestRunner {

}
