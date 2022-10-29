package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement w = driver.findElement(By.name("username"));
		w.sendKeys("9179865770");
		
		WebElement w1= driver.findElement(By.name("password"));
		w1.sendKeys("@Pavithra12");
		
		WebElement log = driver.findElement(By.xpath("//div[text()='Log In']"));
		log.click();
	}

}
