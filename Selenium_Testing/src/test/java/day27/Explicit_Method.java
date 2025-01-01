package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Method {

	public static void main(String[] args) {
	
		WebDriver driver=new EdgeDriver();
		WebDriverWait waiting=new WebDriverWait(driver, Duration.ofSeconds(10));  // declaration
				
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    WebElement userid=waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	    userid.sendKeys("Admin");
		
	    WebElement password=waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
	    password.sendKeys("admin123");
	
        WebElement click= waiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
	    click.click();
	    
	    driver.quit();
	}

}
