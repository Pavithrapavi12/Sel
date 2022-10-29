package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown_xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement newaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newaccount.click();
		
		Thread.sleep(3000);
	
		WebElement firstname=driver.findElement(By.xpath("//input[@aria-label='First name']"));
		firstname.sendKeys("Pavithra");
		
		Thread.sleep(3000);
		
	    WebElement surname= driver.findElement(By.xpath("//input[@aria-label='Surname']"));
	    surname.sendKeys("N");
	    
	    WebElement mob=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
	    mob.sendKeys("9086433368");
	    
	    WebElement password=driver.findElement(By.xpath("//input[@aria-label='New password']"));
	    password.sendKeys("@pavikutty");
	    
	    WebElement date= driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    Select s= new Select(date);
	    s.selectByIndex(11);
	    
	    WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1= new Select(month);
		s1.selectByVisibleText("Jan");
		
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2=new Select(year);
		s2.selectByValue("2002");
		
		WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		
		WebElement signup=driver.findElement(By.xpath("//button[text()='Sign Up']"));
		signup.click();
		
		
		
	}

}
