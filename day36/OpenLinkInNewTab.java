package day36;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		// key board actions
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		
		WebElement seleniumTrainingLink = driver.findElement(By.xpath("//img[@alt='Selenium Online Training']"));
		
		Actions act = new Actions(driver);
		
		// contorl + click opens page in new tab
		act.keyDown(Keys.CONTROL).click(seleniumTrainingLink).keyUp(Keys.CONTROL).perform();
		
		// switch to newly open page
		List<String> ids = new ArrayList<String>(driver.getWindowHandles()); // list has index concept
		driver.switchTo().window(ids.get(1));
		
		// search on new page
		driver.findElement(By.xpath("//input[@class='navbar__search--input']")).sendKeys("jmeter");
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		// go to back page
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).click();
	}

}
