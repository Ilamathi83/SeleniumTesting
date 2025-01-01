package day22;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Locatorsdemo {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();                      // to maximize the window
		
		//1. Name
		
		driver.findElement(By.name("search")).sendKeys("Hi Ilamathi");   // it will print the string in search
		
		//2. id
		 
		Boolean value=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(value);
		
		//3. linktext and partial linktext
		
		 //driver.findElement(By.linkText("iPhone")).click();             
		//driver.findElement(By.partialLinkText("ipho")).click();           // we can just enter the portion of the text
		//partial link text may match with multiple values and can cause conflicts so it is preferable to use linktext
		
		List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item")); 
	    System.out.println("Total no of header is "+headerlinks.size());
		
		List<WebElement> Taglinks=driver.findElements(By.tagName("img")); 
		System.out.println("Total no of Tag is "+Taglinks.size());
	}

}
