package com.qa.am.Amazon;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard {

	public static void main(String[] args) throws AWTException, InterruptedException
	
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Robot r1= new Robot();
		Thread.sleep(4000);
	
		r1.keyPress(KeyEvent.VK_TAB); //keypress on tab
		r1.keyRelease(KeyEvent.VK_TAB); //keyrelease on tab
	    r1.keyPress(KeyEvent.VK_TAB); //keypress on tab
		r1.keyRelease(KeyEvent.VK_TAB); //keyrelease on tab3

		r1.keyPress(KeyEvent.VK_CAPS_LOCK);//Capslock on
		Thread.sleep(4000);
		r1.keyRelease(KeyEvent.VK_CAPS_LOCK);//Capslock on
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_A);
		r1.keyRelease(KeyEvent.VK_A);
		Thread.sleep(20000);
		r1.keyPress(KeyEvent.VK_CAPS_LOCK);//Capslock Off
		Thread.sleep(4000);
		r1.keyRelease(KeyEvent.VK_CAPS_LOCK);//Capslock Off
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_D);
		r1.keyRelease(KeyEvent.VK_D);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_M);
		r1.keyRelease(KeyEvent.VK_M);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_I);
		r1.keyRelease(KeyEvent.VK_I);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_N);
		r1.keyRelease(KeyEvent.VK_N);		
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_A);
		r1.keyRelease(KeyEvent.VK_A);
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_D);
		r1.keyRelease(KeyEvent.VK_D);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_M);
		r1.keyRelease(KeyEvent.VK_M);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_I);
		r1.keyRelease(KeyEvent.VK_I);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_N);
		r1.keyRelease(KeyEvent.VK_N);
		Thread.sleep(4000);	
		r1.keyPress(KeyEvent.VK_1);
		r1.keyRelease(KeyEvent.VK_1);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_2);
		r1.keyRelease(KeyEvent.VK_2);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_3);
		r1.keyRelease(KeyEvent.VK_3);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(20000);
		
		System.out.println("===================================");
		
		
		
		WebElement Admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		Admin.click();
		
		WebElement Add = driver.findElement(By.name("btnAdd"));
		Add.click();

		driver.switchTo().activeElement();
		
		
		Actions builders = new Actions(driver);

		WebElement userrole = driver.findElement(By.name("systemUser[userType]"));
	
		builders.moveToElement(userrole).build().perform();
		
		Select role = (Select) driver.findElement(By.id("systemUser_userType"));
		
		role.selectByIndex(0);
		
		WebElement EmpName = driver.findElement(By.id("systemUser_employeeName_empName"));
		EmpName.sendKeys("Shilpa");
		
		driver.wait(10);
		
		WebElement Username = driver.findElement(By.className("formInputText"));
		Username.sendKeys("RagShilpa");
		
		
		Select Status = (Select) driver.findElement(By.id("systemUser_status"));
		Status.selectByValue("1");
		
		WebElement password= driver.findElement(By.id("systemUser_password"));
		password.sendKeys("Kitkat@12");
		
		WebElement confirmpass= driver.findElement(By.id("systemUser_confirmPassword"));
		confirmpass.sendKeys("Kitkat@12");
		
		
		WebElement Save = driver.findElement(By.id("btnSave"));
		
		Save.click();

		driver.quit();
		
	}

}
