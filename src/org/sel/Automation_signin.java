package org.sel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_signin {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
			WebDriver d= new ChromeDriver();
			d.get("http://automationpractice.com/index.php");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			//SIGN IN
			
			WebElement signin=d.findElement(By.xpath("//a[contains(@title,'Log in to your')]"));
			signin.click();
			
			d.findElement(By.id("email_create")).sendKeys("pavigreens@gmail.com");
			d.findElement(By.id("SubmitCreate")).click();
			
			Thread.sleep(4000);			
			
//			WebElement title=d.findElement(By.xpath("//input[@id='id_gender2']"));
//			title.click();
//			
//			Thread.sleep(4000);
			
			WebElement fname=d.findElement(By.xpath("//input[@id='customer_firstname']"));
			fname.sendKeys("Pavithra");
			
			WebElement lname=d.findElement(By.xpath("//input[@id='customer_lastname']"));
			lname.sendKeys("N");
			
			WebElement pass=d.findElement(By.xpath("//input[@id='passwd']"));
			pass.sendKeys("@pavi1234");
			
			WebElement days=d.findElement(By.xpath("//select[@id='days']"));
			Select s= new Select(days);
			s.selectByValue("7");
			
			WebElement months=d.findElement(By.xpath("//select[@id='months']"));
			Select s1= new Select(months);
			s1.selectByValue("9");
			
			WebElement years=d.findElement(By.xpath("//select[@id='years']"));
			Select s2= new Select(years);
			s2.selectByValue("2000");
			
			d.findElement(By.id("optin")).click();
						
			WebElement address=d.findElement(By.id("address1"));
			address.sendKeys("12/34,7th street,savaloin city");
			
			WebElement city=d.findElement(By.id("city"));
			city.sendKeys("savaloin");
			
			WebElement state= d.findElement(By.id("id_state"));
			Select s3= new Select(state);
			s3.selectByVisibleText("Hawaii");
			
			WebElement pin = d.findElement(By.id("postcode"));
			pin.sendKeys("00098");
			
			WebElement country=d.findElement(By.id("id_country"));
			Select s4 = new Select(country);
			s4.selectByVisibleText("United States");
			
			d.findElement(By.name("phone_mobile")).sendKeys("9765325789");
			
			d.findElement(By.name("alias")).sendKeys("3/20,venisha road");
			
			d.findElement(By.id("submitAccount")).click();
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
