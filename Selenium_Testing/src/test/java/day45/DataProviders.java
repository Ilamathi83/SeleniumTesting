package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	
	@Test(dataProvider="dp")
	void action(String mail, String passwrd)
	{
	WebDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();

	driver.findElement(By.name("username")).sendKeys(mail);
	driver.findElement(By.name("password")).sendKeys(passwrd);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
	
	@DataProvider(name="dp")
	Object[][] logindata()
	{
		Object data[][]= {
				{"mathi","mathi123"},
				{"iss","iss123"},
				{"Admin","admin123"}
		                  };
		return data;
	}
	
		
}
