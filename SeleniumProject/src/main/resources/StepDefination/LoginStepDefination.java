package StepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.dlp.SeleniumProject.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefination extends Login
{
	  static WebDriver driver;
	
	
@Given("user is on login page$")
public static void AmazonLogin() throws IOException
	{
		System.out.println("user is able to login to amazon");
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		 Login.Openbrowser(driver);
		System.out.println("Opening Browser");
	}

@When("^user enter username$")
	public static void Username() throws IOException
	{
	
	Login.Accessarios(driver);
		System.out.println("user enters username");
	}
	
@And("^user enter password$")
	public static void Password()
	{
	Login.Account(driver);
		System.out.println("user enters password");
	}

@Then("^user click on loginbtn$")
	public static void LoginBTN()
	{
	Login.Closebrowser(driver);
		System.out.println("user clicks on Loginbtn");
	}
	
	
}
