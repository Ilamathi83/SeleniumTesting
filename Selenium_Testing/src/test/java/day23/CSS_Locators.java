package day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class CSS_Locators {

	public static void main(String[] args) {
	 
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
		// tag id  tag#id
	        //driver.findElement(By.cssSelector("div#header-cart")).sendKeys("Hi there");
		
		//tag name   tag.classname
		
	       	//driver.findElement(By.cssSelector("classname.sitesearch")).sendKeys("Hi Ilamathi");   // single element
		//driver.findElements(By.cssSelector(".sitesearch")).sendKeys("Hi Ilamathi");   // in tag we can locate group of element as well

	
	// tag attribute  tag[attribute='value']
		
		//driver.findElement(By.cssSelector("input[placeholder=\"Search Store\"]")).sendKeys("Hi Ilamathi");
		 // in java "" inside another "" is not supported so we are using \
	// else we can use ''eg.,'search store' so the term should be either \"Search Store\" (or) 'search store' 
		
		// tag class attribute 
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Hi");
	}

}
