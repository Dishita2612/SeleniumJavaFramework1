import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest_01 {
	public static void main (String args[])
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath: " +projectPath);
		//System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.ie.driver", projectPath+ "/drivers/IE Driver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://amazon.com");
	}
}