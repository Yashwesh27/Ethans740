package com.qa.auto.Flipkart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader 

{
	Properties properties;
	
	public static void ConfigFileReader() throws IOException
	{
		
		
	BufferedReader reader = new BufferedReader(new FileReader("/Flipkart/Config/Configration.properties"));
	
	Properties prop = new Properties();
	
	prop.load(reader);
	
	String usernme= prop.getProperty("UserName");
	
	System.out.println(usernme);

		
	}

	public long getImplicitlyWait() {
		
		String driverpath = properties.getProperty("driver path");
		
		String url = properties.getProperty("URL");
		
		return 0;
	}

}
