package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Implicit_Methods {

	public static void main(String[] args) {
	
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click(); 
		 System.out.println(driver.getWindowHandles());

	}

}
