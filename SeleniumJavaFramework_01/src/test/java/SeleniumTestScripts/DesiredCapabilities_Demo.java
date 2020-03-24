package SeleniumTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		
		//Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings",true);
		
		System.setProperty("webdriver.ie.driver", projectPath+ "/drivers/IE Driver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);
		driver.get("https://Amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple watch Series 5");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
	}

}
