package SeleniumTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestNG_ExtentReports 
{
	ExtentReports extent;
	static WebDriver driver = null;
	ExtentTest testDT = extent.createTest("Amazon Search","My first selenium test script");
	//Before Test-Setup Browser
	@BeforeSuite
	public void SetupBrowser()
	{
		// initialize the HtmlReporter
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reports
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	//Test- Perform Test operation
	@Test
	public void performtest()
	{
		//Creating Tests

		//Navigate to URL
		testDT.log(Status.INFO, "Open the browser and navigate to URL Amazon.com");
		driver.get("https://Amazon.com");
		testDT.pass("Chrome browser opened and it navigated to Amazon.com successfully");

		//Type in the search field
		testDT.log(Status.INFO, "Enter text in search field");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple watch Series 5");
		testDT.pass("Apple watch series 5 entered successfully");

		//Hit Enter on Search field
		testDT.log(Status.INFO, "Click on Search icon or hit the enter button");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
		testDT.pass("Clicked on search icon and it displayed search result as per the given text successfully");
	}

	//After Test- Print the message 
	@AfterTest
	public void print()
	{
		testDT.info("Test Completed successfully");
	}
}
