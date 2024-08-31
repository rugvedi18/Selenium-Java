package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		
		// Min slider
		WebElement slider1 = driver.findElement(By.xpath("//span[1]"));
		System.out.println("Location of the min slider at the origianl position: " + slider1.getLocation()); // (59, 250) = (x, y)
		
		act.dragAndDropBy(slider1, 100, 250).perform();
		System.out.println("Location of the slider after moving: " + slider1.getLocation()); // (158, 250) = (x, y)
		
		// Max slider
		WebElement slider2 = driver.findElement(By.xpath("//span[2]"));
		System.out.println("Location of the max slider at the original position: " + slider2.getLocation()); // (612, 250)
		
		act.dragAndDropBy(slider2, -100, 250).perform();
		System.out.println("Location of the max slider after moving: " + slider2.getLocation()); // (512, 250)
		
	}

}
