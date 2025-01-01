package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshots {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		// 1. full page screenshot
   /**  TakesScreenshot ts=(TakesScreenshot)driver;
        File Sourcefile=ts.getScreenshotAs(OutputType.FILE);
      File targetfile=new File(System.getProperty("user.dir")+"\\Screenshot\\page.png");
      // File targetfile=new File("C:\\Program Files\\Java\\SeleniumWebdriver\\Selenium_Testing\\Screenshot\\fullpage.png");
       Sourcefile.renameTo(targetfile);  **/
		
		// 2. specific part screenshot
		WebElement Giftcard=driver.findElement(By.xpath("//div[@class='page-body']//div[1]//div[1]//div[2]//div[3]"));
		File captured_SS=Giftcard.getScreenshotAs(OutputType.FILE);
		File taken_SS=new File(System.getProperty("user.dir")+"\\Screenshot\\card.png");
		captured_SS.renameTo(taken_SS);
		
		driver.quit();
		
	}

}
