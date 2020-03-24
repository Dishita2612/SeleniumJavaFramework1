package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonSearchPage_01 {

	public static void main(String[] args) 
	{
		Amazonsearchpage();
	}
	//Create new function
		public static void Amazonsearchpage()
		{
			WebDriver driver = null;
			String projectPath = System.getProperty("user.dir");
			System.out.println("projectPath: " +projectPath);
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
			 driver = new ChromeDriver();
			 AmazonSearch_POM01 obj1 = new AmazonSearch_POM01(driver);
			 driver.get("https://Amazon.com");
			 obj1.EnterText("Fitbit Versa 2");
			 obj1.ClickSearch();
		}

	}


