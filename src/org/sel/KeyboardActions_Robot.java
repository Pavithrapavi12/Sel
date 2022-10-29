package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_Robot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
//		d.get("https://www.amazon.in/");
//		d.manage().window().maximize();
//		
//		Actions s= new Actions(d);
//		
//		WebElement best= d.findElement(By.xpath("//a[text()='Best Sellers']"));
//		s.contextClick(best).build().perform();
//		
//		Robot r= new Robot();
//
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		Thread.sleep(5000);
//		
//        r.keyPress(KeyEvent.VK_WINDOWS);
//        r.keyPress(KeyEvent.VK_PRINTSCREEN);
//        
//        r.keyRelease(KeyEvent.VK_WINDOWS);
//        r.keyRelease(KeyEvent.VK_PRINTSCREEN);
		
		d.get("https://www.calculator.net/");
		d.manage().window().maximize();
		
		WebElement calci=d.findElement(By.id("sciOutPut"));
		calci.click();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_2);
				
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);
		
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);

		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);



		
		
		
		
		
		
	}

}
