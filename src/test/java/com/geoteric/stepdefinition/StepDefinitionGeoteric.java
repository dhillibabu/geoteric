package com.geoteric.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.geoteric.baseclass.BaseClasses;
import com.geoteric.testrunner.TestRunnerGeoteric;
import com.geoteric.utils.FileReaderManager;
import com.geoteric.utils.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionGeoteric extends BaseClasses {
	
	public static WebDriver driver = TestRunnerGeoteric.driver;	 
	public static PageObjectManager geo = new PageObjectManager(driver);

	
	@Given("^User launch the Inventor remote view application$")
	public void user_launch_the_Inventor_remote_view_application() throws Throwable {
		String url = FileReaderManager.frm.getConfigReader().getUrl();
		getUrl(url);
		Thread.sleep(3000);
	}

	@Given("^user click close button on the shortcut viewing mode page$")
	public void user_click_close_button_on_the_shortcut_viewing_mode_page() throws Throwable {
	       WebElement close = geo.getSvp().getClose();
	       close.click();	     
	}

	@Given("^user should get a sisemic volume page$")
	public void user_should_get_a_sisemic_volume_page() throws Throwable {
	       String verifypage = geo.getSp().getverifysisemic().getText();
	       System.out.println(verifypage);
	       Assert.assertEquals("Seismic Volume", verifypage);
	}

	@When("^user rotate the image to (\\d+),(\\d+)$")
	public void user_rotate_the_image_to(int arg1, int arg2) throws Throwable {
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       Screen s = new Screen();
	       Pattern pattern = new Pattern("C:\\Users\\Dhilli\\Desktop\\geo");
	       Pattern pattern1 = new Pattern("C:\\Users\\Dhilli\\Desktop\\geodrop");
	       
	       s.wait(pattern,5000);
	       s.dragDrop(pattern, pattern1);
	     
	}

	@Then("^user should get the sisemic data$")
	public void user_should_get_the_sisemic_data() throws Throwable {
	       
	     
	}



}
