package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination 

{

	@Given ("^User is on LoginPage$")
	
	public static void LoginPage()
	{
		System.out.println("I am in login page");
		
	}
	
	@When("^User enters Username and Password$")
	
	public static void Credenials()
	{
		System.out.println("I am entering username and password");
		
	}
	
	
	@And("^User click on Loginbtn$")
	
	public static void loginbtn ()
	{
		System.out.println("I will click on login button");
		
	}
	
	@Then ("^User is on HomePage$")
	
	public static void Homepage ()
	{
		System.out.println("I am at homepage");
		
	}
	
	
	
	
	
	
	
	
}
