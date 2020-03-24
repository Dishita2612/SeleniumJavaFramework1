import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest_01 
{
	public static void main (String args[])
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath: " +projectPath);
		System.setProperty("webdriver.ie.driver", projectPath+ "/drivers/IE Driver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://amazon.com");
	}
}
