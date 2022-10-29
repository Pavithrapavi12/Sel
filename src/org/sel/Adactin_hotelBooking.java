package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_hotelBooking {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://adactinhotelapp.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("Kavithapriya");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("Kavitha1234");
		d.findElement(By.xpath("//input[@class='login_button']")).click();
		
		WebElement location=d.findElement(By.xpath("//select[@name='location']"));
		Select s= new Select(location);
		s.selectByVisibleText("New York");
		
		WebElement Hotel=d.findElement(By.xpath("//select[@name='hotels']"));
		Select s1= new Select(Hotel);
		s1.selectByValue("Hotel Sunshine");	
		
		WebElement roomtype=d.findElement(By.xpath("//select[@name='room_type']"));
		Select s2=new Select(roomtype);
		s2.selectByIndex(2);
		
		WebElement roomnos=d.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3=new Select(roomnos);
		s3.selectByIndex(2);
		
		Thread.sleep(3000);
		
		WebElement datein=d.findElement(By.xpath("(//input[@type='text'])[2]"));
		datein.clear();
		datein.sendKeys("12/05/2020");
		
		Thread.sleep(3000);
		
		WebElement dateout = d.findElement(By.xpath("(//input[@type='text'])[3]"));
		dateout.clear();
		dateout.sendKeys("16/05/2020");
		
		WebElement adultroom=d.findElement(By.id("adult_room"));
		Select s4=new Select(adultroom);
		s4.selectByValue("4");
		
		WebElement childroom=d.findElement(By.id("child_room"));
		Select s5=new Select(childroom);
		s5.selectByIndex(1);
		
		d.findElement(By.xpath("//input[@name='Submit']")).click();
		
		d.findElement(By.name("radiobutton_0")).click();
		
		d.findElement(By.name("continue")).click();
		
		WebElement firstname=d.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("Kavitha");
		
		WebElement lastname=d.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("priya");
		
		WebElement address = d.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("12/100,venisha apartments,Salion Street,philips road,new york");
		
		WebElement Creditno= d.findElement(By.xpath("//input[@name='cc_num']"));
		Creditno.sendKeys("1987456232320909");
		
		WebElement cardtype= d.findElement(By.id("cc_type"));
		Select s6=new Select(cardtype);
		s6.selectByVisibleText("Master Card");
		
		WebElement expmonth= d.findElement(By.id("cc_exp_month"));
		Select s7=new Select(expmonth);
		s7.selectByVisibleText("April");
		
		WebElement expyear= d.findElement(By.id("cc_exp_year"));
		Select s8=new Select(expyear);
		s8.selectByVisibleText("2022");

		WebElement cvv=d.findElement(By.xpath("(//input[@class='reg_input'])[4]"));
	    cvv.sendKeys("141");
	    
	    d.findElement(By.id("book_now")).click();
	    
	    d.findElement(By.name("logout")).click();
	    
	    Thread.sleep(5000);
		
	 	TakesScreenshot ss= (TakesScreenshot)d;
		File scr=ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Screenshot\\Adactin.png");
		FileUtils.copyFile(scr, dest);
		
		JavascriptExecutor js= (JavascriptExecutor)d;
		WebElement j=d.findElement(By.xpath("//input[@value='Hotel Sunshine']"));
		js.executeScript("arguments[0].scrollIntoView();",j);	
		
		TakesScreenshot ss1= (TakesScreenshot)d;
		File scr1=ss.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Screenshot\\Adactin1.png");
		FileUtils.copyFile(scr1, dest1);
		
		
		
		
		
		

	}

}
