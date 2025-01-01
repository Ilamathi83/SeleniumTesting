package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	/**driver.get("https://dummy-tickets.com/buyticket");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[normalize-space()='Both']")).click();
	driver.findElement(By.xpath("//form[@id='both_oneway']//div[@class='col-sm-12 p-0 suggestion-container']//input[@name='source")).click();
	//fromcity.click();
	//fromcity.sendKeys("Banga");
	//driver.findElement(By.xpath("//p[normalize-space()='HAL Bangalore International Airport,']")).click();
	
	//driver.findElement(By.xpath("//form[@id='both_oneway']//div[@class='col-sm-12 p-0 suggestion-container']//input[@name='destination")).sendKeys("hyd");
	//driver.findElement(By.xpath("//div[normalize-space()='Hyderabad']")).click();**/
	
	driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("product_549")).click();
	driver.findElement(By.id("travname")).sendKeys("Ilamathi");
	driver.findElement(By.id("travlastname")).sendKeys("Senthamizh");
	driver.findElement(By.id("dob")).click();
	WebElement year=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
	Select expectedyear=new Select(year);
	expectedyear.selectByValue("2023");
	WebElement month=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
	Select expectedmonth=new Select(month);
	expectedmonth.selectByValue("2");
	driver.findElement(By.xpath("//a[normalize-space()='8']")).click();
	driver.findElement(By.xpath("//input[@id='sex_2']")).click();
	driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Hyderabad");
	driver.findElement(By.xpath("//input[@id='departon']")).click();
	WebElement departyear=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
	Select arrivalyear=new Select(departyear);
    arrivalyear.selectByValue("2025");
	WebElement departmonth=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
	Select arrivalmonth=new Select(departmonth);
	arrivalmonth.selectByValue("2");
	driver.findElement(By.xpath("//a[normalize-space()='8']")).click();
	
	}

}
