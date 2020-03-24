package SeleniumTestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo 
{

	public static void main(String[] args) throws Exception 
	{
		FieUploadTest();

	}
	
	public static void FieUploadTest() throws Exception
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("uploaded_file")).click();
		Runtime.getRuntime().exec("C:\\Users\\Bhushan\\Documents\\Automation Testing 2020\\AutoIT\\FileUpload Test.exe");
		//Runtime.getRuntime().exec("C:\\Users\\Bhushan\\Documents\\Automation Testing 2020\\AutoIT\\FileUpload Test.exe");
		//Thread.sleep(3000);
		System.out.println("Script executed successfully");
		}
}
