package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new EdgeDriver(); 
		
		//driver.get("https://demo.nopcommerce.com/register");         accepts URL only in string format
        driver.navigate().to("https://demo.opencart.com/");   //accepted URL both in string and object format
		
		URL myurl=new URL("https://demo.nopcommerce.com/register");       // URL object used here
	    driver.navigate().to(myurl);
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
	}

}
