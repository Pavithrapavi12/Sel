package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_demo{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.get("https://demo.automationtesting.in/Frames.html");
		d.manage().window().maximize();
		
		//d.switchTo().frame(0); //switching into frame using index
		//d.switchTo().frame("SingleFrame");// using id or name
		WebElement f=d.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		d.switchTo().frame(f);
	    d.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	    d.switchTo().defaultContent();
	    
	    d.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	    
	    d.switchTo().frame(1);
	    d.switchTo().frame(0);
	    
//	    WebElement f1=d.findElement(By.xpath("//iframe[@name='MultipleFrame']"));
//		d.switchTo().frame(f1);
//		WebElement f2=d.findElement(By.xpath("//iframe[@name='SingleFrame']"));
//		d.switchTo().frame(f2);
	    d.findElement(By.xpath("//input[@type='text']")).sendKeys("Friends");
	    
	    d.switchTo().parentFrame();
	    d.switchTo().defaultContent();
		
	}

}

