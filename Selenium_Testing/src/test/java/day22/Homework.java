package day22;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Homework {

	public static void main(String[] args) {
     WebDriver wd=new EdgeDriver();
     wd.get("https://www.demoblaze.com/index.html");
    
     List<WebElement> links=wd.findElements(By.className("nav-item"));
     System.out.println(links.size());
     
     List<WebElement> image=wd.findElements(By.tagName("img"));
     System.out.println(image.size());
     
     wd.findElement(By.linkText("Monitors")).click();

	}

}
