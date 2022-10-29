package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Registration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://adactinhotelapp.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		
		Thread.sleep(3000);
		
        d.findElement(By.name("username")).sendKeys("Kavithapriya");
        d.findElement(By.name("password")).sendKeys("Kavitha1234");
        d.findElement(By.name("re_password")).sendKeys("Kavitha1234");
        d.findElement(By.name("full_name")).sendKeys("Kavitha");
        d.findElement(By.id("email_add")).sendKeys("pavithrachezhiyan12@gmail.com");
        Thread.sleep(10000);
        d.findElement(By.name("tnc_box")).click();
        Thread.sleep(3000);
        d.findElement(By.xpath("//input[@name='Submit']")).click();

	}

}
