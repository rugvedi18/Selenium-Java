package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// Select Sunday
//		WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']"));
//		if (!checkbox.isSelected()) {
//			checkbox.click();
//			System.out.println("Sunday is selected: " + checkbox.isSelected());
//		}

		// Count number of check boxes for days
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		System.out.println("No of days: " + checkboxes.size());

		// Select all check boxes using for loop
		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}

		// Select all check boxes using for enhanced for loop
		for (WebElement chkbox : checkboxes) {
			chkbox.click();
		}

		// Select last 3 checkboxes
		for (int i = 4; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		System.out.println("Last 3 checkboxes selected");

		// Select first 3 checkboxes
		for (int i = 0; i < 3; i++) {
			checkboxes.get(i).click();
		}
		System.out.println("First 3 checkboxes selected");

		// Select wich are not selected, unselct which are selected
		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		System.out.println("Wednesday selected");

		// driver.quit();
	}
}
