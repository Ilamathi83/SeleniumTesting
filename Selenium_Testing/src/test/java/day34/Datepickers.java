package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Datepickers {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	
	// switch to iframe
	
	driver.switchTo().frame(0);
	String year="2025";
	String month="June";
	String date="8";
	
	// 1. select date using sendkeys
	//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/08/2025");
	
	// 2. Select month and year using
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	while(true)
	{
		String currentmonth=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])")).getText();
		String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(currentmonth.equals(month)&&currentyear.equals(year)) 
		{
			break;
		}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
       driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//table//tr//a[@data-date='"+date+"']")).click(); 
       // instead we can directly enter the date above as date-date='8'
       //div[@id='ui-datepicker-div']//table//tr//a]-- it would capture all dates, we can use enhanced for loop as well
	}

}
