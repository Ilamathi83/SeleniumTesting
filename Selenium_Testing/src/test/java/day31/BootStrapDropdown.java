package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) {
	
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		
		// select single option
		
		driver.findElement(By.xpath("//li[normalize-space()='Appium']")).click();
		
		/** to capture all the options and find out size		 
		 * write xpath using contains keyword so that you can capture a set of similar elements
		 *  using that we can find it size and then we can print the elements using enhanced for loop
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  **/
	

	}

}
