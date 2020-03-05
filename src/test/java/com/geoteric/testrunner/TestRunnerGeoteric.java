package com.geoteric.testrunner;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.geoteric.baseclass.BaseClasses;
import com.geoteric.utils.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


		@RunWith(Cucumber.class)
		@CucumberOptions(
				features = "src\\test\\java\\com\\geoteric\\featurefile\\Geoteric.feature",
	            glue =   {"com.geoteric.stepdefinition"},
	            strict=true,
	            monochrome=true,
	            dryRun=false)

		public class TestRunnerGeoteric extends BaseClasses {

			public static WebDriver driver;

			@BeforeClass
			public static void SetupIntialization() throws Exception 
			{
				String browsername = FileReaderManager.frm.getConfigReader().getBrowsername();
				driver=launchBrowser(browsername);
			}

		}
