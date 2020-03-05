package com.geoteric.utils;


import org.openqa.selenium.WebDriver;

import com.geoteric.pagelocators.ShortcutPageClose;
import com.geoteric.pagelocators.SisemicPage;

public class PageObjectManager {
public WebDriver driver;
	
	public PageObjectManager(WebDriver Idriver)
	{
		this.driver=Idriver;
			}
	
	private ShortcutPageClose svp;
	private SisemicPage sp;
	
	
	public ShortcutPageClose getSvp() {
		if(svp==null)
		{
			svp=new ShortcutPageClose(driver);
		}
		return svp;
	}
	public SisemicPage getSp() {
		if(sp==null)
		{
			sp=new SisemicPage(driver);
		}
		return sp;
	}
}
