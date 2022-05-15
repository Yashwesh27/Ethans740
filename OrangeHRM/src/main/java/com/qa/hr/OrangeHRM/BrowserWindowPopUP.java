package com.qa.hr.OrangeHRM;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUP {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");

		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		System.out.println("page title is : "+ driver.getTitle());
		
		Set<String> handles = driver.getWindowHandles();
	
		//To fetch the parent id use this below commented  code:
		/*String parentid = driver.getWindowHandle();
		
		System.out.println(parentid);*/
		
		System.out.println(handles);
		
		Iterator<String> it = handles.iterator();
			
		String parentid = it.next();
		
		System.out.println("parent window id is : "+ parentid);
		
		String childWindowID = it.next();
		System.out.println("child window id is : "+ childWindowID );
		driver.switchTo().window(childWindowID);
		driver.close();
		String childWindow2ID = it.next();		
		System.out.println("child window id is : "+ childWindow2ID);
		driver.switchTo().window(childWindow2ID);
		driver.close();
		 String childWindow3ID = it.next();
			System.out.println("parent window id is : "+ childWindow3ID);
			driver.switchTo().window(childWindow3ID);
			driver.close();
			
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.switchTo().window(parentid);
		//driver.switchTo().activeElement();
		
		/*Actions act = new Actions(driver);
		
		WebElement Jobs= driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		act.moveToElement(Jobs).build().perform();
		
		WebElement Advanced = driver.findElement(By.xpath("//a[@title='Advanced Search']"));
		
		act.click(Advanced).build().perform();
		*/

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.close();
		
		
	}

}
