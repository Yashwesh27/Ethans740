package com.qa.am.Amazon;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {

		//select html tag based drop downs
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		
		
	
		//Get handles of the windows
		String mainwindowhandle=driver.getWindowHandle();
		System.out.println("here is a main window id  " + mainwindowhandle );
		
		
		
		Set<String> allwindowHandles = driver.getWindowHandles();    //fetched all window ids in set
		
		System.out.println(allwindowHandles);
		
		driver.switchTo().window(mainwindowhandle);
		/*
		Iterator<String> iterator = allwindowHandles.iterator();     // one by one I am iterating it.
		
		
		
		//here will check if child window has other child windows and will fetch the heading of the child windows
		
		
		while (iterator.hasNext()) 
		
		{
		
			
		String ChildWindow = iterator.next();
		
		if(!mainwindowhandle.equalsIgnoreCase(ChildWindow))
		  {
		
			driver.switchTo().window(ChildWindow);
		
			
			System.out.println("here is a child window id  " + ChildWindow );
		
		
		  }
		
			
		}	
		
		*/
		

		driver.findElement(By.xpath("//div[@class='_8ien']")).isEnabled();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("shilpa");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("jaware");
		
		WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobile number or email address']"));
		
		mobile.sendKeys("0000000000");
		
		WebElement Pass = driver.findElement(By.xpath("//div[text()='New password']"));
		Pass.sendKeys("Class");
		
		
			
		WebElement day = driver.findElement(By.id("day"));
		day.click();
		Select select = new Select(day);
		select.selectByVisibleText("15");
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

	
		
		select.selectByIndex(5);
		select.selectByValue("9");
		
		System.out.println(select.isMultiple());
		
/*
		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);*/
		
//		
//		Select select1 = new Select(month);
//		select1.selectByVisibleText("Jun");
//		
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("1990");
		
//		selectDropDown(day, "5");
//		selectDropDown(month, "Feb");
//		selectDropDown(year, "2005");

	}
	
	/*
	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}*/


	public static void getDropDownValues(WebElement element){
		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values in drop down: "+ optionsList.size());
		for(int i=0; i<optionsList.size(); i++){
			System.out.println(optionsList.get(i).getText());
		}
	}
	
	
	public static void selectDropDown(WebElement element, String value){
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	
	public static void selectDropDown(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);
	}

}
