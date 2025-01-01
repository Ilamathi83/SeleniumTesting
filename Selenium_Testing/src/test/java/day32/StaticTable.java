package day32;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v126.systeminfo.SystemInfo;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticTable {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://blazedemo.com/");
	driver.manage().window().maximize();
	
	WebElement drpdowncity=driver.findElement(By.xpath("//select[@name='fromPort']"));
	Select City=new Select(drpdowncity); 
	City.selectByValue("Mexico City");
	
	WebElement drpdowncity2=driver.findElement(By.xpath("//select[@name='toPort']"));
	Select City2=new Select(drpdowncity2); 
	City2.selectByValue("New York");
	
	driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
    /**for(int r=1;r<7;r++)
    {
    String amt=driver.findElement(By.xpath("//table//tr["+r+"]//td[6]")).getText();
    System.out.println("Flight amount is "+amt);

    }**/
    driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
	driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Ilamathi");
	driver.findElement(By.xpath("//input[@id='address']")).sendKeys("No 7, Israel street");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Palestine");
	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("America");
	driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("944551");
	WebElement Cardtype=driver.findElement(By.xpath("//select[@id='cardType']"));
	Select Card=new Select(Cardtype); 
	Card.selectByValue("amex");
	driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("123321");
	driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Ilamathi S");
	driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	String Thanksmsg=driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
    System.out.println(Thanksmsg);
    driver.close();
	}

}
