package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new EdgeDriver();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));  // used this statement for explicit wait
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/alert");
		// Alert window handling
		//Normal alert with ok button
		
	/*	driver.findElement(By.xpath("//button[@id='accept']")).click();
		Thread.sleep(5000);
		Alert myAlert=driver.switchTo().alert();
		System.out.println(myAlert.getText());           // to print the text
		myAlert.accept();
		
		// confirmation alert with ok and cancel window
		
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();      // to perform ok action
	    driver.switchTo().alert().dismiss();       // to perform cancel  
	    
	    // prompt alert
	    
	    driver.findElement(By.xpath("//button[@id='prompt']")).click();
	    Alert prompt=driver.switchTo().alert();
	    prompt.sendKeys("Hi Ilamathi");
	    Thread.sleep(5000);
	    driver.switchTo().alert().accept();*/
		
	    // interview question-- without using Switchto() command how can we handle alert window-- we can use the explicit wait
		
		driver.findElement(By.xpath("//button[@id='accept']")).click();
		Thread.sleep(5000);
		Alert myAlert=mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myAlert.getText());           
		myAlert.accept();
		

		
	}

}
