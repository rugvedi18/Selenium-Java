package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry = new Select(drpCountryEle);

		// drpCountry.selectByVisibleText("India");
		// drpCountry.selectByValue("germany");
		drpCountry.selectByIndex(4); // France

		// To get all dropdown options from list as a Webelement
		List<WebElement> options = drpCountry.getOptions();
		System.out.println("No of options in drop down: " + options.size());

		// Printing the options in list - normal for loop
//		for (int i = 0; i < options.size(); i++) {
//			System.out.println(options.get(i).getText());
//		}

		// Printing the options in list - enhanced for loop
		for (WebElement op : options) {
			System.out.println(op.getText());
		}

		driver.quit();
	}
}
