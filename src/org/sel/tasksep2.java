package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tasksep2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println("Title of Flipkart:\t"+driver.getTitle());
		System.out.println("Url of Flipkart:\t"+driver.getCurrentUrl());
	    Thread.sleep(3000);//to slow the process
		driver.navigate().back();
		System.out.println("Title of Amazon:\t"+driver.getTitle());
		System.out.println("Url of Amazon:\t"+driver.getCurrentUrl());
		String p = driver.getPageSource();
		System.out.println(p);
		driver.navigate().forward();
		driver.navigate().to("https://www.facebook.com/login/");
		System.out.println("Title of facebook:\t"+driver.getTitle());
		System.out.println("Url of facebook:\t"+driver.getCurrentUrl());
		driver.navigate().refresh();
		
	}

}
