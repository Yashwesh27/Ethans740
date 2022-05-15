package com.qa.dlp.SeleniumProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	  static WebDriver driver; //global variable
	
	public static void main(String[] args) throws IOException 
	{
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 
		Openbrowser(driver);
		Accessarios(driver);
		Account(driver);
		Closebrowser(driver);
		
	}
	
	public static void Openbrowser( WebDriver driver) throws IOException 
	
	{
		
		driver.get("https://www.amazon.in/");// calling url
		driver.manage().window().maximize();
		CommonMethods.Screenshot(driver, "C:\\Users\\HOME\\Desktop\\kushalSaree\\homepage.png");
		
	}
		

	public static void Accessarios( WebDriver driver) throws IOException 
	{
		//WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		
				//Explicit Wait
				WebDriverWait wait = new WebDriverWait(driver,20);
				
				WebElement Mobiles= (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Mobiles']")));
				Mobiles.click();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				String url1 = driver.getCurrentUrl();
				System.out.println("after click  on mobile==>" + "  "+ url1);
				WebElement LaptopAcces =driver.findElement(By.xpath("//span[contains(text(),'Laptops & Accessories')]"));
				LaptopAcces.click();
				CommonMethods.Screenshot(driver, "C:\\Users\\HOME\\Desktop\\kushalSaree\\laptop.png");
				String url2 = driver.getCurrentUrl();
				System.out.println("after click  on laptop Acceries==>" + "  "+url2);
				
	}
		
		
	
	public static void Account (WebDriver driver )
	{
		WebElement AccountList = driver.findElement(By.id("nav-link-accountList"));
		
		//action class is used to move your mouse movement 
		Actions action = new Actions(driver);
		action.moveToElement(AccountList).build().perform();
		
		
		WebElement YourAccount = driver.findElement(By.xpath("//span[contains(text(),'Your Account')]//parent::a[@class='nav-link nav-item']"));
		YourAccount.click();
		String url3 = driver.getCurrentUrl();
		System.out.println(" Your account page URL==>" + "  "+url3); 
		WebElement TopSearch =driver.findElement(By.id("twotabsearchtextbox"));
		TopSearch.sendKeys("kushal kurtis plazoo set");
		WebElement SearchButton=driver.findElement(By.id("nav-search-submit-button"));
		SearchButton.click();
		String url4 = driver.getCurrentUrl();
		System.out.println(" Kushal Kurtis URL==>" + "  "+url4); 
		WebElement dropdown= driver.findElement(By.xpath("//select[@title='Search in']"));
		
		
		
		//select class is used for selecting value by index or value or visible text from drop down
		Select s1= new Select(dropdown);
		//s1.selectByIndex(9);
		s1.selectByValue("search-alias=baby");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//clear function is used to clear the data from the element 
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		
		WebElement TopSearchBaby =driver.findElement(By.id("twotabsearchtextbox"));
		
		//sendkeys function is used to send text in a text box
		TopSearchBaby.sendKeys("Toys");
		
		
		//click function is used to click any Webelement
		WebElement SearchButtonbaby=driver.findElement(By.id("nav-search-submit-button"));
		SearchButtonbaby.click();
		
		
		/*Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_C);*/
	}
	
	
	public static void Closebrowser(WebDriver driver )
	{
		driver.close();
		 
	}
	

}
