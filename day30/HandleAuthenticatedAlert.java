package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// syntax
		// https://username:password@URL
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();

		try {
			WebElement result = driver.findElement(By.cssSelector("div[class='example'] p"));
			System.out.println(result.getText());
		} catch (NoSuchElementException e) {
			System.out.println("Use correct credntials");
		}

		driver.quit();
	}
}