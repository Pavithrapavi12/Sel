package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.w3schools.com/html/html_tables.asp");
		d.manage().window().maximize();
		List<WebElement> web = d.findElements(By.xpath("//table[@id='customers']/tbody/tr[6]/td[3]"));
		for(WebElement tables:web) {
			System.out.println(tables.getText());
		}
		
		
	}

}
