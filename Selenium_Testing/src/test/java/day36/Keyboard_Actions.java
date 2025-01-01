package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) {
	        WebDriver driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://jqueryui.com/");
			driver.manage().window().maximize();
			WebElement newtab=driver.findElement(By.xpath("//a[normalize-space()='API Documentation']"));
			Actions act=new Actions(driver);
			act.keyDown(Keys.CONTROL).click(newtab).keyUp(Keys.CONTROL).perform();	
			List<String> windows=(ArrayList) driver.getWindowHandles();
            driver.switchTo().window(windows.get(1));
	}

}
