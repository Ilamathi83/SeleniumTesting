package day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Homework {

	public static void main(String[] args) {
		 WebDriver driver =new EdgeDriver();
		 driver.get("https://demo.opencart.com/");
		 driver.manage().window().maximize();
		 
		 // tag id
		 
		//driver.findElement(By.cssSelector("#header-cart")).sendKeys("Hey There!");  -- Id element not found in this website but this is the syntax
		 
		 // tag class
		 
		 //driver.findElement(By.cssSelector(".form-control")).sendKeys("Hi Ilamathi");

		 // tag attribute
		 
		 //driver.findElement(By.cssSelector("input[name='search']")).sendKeys("Hi Ilamathi");
		 
		 // tag class attribute
		 
		 driver.findElement(By.cssSelector(".form-control[placeholder='Search']")).sendKeys("enna venum podu");
		 
	}

} 