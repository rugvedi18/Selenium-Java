package day30;

//1. Normal alert with OK button - jsAlert()
//2. Confirmation alert with OK and Cancel button - jsConfirm()
//3. Prompt alert with input box - jsPrompt()

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		System.out.println("Title: " + driver.getTitle());

		// 1. Normal alert with OK button
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		driver.switchTo().alert().accept();

		WebElement resultAlert1 = driver
				.findElement(By.xpath("//p[@id='result' and contains(text(), 'You successfully clicked an alert')]"));

		if (resultAlert1.isDisplayed()) {
			System.out.println("Alert 1: " + resultAlert1.getText());
		} else {
			System.out.println("Result: Test failed");
		}

		// 2. Confirmation alert with OK and Cancel button
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		driver.switchTo().alert().accept();
		WebElement resultAlert2 = driver
				.findElement(By.xpath("//p[@id='result' and contains(text(), 'You clicked: Ok')]"));

		if (resultAlert2.isDisplayed()) {
			System.out.println("Alert 2: " + resultAlert2.getText());
		} else {
			System.out.println("Result: Test failed");
		}

		// Cancel button
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		driver.switchTo().alert().dismiss();
		WebElement resultAlertCancel = driver
				.findElement(By.xpath("//p[@id='result' and contains(text(), 'You clicked: Cancel')]"));

		if (resultAlertCancel.isDisplayed()) {
			System.out.println("Alert 2: " + resultAlertCancel.getText());
		} else {
			System.out.println("Result: Test failed");
		}

		// 3. Prompt alert with input box
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("John");
		promptAlert.accept();
		String resultAlert3 = driver.findElement(By.xpath("//p[@id='result']")).getText();

		if (resultAlert3.contains("John")) {
			System.out.println("Alert 3: " + resultAlert3);
		} else {
			System.out.println("Result: Test failed");
		}

		driver.quit();
	}
}
