package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragg_drop {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	   WebElement Acc1=	driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
	   WebElement holder1=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
       WebElement Acc2=	driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
	   WebElement holder2=driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
	   WebElement am1=	driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
	   WebElement holder3=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
	   WebElement am2=	driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
	   WebElement holder4=driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		Actions act=new Actions(driver);               
		act.dragAndDrop(Acc1,holder1).perform();
		act.dragAndDrop(Acc2, holder2).perform();
		act.dragAndDrop(am1,holder3).perform();
		act.dragAndDrop(am2, holder4).perform();
		String output=driver.findElement(By.xpath("//a[normalize-space()='Perfect!']")).getText();
		System.out.println(output);

	}
	
	

}
