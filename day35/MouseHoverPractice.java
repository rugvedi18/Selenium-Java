package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.manage().window().maximize();
		
		WebElement teachersHub = driver.findElement(By.xpath("//a[@class='no_border'][contains(text(),'Tester’s Hub')]"));
		WebElement demoTestingsite = driver.findElement(By.xpath("//span[normalize-space()='Demo Testing Site']"));
		WebElement alertBox = driver.findElement(By.xpath("//li[@id='menu-item-2834']//a"));
		
		Actions act = new Actions(driver);
		// mouse over - movetoElement
		act.moveToElement(teachersHub).moveToElement(demoTestingsite).moveToElement(alertBox).click().perform(); // perform will call build method first

	}

}
