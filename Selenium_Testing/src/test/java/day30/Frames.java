package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args) {
	 WebDriver driver=new EdgeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://ui.vision/demo/webtest/frames/");
	 driver.manage().window().maximize();
	 
	 /* since we are trying to pass the element in frame,we should switch to iFrame first
	   3 different flavours to switch to IFrame
	   driver.switchto().frame(name);
	   driver.switchto().frame(id);
	   driver.switchto().frame(WebElement);
	   driver.switchto().frame(Index);
	 */
   WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
   driver.switchTo().frame(frame1);
   driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hi Mathi");
   
   driver.switchTo().defaultContent(); //to go back to the page so that we don't need to enter new page, actions can be performed in the same page
    
   WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
   driver.switchTo().frame(frame2);
   driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hey there");
	 
	}

}
