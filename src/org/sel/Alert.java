package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		
//	    d.findElement(By.id("alertButton")).click();
//	    Thread.sleep(3000);
//	    d.switchTo().alert().accept();
	    
//	    d.findElement(By.id("confirmButton")).click();
//	    Thread.sleep(2000);
//	    d.switchTo().alert().dismiss();
	    
	   WebElement prompt= d.findElement(By.id("promtButton"));
	   prompt.click();
	   d.switchTo().alert().sendKeys("hello");
	    
	    
		
	}

}
