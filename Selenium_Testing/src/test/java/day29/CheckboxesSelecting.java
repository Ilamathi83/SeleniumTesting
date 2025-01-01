package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckboxesSelecting {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		// 1. select specific checkbox
		
		//driver.findElement(By.xpath("//label[normalize-space()='Train with Available Berth']")).click();
		
		//2. selecting all checkboxes
		
		//List<WebElement> Checkboxes= driver.findElements(By.xpath("//div[@class='col-xs-12 remove-padding']//div[@class='col-xs-12 remove-padding']"));
		//for(WebElement Checkbox:Checkboxes)
		//{
			//Checkbox.click();
		//}
		
		
		/*for(int i=1;i<3;i++)
		{
			Checkboxes.get(i).click();
			//driver.switchTo().alert().accept();
		}*/
		//driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']"))
		
		
		
	}
	

}
