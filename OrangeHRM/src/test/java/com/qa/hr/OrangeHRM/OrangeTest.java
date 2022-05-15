package com.qa.hr.OrangeHRM;

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



public class OrangeTest
{

	
    Orangehrmlogin Orange;
	WebDriver driver;

    @BeforeSuite
	public void  Browsermethod()  
	
	{
		Orangehrmlogin.Browser();
		
	}
	
	@Test
	public void Loginmethod() 
	
	{
	
		Orangehrmlogin.LoginCall(driver);
		
		
	}
	

	@AfterSuite
	public void  Closebrowsermethod() 
	
	{
		Orangehrmlogin.Close();
	
	}

}
	
	
	
	
	
	
	
	
	
	
	
	



