package com.geoteric.baseclass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClasses {

	public static WebDriver driver;

	public static WebDriver launchBrowser(String Browsername) throws Exception {
		try {
			if (Browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resource\\chromedrivereighty.exe");
				driver = new ChromeDriver();
			} else {
				throw new Exception("enter valid browser name");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	
	public static void getUrl(String url) throws Exception {
		try{
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
}
