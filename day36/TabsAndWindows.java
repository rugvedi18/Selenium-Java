package day36;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		// driver.switchTo().newWindow(WindowType.TAB); // opens other url in new tab
		driver.switchTo().newWindow(WindowType.WINDOW); // opens other url in new window
		
		driver.get("https://orangehrm.com/");
		
		driver.quit();
	}

}
