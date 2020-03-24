package SeleniumTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch_ST01 {

	public static void main(String[] args) 
	{
		SeleniumGoogleSearch();

	}
	
	public static void SeleniumGoogleSearch()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Go to Amazon.com
		driver.get("https://amazon.com");
		//Search for Fitbit versa 2- Enter text in text box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple watch Series 5");
		//Hit Enter on Search field
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
		//Print message on console
		System.out.println("Script executed successfully");
		}

}
