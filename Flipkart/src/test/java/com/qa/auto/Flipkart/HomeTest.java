package com.qa.auto.Flipkart;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeTest

{
	Home H1;
	
	
	@BeforeSuite
	public void openbrowsers() throws IOException 
	{
		
		
		Home.browser();
	}
	
	
	@Test(priority=1)
	public void BUSHIRELOGIC() throws IOException, InterruptedException 
	{
		
		
		Home.BUSHIRE();
		
		System.out.println("BUSHIRELOGIC");
		
	}
	
	@Test(priority=2)
	public void TRIPLOGIC() throws IOException 
	{
		
		Home.Trip();
		
		System.out.println("TRIPLOGIC");
		
	}
	
	@AfterSuite
	public void closingapplicaiton() throws IOException 
	{
		Login.driverclose();
		System.out.println("closingapplicaiton");
		
	}
	
	
	
	
	

}
