package com.qa.hr.OrangeHRM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangehrmloginTest 

{
	@BeforeSuite
	public void openBrowser() 
	
	{
		
		System.out.println("Opening a browser");
		
	}
	
	@BeforeClass
	public void openApp()
	{
		
		System.out.println("Opening a application");
		
	}
	
	@BeforeMethod
	public void Browsercred()
	{
		
		System.out.println("Enter cred browser");
		
	}
	
	
	
	@Test(priority=1)
	public void Login()
	{
		

		System.out.println("login with user name & Password");
		
	}
	
	@Test(priority=2)
	public void Homepage()
	{
		
		System.out.println("Homepage");
		
	}
	
	
	@Test(priority=3)
	public void Payment()
	{
		
		System.out.println("Payment");
		
	}
	
	@Test(priority=4)
	public void orderconfirmation()
	{
		
		System.out.println("orderconfirmation");
		
	}
	@AfterMethod
	public void Browsercredafter()
	{
		System.out.println("browsercred after ");
		
		
	}
	

	@AfterClass
	public void CloseApp()
	{
		System.out.println("closing the app");
		
		
	}
	
	@AfterSuite
	public void CloseBrowser() 
	
	{
		
		System.out.println("closing the browser");
		
	}
	
	
		
	

}
