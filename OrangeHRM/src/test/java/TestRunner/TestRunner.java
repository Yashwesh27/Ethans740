package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(       
		 features = "C:\\Users\\HOME\\eclipse-workspace\\OrangeHRM\\src\\test\\java\\Feature"
		 ,glue = {"StepDefination"}
		 ,plugin={"pretty","html:CucumberReport/cucumberhtml/destination.html","json:CucumberReport/cucumberflipkart/cucumber.json"
				 ,"junit:CucumberReport/cucumber/cucumber.xml"}
		 ,monochrome=true


		 )


public class TestRunner
{

	
}
