package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNG_Sample {
	WebDriver driver;
	
	@Test(priority=1)
	void opensite()
	{
	driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	}

	@Test(priority=3)
	void enter()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	@Test(priority=2)
	void tag() throws InterruptedException
	{
		Thread.sleep(5000);
		Boolean tag=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Test passed "+tag);
	}
	@Test(priority=10)
	void close() throws InterruptedException {
		driver.quit();
	}
}
