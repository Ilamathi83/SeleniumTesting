package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Conditional_Method {

	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		// 1. is display()
		boolean display= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println(display);
        
        //another way
        
		//WebElement display=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println(display.isDisplayed());
		
        //2. is enabled
        
		boolean box=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println(box);
        
        // 3. is selected
        
       WebElement checkbox=driver.findElement(By.xpath("//input[@id='gender-female']"));
       System.out.println(checkbox.isSelected());
       checkbox.click();                   // it will return true if you perform the click action else it will be false
       System.out.println(checkbox.isSelected());
       
       boolean check=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
        System.out.println(check);           // it will return true as it selected by default in the browser
	}

}
