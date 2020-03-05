package com.geoteric.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SisemicPage {
public WebDriver driver;
	
	public SisemicPage(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='demo-title hidden-xs']")
	private WebElement verifysisemic;

	

	public WebElement getverifysisemic() {
		return verifysisemic;
	}
}


