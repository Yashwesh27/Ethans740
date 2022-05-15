package com.qa.hr.OrangeHRM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 

{
	public static WebDriver driver; //global variable
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		String ActualTitle = driver.getTitle();
		
		String ExpectTitle= "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		//Assert.assertEquals(ExpectTitle,ActualTitle);
		
		
		if (ActualTitle.equals(ExpectTitle)) 
		{
		System.out.println("Test Passed");	
		}
		else 
		{	
		System.out.println("Test Failed");
		}
		
		
		driver.manage().window().maximize();
		

	
WebElement SearchIcon = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
   SearchIcon.click();
   
  
   
		
driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7']")).click();
			
		
	/*	WebElement select = driver.findElement(By.xpath("//option[text()='Deals']"));
	
	select.click();
		*/
	
	
/*	Select dropdown= new Select(driver.findElement(By.id("searchDropdownBox")));
	
	String value="Amazon Pantry";*/
	
	

/*			
	dropdown.selectByVisibleText(value);
	//dropdown.selectByIndex(2);
*/
	
	WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

	Search.click();
	Search.sendKeys("Mobiles");
	 Screenshot(driver, "C:\\Users\\HOME\\Desktop\\SeptScreenshots\\Mobiles.png");
	 String url=  driver.getCurrentUrl();
		
		System.out.println("current URL is " + url);
		
		driver.close();

	}
	
	
	
	
	
	
	public static void Screenshot(WebDriver driver, String dest ) throws IOException 
	
   {
		TakesScreenshot tc = (TakesScreenshot) driver;
		
		File source = tc.getScreenshotAs(OutputType.FILE);
		File Destination = new File(dest);
		
		Files.copy(source, Destination);
		
		
	}
	
	
}
