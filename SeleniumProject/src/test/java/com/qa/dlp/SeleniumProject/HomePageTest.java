package com.qa.dlp.SeleniumProject;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePageTest 

{
	
	@BeforeSuite
	public  void OpenBrowser( ) throws IOException
	{
		
		System.out.println("Opening Browser");
		
	}
	
	@BeforeClass
	public  void OpenApplicaiton() throws IOException
	{

		System.out.println("Opening Application");
		
	}
	

	@Test(priority=1)
	public void Add() throws IOException
	{		
	
		System.out.println("Search Item ");
		
	}
	
	@Test(priority=2)
	public  void Remove()
	{
		
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
		
		System.out.println("closing the Browser");
		
	}
	
	
	
	
	

}
