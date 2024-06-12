package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		
		System.out.println("Program started...");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// XPath with single attribute, syntax - //tagName[attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("Tshirt");
		driver.findElement(By.xpath("//img[@title='Show details for Apple MacBook Pro 13-inch']"));
		
		// XPath with multiple attributes
		driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("tshirt");
		
		//input[@name='q' and @placeholder='Search store'] both attributes should match
		//input[@name='q' or @placeholder='Search store'] at least one attribute should match
		
		// XPath with text - inner text
		// String title = driver.findElement(By.xpath("//*[text()='Welcome to our store']")).getText();
		String title = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText(); // to get inner text
		System.out.println(title);
		
		// XPath with link text
		driver.findElement(By.xpath("//a[text()='Computers ']"));
		
		// XPath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Sea')]")).sendKeys("tshirt");
		
		// XPath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("tshirt");
		
		// chained XPath - combination of relative and absolute XPath (search for parent element if child element don't have attributes)
		//div[@id='logo']/a/img
		driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).click();
		
		driver.quit();
		System.out.println("Program terminated...");		
	}

}
