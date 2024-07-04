package notes;

import org.openqa.selenium.BuildInfo;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CheckVersion {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		System.out.println(driver.getClass().getPackage().getImplementationVersion());

		Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
		System.out.println(capabilities.getBrowserVersion());

		BuildInfo buildInfo = new BuildInfo();
		System.out.println(buildInfo.getReleaseLabel());
		
		driver.quit();
	}

}
