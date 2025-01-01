package day25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;
public class Xpath_Axes {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		// 1. self-- select the current node/context element
		
		String node =driver.findElement(By.xpath("//a[contains(text(),'Zomato')]/self::a")).getText();
		System.out.println("self node is "+ node);
		
		// parent node
		
		node=driver.findElement(By.xpath("//a[contains(text(),'Zomato')]/parent::*")).getText();
		System.out.println("Parent node is "+node);
		
		// children-select all children of current node
		
		List<WebElement>children=driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr"));
		System.out.println("size of children "+ children.size());
		
		// ancestor
		
		node=driver.findElement(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr")).getText();
		System.out.println("Ancestor node is "+ node);
		
		//descendants
		
		List<WebElement>desc=driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/descendant::*"));
		System.out.println("size of descendant children "+ desc.size());
		
		// following 
		
		List<WebElement>following=driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/following::tr"));
		System.out.println("size of folowing children "+ following.size());
		
		// preceding
		
	    List<WebElement>preceding=driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/preceding::tr"));
		System.out.println("size of folowing children "+ preceding.size());
		
		// following sibling
		
		List<WebElement> followsib=driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/following-sibling::tr"));
		System.out.println("size of folowing children "+ followsib.size());
		
		// preceding sibling
		
		List<WebElement> precedsib=driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("size of folowing children "+ precedsib.size());
		
		driver.quit();
	}

}
