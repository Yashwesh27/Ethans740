package com.qa.am.Amazon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.java.swing.plaf.windows.resources.windows;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithByLocator {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		String MainWindowID =driver.getWindowHandle();
		System.out.println(MainWindowID);
		
		driver.manage().window().maximize();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		
		//driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
	 driver.getWindowHandle().getClass();
		
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
	
		
		
		
		driver.findElement(By.name("firstname")).sendKeys("bhagwan");
		
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		Iterator<String> i1= child.iterator();
		
		while(i1.hasNext())
		{
			
			String ChildWindow= i1.next();
			
			if(!MainWindowID.equalsIgnoreCase(ChildWindow))
			{
		
			driver.switchTo().window(ChildWindow);
			driver.findElement(By.name("firstname")).sendKeys("bhagwan");
			
		}
			
		}
		
		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		List<String> daysList = getDropDownValues(driver, day);
		System.out.println("total days: " + daysList.size());
		System.out.println(daysList);

		List<String> monthList = getDropDownValues(driver, month);
		System.out.println("total months: " + monthList.size());
		System.out.println(monthList);

		List<String> yearList = getDropDownValues(driver, year);
		System.out.println("total years: " + yearList.size());
		System.out.println(yearList);

	}

	public static List<String> getDropDownValues(WebDriver driver, By locator) {
		List<String> ar = new ArrayList<String>();
		ElementUtil elementUtil = new ElementUtil(driver);

		Select select = new Select(elementUtil.getElement(locator));

		List<WebElement> optionsList = select.getOptions();
		for (int i = 0; i < optionsList.size(); i++) {
			ar.add(optionsList.get(i).getText());
		}

		return ar;

	}

}
