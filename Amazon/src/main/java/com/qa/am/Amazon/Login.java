package com.qa.am.Amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends BasePage {

	
	static BasePage BP; //object of a class
	
	public static void main(String[] args) throws IOException 
	{
		
		Loginamazon();
	
		
	}
	
	
	public static void Loginamazon() throws IOException 
	
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		
		
		BP.Screenshot(driver,"C:\\Users\\HOME\\Desktop\\Amazon\\account.png");
		

	}
	
	
	
	
	}


