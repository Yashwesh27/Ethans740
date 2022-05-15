package com.qa.am.Amazon;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.google.common.io.Files;

public class BasePage 
{
 
	public static void main(String[] args) throws IOException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	}

	public static void cleaning(WebDriver driver) throws IOException
	{
		
		//WebElement frame = driver.findElement(By.xpath("//iframe[@title='Adobe ID Syncing iFrame']"));
		//driver.switchTo().frame(frame);
		
		//driver.switchTo().frame("NAME OF A FRAME");
		
		//WebElement NRI=driver.findElement(By.xpath("//ul[@class='nav navbar-nav lp-navbar-advanced-root normal-main-header']//preceding-sibling::a[text()='NRI']"));
		//NRI.click();
		
		//driver.findElement(By.xpath("//li[@class='level-1 sub-section-5 dropdown megamenu-fw']//preceding-sibling::a[@title='Pay']")).click();
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[1]/ul/li[1]/a/span")).click();
		//driver.findElement(By.xpath("//a[text()='MobileBanking']")).click();
	
		
	}
		//Methods for screenshot
		//take screenshot in specific format and save in a file
		//file can be copied to another location
	
	public static void Screenshot(WebDriver driver, String dest ) throws IOException 
	{
	
		TakesScreenshot tc= ((TakesScreenshot) driver);
		
		File source = tc.getScreenshotAs(OutputType.FILE);
		
		File destination = new File(dest);
		
		Files.copy(source,destination);
		
	}

}
