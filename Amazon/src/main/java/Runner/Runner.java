package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 @RunWith(Cucumber.class)
 @CucumberOptions
 (       
		 features = "G:\\GIT\\Amazon\\src\\main\\java\\Feature"
		 ,glue = {"G:\\GIT\\Amazon\\src\\main\\java\\StepDefination"}
		 ,plugin={"pretty","html:target/destination","json:target/cucumber.json"
				 ,"junit:target/cucumber/cucumber.xml"}
		 ,monochrome=true
 
 
		 )
  
public class Runner
{

}
