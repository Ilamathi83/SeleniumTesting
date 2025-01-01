package day39;


import java.io.IOException;
import java.net.URL;

import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks_Demo {

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement>Links=(List<WebElement>) driver.findElement(By.tagName("a"));
		System.out.println(Links.size());
		
		int brokenlinkssize = 0;
		
		for(WebElement linkElement:Links)
		{
		String Hrefvalue = linkElement.getAttribute("href");
			if(Hrefvalue==null || Hrefvalue.isEmpty())
					{
				System.out.println("value is empty");
				continue;
					}
		URL linkurl=new URL(Hrefvalue);
		HttpsURLConnection connect = (HttpsURLConnection) linkurl.openConnection();
	    connect.connect();
	    if(connect.getResponseCode() >=400)
	    {
	    	System.out.println("Link is broken");
	    	brokenlinkssize++;
	    }
	    else
	    {
	    	System.out.println("Link is not broken");
	    }
	    
		}
		
		

	}

}
