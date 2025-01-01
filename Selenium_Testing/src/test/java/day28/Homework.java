package day28;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import net.bytebuddy.dynamic.scaffold.MethodGraph.NodeList;

public class Homework {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
	  WebElement SearchElement= driver.findElement(By.xpath("//input[@id='srchword']"));
	  SearchElement.sendKeys("vst");
	  Object countELement= SearchElement.findElement(By.xpath("//div[@id='sugbox']\"))"));
	System.out.println(countELement);
	}

		
	}


