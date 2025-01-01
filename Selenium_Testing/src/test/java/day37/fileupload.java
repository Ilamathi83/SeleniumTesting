package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class fileupload {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("\"C:\\Users\\i.senthamizhkoman\\Downloads\\Ilamathi Senthamizhkoman_Resume.docx\"");
		
	}
	
}
