package com.qa.dlp.SeleniumProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends Login
{
	   WebDriver driver; //global variable
	   
	@BeforeSuite
	public  void OpenBrowser( ) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		 Login.Openbrowser(driver);
		System.out.println("Opening Browser");
		
	}
	
	@BeforeClass
	public  void OpenApplicaiton() throws IOException
	{

		System.out.println("Opening Application");
		
	}
	

	@Test(priority=1)
	public void Electronics() throws IOException
	{		
		Login.Accessarios(driver);
		System.out.println("Search Item ");
		
	}
	
	@Test(priority=2)
	public  void AccountDetails()
	{
		Login.Account(driver);
		System.out.println("Adding Item to Addtocart");
		
	}
	
		
	@AfterClass
	public  void Closingapp()
	{
		
		System.out.println("closing application");
		
	}
	
	@AfterSuite
	public  void CloseBrowser()
	{
		Login.Closebrowser(driver);
		System.out.println("closing the Browser");
		
	}
	
	
	
}
