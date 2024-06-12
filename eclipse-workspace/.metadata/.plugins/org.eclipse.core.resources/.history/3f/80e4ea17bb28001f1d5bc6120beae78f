package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractice {

	public static void main(String[] args) {
		System.out.println("Program started...");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://atharvacm.netlify.app/");
		
		driver.findElement(By.xpath("//a[text()='About']"));
		
		String aboutMe = driver.findElement(By.xpath("//h2[text()='About Me']")).getText();
		System.out.println(aboutMe);
		
		Boolean img = driver.findElement(By.cssSelector(".image")).isDisplayed();
		System.out.println("image: " + img);
		
		driver.quit();
		System.out.println("Program terminated...");
	}

}

// handling dynamic attributes
// e.g one button is for start and stop (id=start, id=stop), you have to click on both the cases

//*[@id='start' or @id='stop'].click()
//*[contains(@id, 'st')].click()
//*[starts-with(@id, 'st')].click()