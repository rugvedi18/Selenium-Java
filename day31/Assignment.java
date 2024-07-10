package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {

		// 1. Select dropdown
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
//		driver.manage().window().maximize();

		// a) count total no of options
//		WebElement options = driver.findElement(By.xpath("//select[@id='country-list']"));
//		Select drpdown = new Select(options);

//		List<WebElement> countries = drpdown.getOptions();
//		System.out.println("Total no of countries: " + (countries.size() - 1));

		// b) print all the options
//		for (WebElement op : total) {
//			System.out.println(op.getText());
//		}

//		for (int i = 1; i < countries.size(); i++) {
//			System.out.println(countries.get(i).getText());
//		}

		// c) select single option
//		drpdown.selectByVisibleText("India");

		// 2. hidden dropdown -> oramgehrm -> PIM -> Employee status
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

		driver.findElement(By.xpath("(//div)[45]")).click();
		driver.findElement(By.xpath("(//span[normalize-space()='Full-Time Permanent'])[1]")).click();

		// 3. testautomationpractice.blogspot.com -> colors multiple select box

		// 4. select and hidden dropdown from google form
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get(
//				"https://docs.google.com/forms/u/0/d/e/1FAIpQLScP-K8zi-9ar0MCq93D3VIFhegSNPveBfdLqiMfTYR9Q1iSKQ/formResponse?embedded=true");
//		driver.manage().window().maximize();
//
//		driver.findElement(By.xpath("//div[@role='listbox']")).click();
//		driver.findElement(By.xpath("(//div[@role='option'])[2]")).click(); // error ElementNotInteractableException

		driver.quit();
	}

}
