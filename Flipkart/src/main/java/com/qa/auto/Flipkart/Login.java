package com.qa.auto.Flipkart;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {


	static WebDriver driver;
	
	
		
	
	public static void  browser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("openbrowser");	
		
	}	
	
	public static void  Application() throws IOException 
	{
			driver.get("https://www.redbus.in/");
		
		String abc = "C:\\Users\\HOME\\Desktop\\JulyScreenshot\\home.png";
		
		Screenshot(driver,abc);	
	}
	
	public static void  Booking() throws IOException 
	{
		String ActualTitle= driver.getTitle();
		System.out.println("Actual title-->  " +  ActualTitle);		
		
       String ExpectedTitle= "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India";
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		//assertNotNull()==>To Verify if the title of the page is null or empty
		
		Assert.assertNotNull(ActualTitle);
		
		
		boolean verifytitleispresent = driver.getTitle().equalsIgnoreCase("Book Bus Travels");
		
		Assert.assertTrue(verifytitleispresent);
		
		
		
		if (ActualTitle .equals(ExpectedTitle))
		{
			
		System.out.println("Pass");
		}
		else 
		{ 
		
		System.out.println("Fail");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Source =driver.findElement(By.xpath("//input[@id='src']"));
		
		Screenshot(driver,"C:\\Users\\HOME\\Desktop\\JulyScreenshot\\srcclick.png");
		Source.sendKeys("PUNE");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // this will wait for 10 seconds, no matter element is loaded or not
		
		WebElement Src= driver.findElement(By.xpath("//li[@data-id='85482']"));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(Src);
		action.click().build().perform();
		Screenshot(driver,"C:\\Users\\HOME\\Desktop\\JulyScreenshot\\sourceplace.png");
		WebElement Destination = driver.findElement(By.xpath("//input[@id='dest']"));
		
		Destination.sendKeys("MUMBAI");
		 String dest =Destination.getText();
		 System.out.println(dest);
		 
		 Assert.assertEquals("MUMBAI", dest);
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement City = driver.findElement(By.xpath("//li[@data-id='66545']"));
		
		action.moveToElement(City);
		action.click().build().perform();
		Screenshot(driver,"C:\\Users\\HOME\\Desktop\\JulyScreenshot\\destplace.png");
		
		
		WebElement Date= driver.findElement(By.xpath("//input[@id='onward_cal']"));
		Date.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Calendar = driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//preceding-sibling::tr//preceding-sibling::td[text()='27']"));
		Calendar.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Search= driver.findElement(By.xpath("//button[@id='search_btn']"));
		Search.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		String CurrentURL=driver.getCurrentUrl();
		
		System.out.println("my current url of app is " + CurrentURL);
		
	}
	
	
	public static void driverclose() throws IOException
	{
		
		Screenshot(driver, "C:\\Users\\HOME\\Desktop\\Oct\\driverclose.png");
		
		driver.close();
		
		
	}
	
	
	
	public static void Screenshot(WebDriver driver,String dest) throws IOException 
	
	{
		
		TakesScreenshot tc = ((TakesScreenshot) driver);
		
		
		File source = tc.getScreenshotAs(OutputType.FILE);
		
		
		File destination = new File(dest);
		
		
		FileUtils.copyFile(source, destination);
		
		
	}
	

	

}
