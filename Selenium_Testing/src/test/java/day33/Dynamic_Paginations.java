package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_Paginations {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		WebElement drpdowncity=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select City=new Select(drpdowncity); 
		City.selectByValue("Mexico City");
		
		WebElement drpdowncity2=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select City2=new Select(drpdowncity2); 
		City2.selectByValue("New York");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		int rowsize=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println(rowsize);
		for(int r=1;r<=rowsize;r++)
		{
		String Airlines=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[3]")).getText();
		System.out.println(Airlines);
		}
	}
}
