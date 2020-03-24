package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModel.AmazonSearchPage;  //Important to import AmazonSearchPage to call functions from there


public class GoogleSearch_POM {

	private static WebDriver driver = null;
	public static void main(String[] args) 
	{
		SeleniumGoogleSearch();

	}
	
	public static void SeleniumGoogleSearch()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		//Go to Amazon.com
		driver.get("https://amazon.com");
		//Call function 'textboxsearch' from AmazonSearchPage script
		AmazonSearchPage.textboxsearch(driver).sendKeys("Fitbit versa 2");
		//Call function 'clicksearchbutton' from AmazonSearchPage script
		AmazonSearchPage.clicksearchbutton(driver).sendKeys(Keys.RETURN);
		//Print message on console
		System.out.println("Script executed successfully");
		}

}
