package day31;

import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
//driver.get("https://www.leafground.com");*** USE THIS PAGE FOR PRACTICE AS THIS CONTAINS ALL KIND OF ACTIONS TO WORKOUT***
	   
	// 1. Select dropdown
		
	WebElement Elements = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	Select dropdown = new Select(Elements);
	
	//select anyone option from dropdown
	
	//dropdown.selectByIndex(1); 
	dropdown.selectByVisibleText("Cypress");
	
	List<WebElement>options=dropdown.getOptions();
	System.out.println(options.size());
	
	// Printing the options
	
	for(WebElement op:options)
	{
		System.out.println(op.getText());
	}
	
	}
	
	

}
