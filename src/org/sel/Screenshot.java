package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Screenshot
		
		TakesScreenshot a=(TakesScreenshot)driver;
		Thread.sleep(3000);
		File file= a.getScreenshotAs(OutputType.FILE);
		File f= new File("C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Screenshot\\facebook.png");
		FileUtils.copyFile(file,f);
				
	}

}
