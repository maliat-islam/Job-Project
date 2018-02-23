package com.pro.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	
 public WebDriver driver ; 
	
	
	public void OpnBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anwar Hossain\\Desktop\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}

}
