package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		System.out.println("Testing started...");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		// Open a new window by clicking on the link
		driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).click();

		Set<String> windowIds = driver.getWindowHandles();

		// Convert the set to a list to access the windows by index
		List<String> windowList = new ArrayList<>(windowIds);

		String parentId = windowList.get(0);
		String childId = windowList.get(1);

		// Approach 1

		// Switch to the child window
		driver.switchTo().window(childId);
		System.out.println("Child browser window title: " + driver.getTitle()); // Child browser title

		// Switch to the parent window
		driver.switchTo().window(parentId);
		System.out.println("Parent browser window title: " + driver.getTitle()); // Parent browser title

		// Approach 2
		for (String winId : windowIds) {
			String title = driver.switchTo().window(winId).getTitle();
			System.out.println(title);
		}

		// closing specific browser window
		for (String winid : windowIds) {
			String brwtitle = driver.switchTo().window(winid).getTitle();

			// if(brwtitle.equals("OrangeHRM") || brwtitle.equals("Human Resources
			// Management Software | OrangeHRM"))
			if (brwtitle.equals("Human Resources Management Software | OrangeHRM")) {
				driver.close();
			}

		}

		// driver.quit(); // Close both windows
		System.out.println("Testing terminated...");
	}
}
