package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		System.out.println("Testing started...");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com");
		
		// WebElement searchBox = driver.findElement(By.id("search"));
		// searchBox.sendKeys("Hoodie");
		
		// send keys are used to enter text
		driver.findElement(By.id("search")).sendKeys("Hoodie");
		
		// search by image
		boolean status = driver.findElement(By.className("logo")).isDisplayed();
		System.out.println("Logo status : " + status);
		
		// search by text/title
		driver.findElement(By.linkText("What's New")).click();
		driver.findElement(By.partialLinkText("Hoodies"));
		
		// search multiple elements
		List<WebElement> headerLinks = driver.findElements(By.className("level0"));
		System.out.println("No of header links: " + headerLinks.size());
		
		// search all tags
		List<WebElement> tagLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no of tag links: " + tagLinks.size());
		
		// search all images
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total no of images : " + images.size());
		
		// NoSuchElementException
		// driver.findElement(By.id("xyz"));
		
		// will return 0
		// driver.findElements(By.className("xyz"));
		
		// all test passed message
		System.out.println("All tests passed !");
		driver.quit();
		System.out.println("Testing terminated...");
	}

}
