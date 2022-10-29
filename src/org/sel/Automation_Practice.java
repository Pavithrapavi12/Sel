package org.sel;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_Practice {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://automationpractice.com/index.php");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		//log IN
		
		WebElement signin=d.findElement(By.xpath("//a[contains(@title,'Log in to your')]"));
		signin.click();
		
		WebElement email=d.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("pavigreens@gmail.com");
		
		WebElement pass=d.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("@pavi1234");
		
		WebElement submit=d.findElement(By.xpath("//button[@id='SubmitLogin']"));
		submit.click();
		
		WebElement women=d.findElement(By.xpath("//a[@title='Women']"));
		Actions ac=new Actions(d);
		ac.moveToElement(women).build().perform();
		
		WebElement cdress= d.findElement(By.xpath("//a[@title='Casual Dresses']"));
		cdress.click();
		
//		WebElement click=d.findElement(By.xpath("//img[@title='Printed Dress']"));
//		click.click();
//		
//		Thread.sleep(3000);
//		
//		WebElement cart=d.findElement(By.xpath("//span[text()='Add to cart']"));
//		cart.click();
		
		WebElement click=d.findElement(By.xpath("//img[@title='Printed Dress']"));
		Actions a= new Actions(d);
		a.contextClick(click).build().perform();
		
        WebDriverWait wait= new WebDriverWait(d,30);
          wait.until(ExpectedConditions.visibilityOf(click));
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement atc=d.findElement(By.xpath("//span[text()='Add to cart']"));
		atc.click();
		
		WebElement cw=d.findElement(By.xpath("//span[@title='Close window']"));
		cw.click();
		
		Thread.sleep(3000);
		WebElement tshirts=d.findElement(By.xpath("//a[@title='T-shirts']"));
	    tshirts.click();
	    
	    WebElement click2=d.findElement(By.xpath("//img[contains(@title,'Faded Short ')]"));
	    click2.click();
	    
	    WebElement blue=d.findElement(By.xpath("//a[@class='color_pick']"));
	    blue.click();
	    
	    WebElement cart2=d.findElement(By.xpath("(//button[@type='submit'])[3]"));
		cart2.click();
		
		WebElement proceed=d.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed.click();
		
		WebElement proceed2=d.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed2.click();
		
		WebElement proceed3=d.findElement(By.xpath("//button[@name='processAddress']"));
		proceed3.click();
		
		WebElement checkbox=d.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		
		WebElement proceed4=d.findElement(By.xpath("//button[@name='processCarrier']"));
		proceed4.click();
		
		
		
		


		
		
		
		
		
		
		
		
		
		
	}

}
