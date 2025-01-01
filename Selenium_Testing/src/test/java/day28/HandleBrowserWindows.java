package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
	  List<String> elements=new ArrayList(handles);
	   
	  String parent=elements.get(0);
	  String child=elements.get(1);
	  
	  driver.switchTo().window(child);
	  System.out.println(driver.getTitle());
	  
	  driver.switchTo().window(parent);
	  System.out.println(driver.getTitle());
	  
	  for(String element:handles)
	  {
		  String title=driver.switchTo().window(element).getTitle();
		  if(title.equals("OrangeHRM"))
		  {
			  System.out.println(driver.getCurrentUrl());
		  }

	  }
		

	}

}
