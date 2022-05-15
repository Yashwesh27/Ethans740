package com.qa.hr.OrangeHRM;

import java.awt.AWTException;
import java.awt.Robot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrmlogin 
{
	  static WebDriver driver;

/*
	public static void main(String[] args) throws IOException, AWTException, InterruptedException
	
	{

		
		Robot rb= new Robot();
		
		rb.createScreenCapture(null);
		
		rb.keyPress(KeyEvent.VK_SPACE);
				
		Thread.sleep(40);	
		rb.keyPress(KeyEvent.VK_SPACE);
		rb.keyRelease(KeyEvent.VK_SPACE);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_K);
		rb.keyRelease(KeyEvent.VK_K);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		rb.keyPress(KeyEvent.VK_H);
		rb.keyRelease(KeyEvent.VK_H);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		
		
		WebElement password= driver.findElement(By.id("txtPassword"));
		
		password.sendKeys("admin123");
		Login.Screenshot(driver,"/OrangeHRM/Screenshots/password.png");
		
		WebElement Login1 = driver.findElement(By.id("btnLogin"));
		
		//Login1.click();
		
		Login.Screenshot(driver,"C:\\Users\\HOME\\eclipse-workspace\\OrangeHRM\\Screenshots\\login.png");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_admin_viewAdminModule")));
		
		WebElement Admin =driver.findElement(By.id("menu_admin_viewAdminModule"));
		
		//wait.until(ExpectedConditions.visibilityOf(Admin));
				
		Actions builder = new Actions(driver);
		
		Action Adminbutton = builder.moveToElement(Admin).build();
		Adminbutton.perform();
		Login.Screenshot(driver,"C:\\Users\\HOME\\eclipse-workspace\\OrangeHRM\\Screenshots\\Adminbutton.png");
		
		WebElement UserManagement = driver.findElement(By.id("menu_admin_UserManagement"));
		Action UserMangementbutton = builder.moveToElement(UserManagement).build();
		UserMangementbutton.perform();
		Login.Screenshot(driver,"C:\\Users\\HOME\\eclipse-workspace\\OrangeHRM\\Screenshots\\UserMangementbutton.png");
		
		WebElement User = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		builder.moveToElement(User).click().build().perform();
		Login.Screenshot(driver,"User.png");
	
	}*/
	public static void Browser() 
		{

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //implicit wait
			//Thread.sleep(10);
			
			//Login.Screenshot(driver,"C:\\Users\\HOME\\eclipse-workspace\\OrangeHRM\\Screenshots\\orangehrmhome.png");
			
			WebElement username= driver.findElement(By.id("txtUsername"));

			username.sendKeys("Admin");
			
			WebElement password = driver.findElement(By.id("txtPassword"));
			password.sendKeys("admin123");
			
			WebElement loginbtn = driver.findElement(By.id("btnLogin"));
			loginbtn.click();
			
			
		}
		
	public static void LoginCall(WebDriver driver) 
		
		{ 	
		
		String Orangehrmtitle= driver.getTitle();
		System.out.println("title is ===>"+ Orangehrmtitle);
		  
		WebElement Admin =driver.findElement(By.xpath("//li[@class='main-menu-first-level-list-item']//preceding-sibling::a[@id='menu_admin_viewAdminModule']"));
		Actions builder = new Actions(driver);
		
		
		Action Adminbutton = builder.moveToElement(Admin).build();
		Adminbutton.perform();
		WebElement UserManagement = driver.findElement(By.id("menu_admin_UserManagement"));
		Action UserMangementbutton = builder.moveToElement(UserManagement).build();
		UserMangementbutton.perform();
		
		
		WebElement User = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		builder.moveToElement(User).click().build().perform();
		
		
		}
	

	public static void Close()
		{
			
			driver.close();
		}
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	

