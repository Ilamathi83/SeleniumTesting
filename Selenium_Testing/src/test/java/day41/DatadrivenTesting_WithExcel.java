package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatadrivenTesting_WithExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		
		String doc=System.getProperty("user.dir")+"\\Test data\\Sample.xlsx";	
		int rows=Excelutilities.getRowcount(doc,"Sample");
		 for(int i=1;i<=rows;i++)
		 {
			String val1=Excelutilities.getCelldata(doc,"Sample", i, 0) ;
			String val2=Excelutilities.getCelldata(doc,"Sample", i, 1) ;
			String val3=Excelutilities.getCelldata(doc,"Sample", i, 2) ;
			String val4=Excelutilities.getCelldata(doc,"Sample", i, 3) ;
			String val5=Excelutilities.getCelldata(doc,"Sample", i, 4) ;
			
			WebElement inp1 = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
			inp1.clear();
			inp1.sendKeys(val1);
			WebElement inp2=driver.findElement(By.xpath("//input[@id='mat-input-1']"));
			inp2.clear();
			inp2.sendKeys(val2);
			WebElement inp3=driver.findElement(By.xpath("//input[@id='mat-input-2']"));
			inp3.clear();
			inp3.sendKeys(val3);
			
			Select drpdown=new Select(driver.findElement(By.xpath("//div[@id='mat-select-value-0']")));
			drpdown.selectByVisibleText(val4);
			
		String value=driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
		
		if(Double.parseDouble(val5)==Double.parseDouble(value))
		{
		Excelutilities.setCelldata(doc, "Sample",i,7,"Passed");
		Excelutilities.fillgreencolour(doc, "Sample",i,7);
		}
		else
		{
			Excelutilities.setCelldata(doc, "Sample",i,7,"Failed");
			Excelutilities.fillredcolour(doc, "Sample",i,7);	
		}
		Thread.sleep(3000);
		 }
      driver.quit();
	}

}
