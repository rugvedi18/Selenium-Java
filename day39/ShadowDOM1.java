package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();

		SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		WebElement shadowElement = shadow0.findElement(By.cssSelector("#shadow-element"));
		System.out.println(shadowElement.getText());

		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		WebElement nestedShadowElement = shadow1.findElement(By.cssSelector("#nested-shadow-element"));
		System.out.println(nestedShadowElement.getText());

		SearchContext shadow2 = shadow1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		WebElement multiShadowElement = shadow2.findElement(By.cssSelector("#multi-nested-shadow-element"));
		System.out.println(multiShadowElement.getText());

		driver.quit();
	}

}
