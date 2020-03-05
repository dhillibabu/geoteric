package com.geoteric.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShortcutPageClose {
public WebDriver driver;
	
	public ShortcutPageClose(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@aria-hidden='true']")
	private WebElement close;

	

	public WebElement getClose() {
		return close;
	}
}