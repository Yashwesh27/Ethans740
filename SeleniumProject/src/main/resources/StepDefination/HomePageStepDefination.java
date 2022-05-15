package StepDefination;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.dlp.SeleniumProject.HomePage;
import com.qa.dlp.SeleniumProject.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageStepDefination extends Login
{
	 static WebDriver driver;
	 
	 @Given("^userlogin$")
	 public static void AmazonLogin() throws IOException
	 	{
	 		System.out.println("user is able to login to amazon");
	 		
	 		WebDriverManager.chromedriver().setup();
	 		driver= new ChromeDriver();
	 		HomePage.Openbrowser(driver);
	 		System.out.println("Opening Browser");
	 	}

	 @When("^enter username$")
	 	public static void Username() throws IOException, AWTException
	 	{
	 	
		 HomePage.Username(driver);
	 		System.out.println("user enters username");
	 	}
	 	
	 @And("^enter password$")
	 	public static void Password() throws AWTException
	 	{
	 	
		 HomePage.Password(driver);
	 		System.out.println("user enters password");
	 	}

	 @Then("^click on loginbtn$")
	 	public static void LoginBTN()
	 	{
		 Login.Closebrowser(driver);
	 		System.out.println("user clicks on Loginbtn");
	 	}
	 	
	 	
	 }
	
	
	


