import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowserTest_02 {
	public static void main (String args[])
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bhushan\\Documents\\Automation Testing 2020\\Test_Eclipse_WorksSpace01\\SeleniumJavaFramework_01\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
	}

}