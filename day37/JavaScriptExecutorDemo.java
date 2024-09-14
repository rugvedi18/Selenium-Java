package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// JavaScriptExecutor - is an interface

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 	// *ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();

		 WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		// when we get element intercepted exception use javascript executor, need to typecast as WebDriver and JavascriptExecutor are different interfaces
		
		 // passing the text into inputbox - alternate of sendKeys()
		JavascriptExecutor js = (JavascriptExecutor) driver; // *JavascriptExecutor js = driver;
		js.executeScript("arguments[0].setAttribute('value', 'John')", inputbox);
		
		// clicking the element - alternate of java click()
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radiobtn);

	}

}
