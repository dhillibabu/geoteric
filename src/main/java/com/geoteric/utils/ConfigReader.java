package com.geoteric.utils;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	public Properties pr= new Properties();
		
		public ConfigReader() throws Exception {		
		
		try {
				File propfile= new File(System.getProperty("user.dir") + "\\src\\test\\resource\\com\\geoteric\\properties\\Config.properties");	
				FileInputStream fis = new FileInputStream(propfile);
				pr.load(fis);
			} catch (Exception e) {
		
				e.printStackTrace();
				throw new Exception();
		
			}
		}
		
		public String getBrowsername() throws Exception
		{
			String browser = pr.getProperty("browsername");
			if(browser==null) {
				throw new Exception("Enter a valid browser name");
			}
			return browser; 
		}
		
		public String getUrl() throws Exception
		{
			String url = pr.getProperty("url");
			if(url==null) {
				throw new Exception("Enter valid URL");
			}
			return url;
		}
	}




