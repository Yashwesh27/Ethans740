package com.qa.auto.Flipkart;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ReporterConfig.Property;

import com.sun.glass.ui.Window;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Home

{
	
	static WebDriver driver;

	static ConfigFileReader ConfigFileReader;

	
	public static void  browser() 
	{
		
		ConfigFileReader = new ConfigFileReader();
		
		driver.manage().timeouts().implicitlyWait(ConfigFileReader.getImplicitlyWait(),TimeUnit.SECONDS);
		// System.setProperty("webdriver.chromedriver", "path of chomedriver.exe")
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		System.out.println("openbrowser");	
		
		
		
	}	
	
	
	public static void BUSHIRE() throws InterruptedException, IOException 
	
	{
		
		Properties prop = new Properties();
		FileInputStream f1= new FileInputStream("/Flipkart/Config/Configration.properties");
		prop.load(f1);
	
		driver.findElement(By.xpath("")).sendKeys("admin123");
		
		String pwd = prop.getProperty("Password");
		
		driver.findElement(By.name("")).sendKeys(prop.getProperty("Password"));
		
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@title='redBus Bus Hire']")).click();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		String windowid= driver.getWindowHandle();
		
		System.out.println(windowid);
		
		driver.switchTo().window(windowid);
		
		
		
		WebElement outstation = driver.findElement(By.xpath("//div[text()='Outstation']//parent::div[@class='OutstationComponent__textcont___1ryxB']//parent::div[@class='OutstationComponent__container___17PTB']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(outstation).click().build().perform();
		
	
		
		
	}
	
	public static void Trip()
	{
		
	WebElement PICKUP= 	driver.findElement(By.xpath("//input[@id='locationTextFieldLocal']"));		
		
	PICKUP.sendKeys("Pune");
	
	WebElement 	DESTINATION= driver.findElement(By.xpath("//input[@id='local_dest_name']"));
	DESTINATION.sendKeys("AURANGABAD");
	
	}
	
	
	
	


}
