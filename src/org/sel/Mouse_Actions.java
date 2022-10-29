package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Neduncheziyan\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();

      	//toolsqa
//		d.get("https://demoqa.com/buttons");
//      d.manage().window().maximize();
		
//      	Actions s= new Actions(d);

      	  //click()
//		WebElement click= d.findElement(By.xpath("//button[text()='Click Me']"));
//        s.click(click).build().perform();
//        
      	  //doiubleclick()
//        WebElement dclick = d.findElement(By.xpath("//button[text()='Double Click Me']"));
//        s.doubleClick(dclick).build().perform();
//          
      	  //rightclick()
//        WebElement rclick= d.findElement(By.xpath("//button[text()='Right Click Me']"));
//        s.contextClick(rclick).build().perform();
		 
		
      	//nykaa
      	
      	  //moveToElement
//	    d.get("https://www.nykaa.com/?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa_NCA&gclid=Cj0KCQjw94WZBhDtARIsAKxWG-98ehdmezLPSFdA6FCpNLhjbFSZgIhr6uCfAdG2Osaw0aFOrTe3p5waAoSGEALw_wcB");
//      d.manage().window().maximize();
      	
//    	Actions s= new Actions(d);
      	

//		WebElement move= d.findElement(By.xpath("(//a[text()='skin'])[2]"));
//		s.moveToElement(move).build().perform();
      	
		
      	//toolsqa
      	  //drag and drop
//      	d.get("https://demoqa.com/droppable");
//		    d.manage().window().maximize();
//      	Actions s= new Actions(d);
//      	
//      	
//      	WebElement drag=d.findElement(By.id("draggable"));
//      	s.clickAndHold(drag).build().perform();
//      	
//      	WebElement drop=d.findElement(By.id("droppable"));
//      	
//      	s.dragAndDrop(drag, drop).build().perform();
//      	

      	//toolsqa
      	  //draggable
		
		d.get("https://demoqa.com/dragabble");
        d.manage().window().maximize();
  	    Actions s= new Actions(d);
  	    
  	    WebElement drag=d.findElement(By.xpath("//div[text()='Drag me']"));
  	    s.clickAndHold(drag).build().perform();
  	    s.moveToElement(drag,100,200).build().perform();
      	
      	
      	
		
		
	}

}
