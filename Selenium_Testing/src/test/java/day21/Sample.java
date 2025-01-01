package day21;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample {

	public static void main(String[] args) {
	WebDriver driver =new EdgeDriver();
	driver.get("https://demo.opencart.com/");        // open URL
	driver.manage().window().maximize();             // to maximize the window
    String s=driver.getTitle();
    if(s.equals("Your Store"))                       
    {
    	System.out.println("Test Passed");
    }
    else
    {
    	System.out.println("Test Failed");
    }
    driver.quit();                                        // to close the window
	}

}
