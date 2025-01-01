package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Homework {

	public static void main(String[] args) throws InterruptedException {
		
		// get URL
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.jotform.com/form-templates/demo-test-sample");
		/*Thread.sleep(10000);
		
		// get title of the page
		
		System.out.println(driver.getTitle());
		
		//get current url
		
		System.out.println(driver.getCurrentUrl());
		
		// get page source
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.linkText("test maker")).click();
		System.out.println(driver.getWindowHandles());*/
		
		boolean display=driver.findElement(By.xpath("//p[@id='201285891492462FormTemplate']")).isDisplayed();
		System.out.println(display);
		
		boolean enable=driver.findElement(By.xpath("//button[@class='cta-usetemplate locale w-full min-w-44 max-w-68 bg-blue-500 color-white h-12 hover:bg-blue-600 duration-200 mx-1 px-4 radius']")).isEnabled();
		System.out.println(enable);;

	}

}
