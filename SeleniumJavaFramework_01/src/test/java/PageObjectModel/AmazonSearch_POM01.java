package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AmazonSearch_POM01
{
	WebDriver driver = null;
	By textboxsearch = By.id("twotabsearchtextbox");
	By clicksearchbutton = By.className("nav-input");
	
	public AmazonSearch_POM01(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void EnterText(String text)
	{
		driver.findElement(textboxsearch).sendKeys(text);
	}
	
	public void ClickSearch()
	{
		driver.findElement(clicksearchbutton).sendKeys(Keys.RETURN);
	}
}
