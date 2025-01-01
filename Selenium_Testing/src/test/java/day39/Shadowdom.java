package day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Shadowdom {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://practice.expandtesting.com/shadowdom");
	driver.manage().window().maximize();
	
	SearchContext shadow = driver.findElement(By.cssSelector("#shadow-host")).getShadowRoot();
	Thread.sleep(1000);
	String TextElement = shadow.findElement(By.cssSelector("#my-btn")).getText();
	System.out.println(TextElement);
	
	
	
	}

}
