package com.qa.auto.Flipkart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{
	Login l;
	WebDriver driver;
	

	@BeforeSuite
	public void openbrowser() throws IOException 
	{
		Login.browser();
	}
	
	@BeforeClass
	public void launchapplicaiton() throws IOException
	{
		Login.Application();
	
	}
	
	@Test(priority=0,groups= {"sanity"})
	public void login() throws IOException 
	{
		
		Login.Booking();
		
		System.out.println("login");
		
	}
	
	@Test(priority =1, groups= {"sanity","regression"})
	public void login1() throws IOException 
	{
		
		Login.Booking();
		
		System.out.println("login");
		
	}

	
	@AfterClass
	public void closingapplicaiton() throws IOException 
	{
		Login.driverclose();
		System.out.println("closingapplicaiton");
		
	}
	
	@AfterSuite
	public void closingbrowser() 
	{
		
		System.out.println("closingbrowser");
		
	}
	
	
	
}
