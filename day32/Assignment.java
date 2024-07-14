package day32;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// Find lowest price in a table, fill the form, validate msg
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();

		WebElement depCities = driver.findElement(By.xpath("//select[@name='fromPort']"));
		depCities.click();
		Select depCity = new Select(depCities);
		depCity.selectByValue("Boston");

		WebElement desCities = driver.findElement(By.xpath("//select[@name='toPort']"));
		desCities.click();
		Select desCity = new Select(desCities);
		desCity.selectByValue("London");

		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

		List<String> prices = new ArrayList<>();
		for (int r = 1; r <= 5; r++) { // Adjust loop index to 5 to cover all rows
			String price = driver.findElement(By.xpath("//table//tr[" + r + "]//td[6]")).getText();
			prices.add(price);
		}

		String lowestPrice = prices.get(0);
		for (String price : prices) {
			if (price.compareTo(lowestPrice) < 0) {
				lowestPrice = price;
			}
		}

		System.out.println("The lowest price string is: " + lowestPrice);

		// Click on the corresponding "Choose This Flight" button
		for (int r = 1; r <= 5; r++) { // Adjust loop index to 5 to cover all rows
			String match = driver.findElement(By.xpath("//table//tr[" + r + "]//td[6]")).getText();
			if (lowestPrice.equals(match)) {
				driver.findElement(By.xpath("//table//tr[" + r + "]//td[1]//input")).click(); // Click the button in the
																								// first column
				break;
			}
		}

		System.out.println("Expected title: " + driver
				.findElement(By.xpath("//h2[normalize-space()='Your flight from TLV to SFO has been reserved.']"))
				.getText().equals("Your flight from TLV to SFO has been reserved."));

		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		System.out.println(
				driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText());

		driver.quit();
	}
}
