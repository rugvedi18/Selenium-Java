package day27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetMethodsPractice {

	public static void main(String[] args) {
		System.out.println("Program started..");

		// Set the path to the ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#Wikipedia1_wikipedia-search-input")).sendKeys("red");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		String title = driver.getTitle();
		System.out.println("Title matched: " + title.equals("Automation Testing Practice"));

		WebElement name = driver.findElement(By.cssSelector("#name"));

		if (name.isEnabled()) {
			name.sendKeys("John Doe");
		}

		driver.findElement(By.cssSelector("#email")).sendKeys("johndoe2gmail.com");
		driver.findElement(By.cssSelector("#phone")).sendKeys("987878976");
		driver.findElement(By.cssSelector("#textarea")).sendKeys("ABC chowk, Pune, India");
		driver.findElement(By.cssSelector("#female")).click();

		// Find all check boxes that start with an id of 'S'
		List<WebElement> days = driver.findElements(By.xpath("//input[starts-with(@id,'s')]"));
		// Iterate over each check box and click it
		for (WebElement day : days) {
			if (!day.isSelected()) {
				day.click();
			}
		}

		// Locate the drop down element
		WebElement dropdownElement = driver.findElement(By.cssSelector("#country"));
		dropdownElement.click();
		Select dropdown = new Select(dropdownElement); // Create a Select object
		dropdown.selectByVisibleText("India"); // Select the option by visible text
		
		driver.findElement(By.cssSelector("option[value='red']")).click();

		// Close the browser
		// driver.quit();
		System.out.println("Program started..");
	}

}
