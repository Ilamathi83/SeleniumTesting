package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
			driver.manage().window().maximize();
			driver.switchTo().frame("iframeResult");

			WebElement Field1=driver.findElement(By.xpath("//input[@id='field1']"));
			WebElement Field2=driver.findElement(By.xpath("//input[@id='field2']"));
			WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
			Field1.clear();
			Field1.sendKeys("Ilamathi");
			Actions act=new Actions(driver);
			act.doubleClick(button).perform();
			
			String text=Field2.getAttribute("value");
			System.out.println("Copied input is "+text); // output will be empty if we use get text so instead of that we are using get attribute
			// get text-- gets inner text on the web element
			//get Attribute-- gets values of an attribute
			

	}

}
