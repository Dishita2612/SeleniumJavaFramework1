package SeleniumTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Demo2 
{
	static WebDriver driver = null;
	
	@BeforeTest
	//Setup Browser driver
	public void setupbrowser()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	//Enter Text and click search button
	public static void SeleniumGoogleSearch()
	{
		//Go to Amazon.com
		driver.get("https://amazon.com");
		//Search for Fitbit versa 2- Enter text in text box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple watch series 5");
		//Hit Enter on Search field
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
		//Print message on console
		System.out.println("Script executed successfully");
		}
	
	
	@AfterTest
	//Close the browser and print message
	public void print()
	{
		System.out.println("Test NG Demo successfull");
		//driver.close();
	}

}
