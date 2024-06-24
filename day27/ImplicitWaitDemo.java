package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// to synchronize application and scripts we use wait methods
// thread is pre-defined class in java thread.sleep()
// types of wait methods - implicit, explicit, fluent wait

// thread.sleep() - not recommended because it affects performance, it's static, need to write multiple times wherever needed, time will waste if element found early
// implicit wait - applies for every line where needed, need to write only once, time will not waste as when elements found it starts next execution
// explicit wait - it works based on the time and condition

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		System.out.println("Program started..");

		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		driver.quit();
		System.out.println("Program terminated..");
	}

}
