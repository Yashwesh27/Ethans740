package com.qa.dlp.SeleniumProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	
  public static void Openbrowser( WebDriver driver) throws IOException 
	
	{
	    driver.get("https://opensource-demo.orangehrmlive.com/");// calling url
		driver.manage().window().maximize();
		CommonMethods.Screenshot(driver, "C:\\Users\\HOME\\Desktop\\kushalSaree\\homepage.png");
		
	}
		
  
 @SuppressWarnings({ "restriction", "deprecation" })
public static void Username(WebDriver driver) throws IOException, AWTException
     {
	  
	  CommonMethods.Screenshot(driver, "C:\\Users\\HOME\\Desktop\\kushalSaree\\BeforeLogin.png");
		//instance of robot class
		Robot r1 = new Robot();
		
		//Virtual Keyboard
		r1.mouseMove(660, 234);
		
		r1.keyPress(KeyEvent.VK_TAB);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        r1.keyPress(KeyEvent.VK_TAB);
		
		r1.keyPress(KeyEvent.VK_CAPS_LOCK);
		r1.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		r1.keyPress(KeyEvent.VK_A);
		CommonMethods.Screenshot(driver, "C:\\Users\\HOME\\Desktop\\kushalSaree\\UserNameLogin.png");
		
		r1.keyPress(KeyEvent.VK_CAPS_LOCK);
		r1.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		r1.keyPress(KeyEvent.VK_D);
		
		r1.keyPress(KeyEvent.VK_M);
		
		r1.keyPress(KeyEvent.VK_I);
		
		r1.keyPress(KeyEvent.VK_N);
		CommonMethods.Screenshot(driver, "C:\\Users\\HOME\\Desktop\\kushalSaree\\UserName.png");
	  
  }
		
		
@SuppressWarnings("restriction")
public static void Password(WebDriver driver) throws AWTException
  {
	
		Robot r1 = new Robot();
	    r1.keyPress(KeyEvent.VK_TAB);
		r1.keyPress(KeyEvent.VK_A);
		
		r1.keyPress(KeyEvent.VK_D);
		
		r1.keyPress(KeyEvent.VK_M);
		
		r1.keyPress(KeyEvent.VK_I);
		
		r1.keyPress(KeyEvent.VK_N);
		r1.keyPress(KeyEvent.VK_1);
		r1.keyPress(KeyEvent.VK_2);
		r1.keyPress(KeyEvent.VK_3);
		r1.keyPress((KeyEvent.VK_TAB));
		r1.keyPress(KeyEvent.VK_ENTER);
		
	  
	  
  }	
	
}
		
		/*Dimension i = driver.manage().window().getSize();
		
		
		System.out.println("Size of the screen is ====>" + "     " + i);
		int x= i.getWidth();
		int y = i.getHeight();
		
		
			
		r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);	 //left click press
		r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);   //left click release
		r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);	 //left click press
		r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);   //left click release
		
		
		//Actions  = new Actions(driver);
		
		
		act.doubleClick().build().perform(); //double click mouse
		
		act.contextClick().build().perform(); //double click by mouse
		*/
		
	


