package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver_Methods_GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		
		//get(url)
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		// get(title)
		
	    System.out.println(driver.getTitle());
	     
	    //get (current URL)
	     
	   System.out.println(driver.getCurrentUrl());
	   
	   //get (pageSource)
	   
	 // System.out.println(driver.getPageSource());
	  
	  // getWindowHandle-- single browser window
	  
	 // System.out.println(driver.getWindowHandle());
	  
	  //Get WindowHandles--multiple browser window 
	   
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // Thread.sleep(5000);-- using this wait method to get the output else it will show the exception
	  System.out.println(driver.getWindowHandles());
	  
	 // driver.quit();-- close all the window
     //driver.close();-- close only one active window where driver is focused
	}

}
