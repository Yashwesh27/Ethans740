package com.qa.am.Amazon;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BasePage
{
public static WebDriver driver;

	@BeforeClass
	public void InCorrectUser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of a page is " + title);		
		
	}
	
	@Test
	public void CorrectUser()
	{
		WebElement Account=  driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Account).build();
		builder.perform();
		System.out.println("Mouse Hover at account");
		//Screenshot(driver,"C:\\Users\\HOME\\Desktop\\Amazon\\Action.png");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().activeElement(); //moving to another default element
				
		driver.findElement(By.xpath("//div[@id='nav-xshop']//preceding-sibling::a[text()='Customer Service']")).click();	
		//Screenshot(driver, "C:\\Users\\HOME\\Desktop\\Amazon\\Cleaning essentials.png");		
		String title1 = driver.getTitle();
		System.out.println("Title of a page is " + title1);
		JavascriptExecutor j1= (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,900)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement SearchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchBox.sendKeys("mobiles");
	    //Screenshot(driver,"C:\\Users\\HOME\\Desktop\\Amazon\\mobiles.png");
		//Thread.sleep(10);
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='nav-search-submit-button']")));
		WebElement SearchButton= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		//Screenshot(driver,"C:\\Users\\HOME\\Desktop\\Amazon\\SearchButton.png");
		SearchButton.click();	
		
		
		
	 }
	@AfterClass
	public void closeBrowser()
	{
	driver.close();
	}
	
	
}
	
