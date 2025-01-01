package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement Windows=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle'][normalize-space()='Desktops']"));
		WebElement Mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		act.moveToElement(Windows).moveToElement(Mac).click().perform();

		
	

	}

}
