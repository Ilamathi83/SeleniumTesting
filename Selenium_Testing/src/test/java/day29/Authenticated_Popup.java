package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Authenticated_Popup {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth"); // if you enter this it will open the page with alert window
		// instead of above URl, we can pass the values in the URL itself so that it will open the window
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
