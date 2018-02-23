package com.pro.test;

import org.testng.annotations.Test;

import com.pro.methods.MainMenu;
import com.pro.methods.OpenBrowser;
import com.pro.methods.StringManipulation;
import com.pro.methods.readFile;

public class SmokeTest extends OpenBrowser {
	
	
	StringManipulation sm;
	MainMenu wb;
	readFile rf;
	
	
	
	

	@Test
	public void m1() {
		sm = new StringManipulation();
		sm.reverseEverything("hope you are doing well");
	}
	
	@Test
	public void m2() {
		OpnBrowser();
		wb = new MainMenu(driver);
		wb.fetchItems();
		System.out.println("*********************");
		wb.fetchItemsAndServings();
		
	}
	
	@Test
	public void m3()    {
		rf = new readFile();
		rf.doesFileExist("Dictionary.txt");
		rf.FileRead("Dictionary.txt");
		
	}

}
