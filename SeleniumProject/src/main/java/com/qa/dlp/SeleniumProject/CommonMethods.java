package com.qa.dlp.SeleniumProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonMethods
{

	//path--> C:\Users\HOME\Desktop\kushalSarees
	public static void Screenshot(WebDriver driver, String dest) throws IOException
	
	{
	
		TakesScreenshot tc =  ((TakesScreenshot) driver);
		
		
		// taking screenshot and saving in to memory in a form of file 
		File source        = tc.getScreenshotAs(OutputType.FILE); 
		
		// this is a destination path where to copy 
		File destination   = new File(dest);
		
		//this will copy from source to destination
		FileUtils.copyFile(source, destination);
		
	}
	
	
	
	
	
	
}
