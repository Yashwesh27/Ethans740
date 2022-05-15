package com.qa.hr.OrangeHRM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrowserTest 
{
	

	@BeforeSuite
	public void BrowserLaunch() 
	{	
		System.out.println("Server check Started...Its On-- Go Ahead");
		System.out.println("Launcing the browser");	
			
	}
		
	@BeforeClass
	public void LaunchApplicaiton()
	{
		
		System.out.println("Lunching the applicaiton");
		
	}
	
	@Test(priority=1)
	public void Login() 
	{
	
		System.out.println("Succesful login");
		
		
	}
	
	@Test(priority=2)
	public void SelectItem() 
	{
	
		System.out.println("SelectItem is selected");
		
		
	}
	
	@Test(priority=3)
	public void AddCart() 
	{
	
		System.out.println("SelectItem is added to cart");
		
		
	}
	
	@Test(priority=4)
	public void Checkout() 
	{
	
		System.out.println("Payment is successfully done");
		
		
	}
	
	
	@AfterClass	
	public void CloseApplicaiton()
	{
		
		System.out.println("Closing the applicaiton");
		
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		
		System.out.println("Closing the Browser");
		System.out.println("Server check Started...Its Off Now============Go to Holiday");
		
	}

	
	
	
	
	
}
