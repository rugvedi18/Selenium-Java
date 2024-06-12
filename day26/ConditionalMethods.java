package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		System.out.println("Program started..");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();

		// isDisplayed()
		WebElement logo = driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']"));
		System.out.println("Logo visible: " + logo.isDisplayed());

		// isEnabled()
		Boolean searchBox = driver.findElement(By.cssSelector("#small-searchterms")).isEnabled();
		System.out.println("Search box enabled: " + searchBox);

		// isSelected()

		WebElement genderMale = driver.findElement(By.cssSelector("#gender-male"));
		WebElement genderFemale = driver.findElement(By.cssSelector("#gender-female"));

		System.out.println("Before selection of gender - ");
		System.out.println("Female selected: " + genderMale.isSelected());
		System.out.println("Female selected: " + genderFemale.isSelected());

		System.out.println("After selection of gender - ");
		genderMale.click();
		System.out.println("Female selected: " + genderMale.isSelected());
		System.out.println("Female selected: " + genderFemale.isSelected());

		Boolean newsletter = driver.findElement(By.cssSelector("#Newsletter")).isSelected();
		System.out.println("Newsletter selected: " + newsletter);

		driver.quit();
		System.out.println("Program terminated..");
	}

}
