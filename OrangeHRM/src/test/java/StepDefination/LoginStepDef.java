package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef

{

	@Given("^user is on loginpage$")
	public void Loginpage() 
	{
		
		System.out.println("user is on loginpage");
		
		
	}
	
	@When("^user enters Credentials$")
	public void Credentials() 
	{
		
		System.out.println("user is on Credentials");
		
		
	}
	
	@And("^user click on LoginBtn$")
	public void LoginBtn() 
	{
		
		
		System.out.println("user is on LoginBtn");
		
	}
	
	@Then("^user is on homepage$")
	public void Homepage() 
	{
		
		System.out.println("user is on Homepage");
		
		
	}
	
	
	
	
}
