package com.pro.methods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainMenu extends OpenBrowser{
	
	private WebDriver driver ; 
	
		
	public MainMenu(WebDriver driver) {
		this.driver = driver;
	}


	public void fetchItems() {
		
		driver.get("//Desktop//Testing.html");
		String item1 = driver.findElement(By.xpath("//div[@class='â€itemContentâ€']/span[5]")).getText();
		String item2 = driver.findElement(By.xpath("//div[@class='â€itemContentâ€']/span[9]")).getText();
		System.out.println(item1);
		System.out.println(item2);
		
		
		
		
	}
	
	public void fetchItemsAndServings() {
		
		driver.get("/Desktop/Testing.html");
		int elements =driver.findElements(By.xpath("//div[@class='â€itemContentâ€']/span")).size();
		Map<String, String> objMap = new HashMap<String, String>();
		for (int i = 1; i<=elements; i+=2) {
			String item1 = driver.findElement(By.xpath("//div[@class='â€itemContentâ€']/span["+i+"]")).getText();
			for (int j = i+1; j<=elements;) {
				String serving1 = driver.findElement(By.xpath("//div[@class='â€itemContentâ€']/span["+j+"]")).getText();
				objMap.put(item1, serving1);
				//System.out.println(objMap);
				break;
				
				
			}
		
		}
		Iterator<Entry<String, String>> k = objMap.entrySet().iterator();
		while(k.hasNext()) {
			Entry<String, String> e = k.next();
			System.out.println(e.getKey() +" "+ e.getValue());
		
			
			
		}
		
		
	}

}
