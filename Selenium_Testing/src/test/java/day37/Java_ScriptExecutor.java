package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Java_ScriptExecutor {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.nopcommerce.com/register");
	driver.manage().window().maximize();
	
	// send keys using Java script executor
	JavascriptExecutor execute=(JavascriptExecutor) driver;
	WebElement input=driver.findElement(By.xpath("//input[@id='FirstName']"));
	execute.executeScript("arguments[0].setAttribute('value','Ilamathi')",input);
	
    // click using java script executor
	WebElement button=driver.findElement(By.xpath("//input[@id='gender-female']"));
	execute.executeScript("arguments[0].click()", button);
	
	// scroll down by pixel
	execute.executeScript("window.scrollBy(0,1000)","");
	
	
	
	
	
	
	}

}
