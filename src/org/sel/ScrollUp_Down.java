package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {
	public static void main(String[] args) throws  InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.amazon.in/");
	    d.manage().window().maximize();
	    
	    JavascriptExecutor js=(JavascriptExecutor)d;
	    WebElement footwear=d.findElement(By.xpath("//span[text()='Footwear']"));
	    js.executeScript("arguments[0].scrollIntoView();",footwear);	    
	    
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,2000);");
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,-1000);");
	    
	}

}
