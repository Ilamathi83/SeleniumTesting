package day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class XPath_Locator {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		
		// xpath with single attributes
		
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Hi Ilamathi");     
		
		// xpath with multiple attributes
		
		//driver.findElement(By.xpath("//input[@placeholder='Search'][@type='text']")).sendKeys("Hey there");
		
		// xpath using and or
		//driver.findElement(By.xpath("//input[@placeholder='Search' and @type='text']")).sendKeys("Hey there");  // all attributes should match
		//driver.findElement(By.xpath("//input[@placeholder='Search' or @type='Text']")).sendKeys("Hey there");  // here second one is wrong , but able to locate the element
	
		// xpath with text() -- inner text
		
		//driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).click();
	    //boolean display=driver.findElement(By.xpath("//h3[normalize-space()='Featured']")).isDisplayed();
	    //System.out.println(display);
		
		String value=driver.findElement(By.xpath("//h3[normalize-space()='Featured']")).getText();
	    System.out.println(value);
		
		// xpath with contains
		//driver.findElement(By.xpath("//input[contains(@placeholder,'arch')]")).sendKeys("Hi Ilamathi");
		
		// xpath with starts-with
	    // driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Vanakkam");
		
		// chained xpath    //div[@id='logo]/a/img-- which is a combination of relative and absolute xpath
		// if the attributes is not find we can use chained xpath
		
		boolean image= driver.findElement(By.xpath("//div[@class='image']/a/img")).isDisplayed();
		System.out.println(image);
	}

}
