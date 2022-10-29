package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/select-menu");
		d.manage().window().maximize();
		WebElement multi = d.findElement(By.xpath("//select[@id='cars']"));
		Select s = new Select(multi);

		s.selectByValue("audi");
		s.selectByVisibleText("Volvo");
		s.selectByIndex(2);

//		Thread.sleep(3000);
//
//		s.deselectByIndex(2);

		boolean a = s.isMultiple();
		System.out.println(a);

		// getOptions()

		List<WebElement> opt = s.getOptions();
		System.out.println("All Options:\n");
		for (WebElement option : opt) {
			System.out.println(option.getText());
		}

			// getAllSelectedOptions()

			List<WebElement> Selopt = s.getAllSelectedOptions();
			System.out.println("All selected options:\n");
			for (int i = 0; i < Selopt.size(); i++) {
				System.out.println(Selopt.get(i).getText());

			}

			// getFirstSelectedOption()

			WebElement f = s.getFirstSelectedOption();
			System.out.println("First selected option:\n");
			System.out.println(f.getText());

		}

	}


