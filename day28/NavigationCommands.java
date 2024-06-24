package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// Navigation commands
		// navigate().to, back(), forward(), refresh()

		System.out.println("Program started..");

		WebDriver driver = new ChromeDriver();
		
		// driver.get("https://demo.nopcommerce.com"); // get accepts URL only in the string format
		
		// navigate.to() - internally calls get method
		// if navigate.to has object parameter then it converts it into string and then passes to get as get method only accepts string format
		
		driver.navigate().to("https://demo.nopcommerce.com"); // accepts string format

		// URL myurl = new URL("https://demo.nopcommerce.com"); // throws MalformedURLException
		// driver.navigate().to(myurl); // accepts URL object format
		
		driver.findElement(By.cssSelector(".ico-register")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.quit();
		
		System.out.println("Program ended..");
	}

}
