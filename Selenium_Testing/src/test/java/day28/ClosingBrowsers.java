package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClosingBrowsers {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		for(String browser:handles)
		{
			String title=driver.switchTo().window(browser).getTitle();
				if(title.equals("OrangeHRM"))	
				{
					driver.close();
				}
		}

	}

}
